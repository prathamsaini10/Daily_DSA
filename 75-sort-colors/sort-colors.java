class Solution {
    public void sortColors(int[] arr) {
       
             for (int i=0;i<=arr.length-2;i++){
        for(int j=i+1;j>0;j--){
            if(arr[j]<arr[j-1]){
                swap(arr, j, j-1);
            }else {
                break;
            }
        }
    }
         }
         static void swap(int[] arr,int start,int last){

        int temp=arr[start];
        arr[start]=arr[last];
        arr[last]=temp;

    }
    
}