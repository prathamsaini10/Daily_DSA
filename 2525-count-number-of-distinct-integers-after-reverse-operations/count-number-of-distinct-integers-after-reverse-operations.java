class Solution {
    public int countDistinctIntegers(int[] nums) {
    Set<Integer> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
         set.add(nums[i]);
         String str=Integer.toString(nums[i]);
         StringBuilder str1=new StringBuilder(str);
         str1.reverse();
         set.add(Integer.parseInt(str1.toString()));
        }
        return set.size();
    }
}