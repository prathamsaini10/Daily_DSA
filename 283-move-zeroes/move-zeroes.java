class Solution {
    public void moveZeroes(int[] nums) {
        int n =nums.length;
        if(n==0||n==1){
            return;
        }
     int j=-1;
     for(int i=0;i<n;i++){
        if(nums[i]==0){
            j=i;
            break;
        }
     }
     if(j==-1){
return;
     }
     for(int i=j+1;i<n;i++){
        if(nums[i]!=0){
        swap(nums,i,j);
        j++;
        }
     }
     }

       static void swap(int[] arr,int start,int last){

        int temp=arr[start];
        arr[start]=arr[last];
        arr[last]=temp;
    }

        
    
    
}
      

