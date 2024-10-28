class Solution {
    public int longestSquareStreak(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        Arrays.sort(nums);
        int max=0;
        for(int num:nums){
            int root =(int)Math.sqrt(num);
            if(root*root==num && map.containsKey(root)){
                    map.put(num,map.get(root)+1);
            }else{
                map.put(num,1);
            }
            max=Math.max(max,map.get(num));

        }
        return max < 2 ?-1:max;
    }
}