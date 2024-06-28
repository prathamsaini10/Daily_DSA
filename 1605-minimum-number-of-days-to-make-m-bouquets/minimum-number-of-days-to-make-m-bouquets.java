class Solution {
    public int minDays(int[] arr, int m, int k) {
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        long l=(long)m*k;
   int n=arr.length;
        if(l>n)return -1;
        for(int i=0;i<n;i++){
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);
        }
        int low=min;int high= max;
        while(low<=high){
            int mid =low+(high-low)/2;
            if(possible(arr,mid,m,k)){
                high=mid-1;
            }else{
                low=mid+1;
            }
            
        }
return low;
    }
    
    public Boolean possible(int[]arr,int days,int m,int k){
        int cut=0;
        int n=arr.length;
        int no=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=days){
                cut++;

            }else{
                no+=(cut/k);
                cut=0;
            }
        }
        no+=(cut/k);
        return no>=m;
    }
}