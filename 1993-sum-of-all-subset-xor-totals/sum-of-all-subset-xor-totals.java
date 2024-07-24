class Solution {
    public int subsetXORSum(int[] nums) {
        int subset=1<<nums.length;
        int total =0;
         for(int i=0;i<subset;i++){
           int currXor=0;
            for(int j=0;j<nums.length;j++){
                if((i & (1<<j) )!=0){
                   currXor=(currXor^nums[j]);
                }
            }
            total+=currXor;
        }
        return total;
    }
}