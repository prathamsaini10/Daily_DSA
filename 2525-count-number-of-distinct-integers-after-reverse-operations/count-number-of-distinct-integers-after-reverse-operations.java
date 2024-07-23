class Solution {
    public int countDistinctIntegers(int[] nums) {
    // Set<Integer> set=new HashSet<>();

    //     for(int i=0;i<nums.length;i++){
    //      set.add(nums[i]);
    //      String str=Integer.toString(nums[i]);
    //      StringBuilder str1=new StringBuilder(str);
    //      str1.reverse();
    //      set.add(Integer.parseInt(str1.toString()));
    //     }
    //     return set.size();

    HashSet<Integer> s = new HashSet<>();
        for(int i = 0 ; i<nums.length ; i++){
            s.add(nums[i]);
            int rev = revNumber(nums[i]);
            s.add(rev);
        }
        return s.size();
    }
    public int revNumber(int num){
        int rev = 0;
        while(num != 0){
            rev = rev * 10 + num%10;
            num = num/10;
        }
        return rev;
    }
}