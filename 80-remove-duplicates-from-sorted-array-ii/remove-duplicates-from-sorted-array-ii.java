class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;    
        int count=0;
        int k=2;
        if(n<=2){
            return n;
        }
       for(int i=2;i<n;i++){
        if(nums[i]!=nums[k-2]){
            nums[k]=nums[i];
            k++;
        }
       }
       return k;
    }
}