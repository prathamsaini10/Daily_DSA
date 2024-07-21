class Solution {
    public int[] sumZero(int n) {
            int[] nums = new int[n];
        int val = n / 2;
        int start = 0;
        int end = n - 1;

        while(end > start){
            nums[start] = -val;
            nums[end] = val;
            start++;
            end--;
            val--;
        }
        return nums;
    }
}