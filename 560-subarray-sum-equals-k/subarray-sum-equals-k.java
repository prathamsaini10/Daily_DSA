class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,1);
        int count=0;
         for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int remove=sum-k;
            count+=map.getOrDefault(remove,0);
               map.put(sum, map.getOrDefault(sum, 0) + 1);
         }
         return count;
    }
}