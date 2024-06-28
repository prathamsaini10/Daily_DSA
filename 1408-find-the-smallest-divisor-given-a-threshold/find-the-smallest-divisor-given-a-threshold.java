class Solution {
    public int smallestDivisor(int[]arr, int t) {
        int low=1;
        int high=getmax(arr);
        
        
         while(low<high){
            int mid=low+(high-low)/2;
              if(sum(arr, mid)  > t){
               low  = mid+1;
            }
            else{
                high = mid;
            }
         }
         return low;
    }
    public int sum(int[]arr,int mid){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil((double)arr[i]/(double)mid);
        }
        return sum;
    }
     public static int getmax(int[] nums){
        int max = nums[0];
        for(int i = 0; i< nums.length ; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}