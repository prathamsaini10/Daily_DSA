class Solution {
    public void sortColors(int[] arr) {
      
             int low=0,mid=0,high=arr.length-1;
             while(mid<=high){
                if(arr[mid]==0){
                    swap(arr,mid,low);
                    mid++;
                    low++;
                }else if(arr[mid]==1){
                    mid++;
                }else{
                    swap(arr,mid,high);
                    high--;
                }
             }
      
    }
    void swap(int [] arr,int i,int j){
     if (i != j) {  // Only swap if i and j are different
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
        }
    }
}