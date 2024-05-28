class Solution {
    public int[] runningSum(int[] nums) {
        int count=0;
        int[] run=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            count =count+nums[i];
             run[i]=   count;
        }
        return run;
    }

}