class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
       
        while(k>0){
             int min=Integer.MAX_VALUE,n=nums.length;
            for(int i=0;i<n;i++){
                min=Math.min(min,nums[i]);
            }
            for(int j=0;j<n;j++){
                if(nums[j]==min){
                    nums[j]*=multiplier;
                    break;
                }
            }
            k--;
        }
        return nums;
    }
}