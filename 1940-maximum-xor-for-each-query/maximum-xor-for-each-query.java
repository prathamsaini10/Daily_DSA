class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
       int [] arr=new int[nums.length];
       int n=nums.length;
       arr[0]=nums[0];
       for(int i=1;i<n;i++){
        arr[i]=arr[i-1]^nums[i];
       } 
       int max=(1<<maximumBit)-1;
       for(int i=0;i<n;i++){
       nums[i]=arr[n-i-1]^max;
       }
       return nums;
    }
}