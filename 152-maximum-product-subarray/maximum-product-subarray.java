class Solution {
    public int maxProduct(int[] nums) {
          int n = nums.length;
        if (n == 0) return 0;
        
        long maxProduct = nums[0];
        long minProduct = nums[0];
        long result = nums[0];
        
        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                // Swap max and min products when encountering a negative number
                long temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);
            
            result = Math.max(result, maxProduct);
        }
        
        return (int) result;
    }
}