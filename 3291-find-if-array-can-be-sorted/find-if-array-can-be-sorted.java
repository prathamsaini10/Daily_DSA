class Solution {
    public boolean canSortArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
               boolean swapp=false;
            for(int j=0;j<nums.length-i-1;j++){
             
                if(nums[j]<=nums[j+1]){
                    continue;
                }
           else{
                int set1 =Integer.bitCount(nums[j]);
                int set2 =Integer.bitCount(nums[j+1]);
                if(set1==set2) {
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                    swapp=true;
                }else{
                    return false;
                }
            }
           }
           if(swapp==false){
            break;
           }
        }
    return true;
    }
}