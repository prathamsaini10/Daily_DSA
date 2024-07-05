class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int [] arr=new int [n/2];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n/2;i++){
            arr[i]=(nums[i]+nums[n-i-1]);
            max=Math.max(max,arr[i]);
        }
    return max;
    }
}