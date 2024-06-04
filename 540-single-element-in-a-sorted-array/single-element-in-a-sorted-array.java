class Solution {
    public int singleNonDuplicate(int[] nums) {
        int count=0;
        int n=nums.length;
int xor=0;

        for(int i=0;i<n;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}