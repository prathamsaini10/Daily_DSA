class Solution {
    public int[] buildArray(int[] nums) {
        int num = nums.length;
        int[] ans=new int[num];
        for(int i=0 ;i<num;i++){
                ans[i]=nums[nums[i]];
        }
        return ans;
    }
}