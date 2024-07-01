class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double min = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length/2 ; i++){
            min=Math.min(min,nums[i]+nums[nums.length-i-1]);
        }
        return min/2;
    }
}