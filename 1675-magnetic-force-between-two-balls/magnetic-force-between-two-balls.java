class Solution {
    public int maxDistance(int[] position, int m) {
      Arrays.sort(position);
      int ans=0;
      int s=0,e=position[position.length-1];
      while(s<=e){
        int mid=s+(e-s)/2;
        if(placement(position,m,mid)){
            ans=mid;
            s=mid+1;
        }else{
            e=mid-1;
        }
      }
      return ans;
    }
    public boolean placement(int[] arr,int m,int mid){
        int count=1;
        int last=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]-last>=mid){
                last=arr[i];
                count++;
            }
        }
        return count>=m;
    }
}