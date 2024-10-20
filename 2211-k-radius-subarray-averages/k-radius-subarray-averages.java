class Solution {
    public int[] getAverages(int[] nums, int k) {
      int n = nums.length;
    int[] arr = new int[n];
    
    // If k is 0, the average of a single element is the element itself.
    if (k == 0) return nums;
    
    // Initialize arr with -1
    for (int i = 0; i < n; i++) {
        arr[i] = -1;
    }
    
    // If the array is too small for the sliding window of size 2 * k + 1, return all -1
    if (n < 2 * k + 1) return arr;
    
    // Calculate the first window sum
    long window = 0;
    int left = 0, right = 2 * k;
    
    // Sum of the first window (from index 0 to 2 * k)
    for (int i = left; i <= right; i++) {
        window += nums[i];
    }
    
    // Set the average of the first window at index k
    arr[k] = (int) (window / (2 * k + 1));
    
    // Slide the window across the array
    for (int j = k + 1; j < n - k; j++) {
        // Update the window by subtracting the leftmost element and adding the new rightmost element
        window = window - nums[left] + nums[right + 1];
        
        // Move the window
        left++;
        right++;
        
        // Set the average for the new window center
        arr[j] = (int) (window / (2 * k + 1));
    }
    
    return arr;
    }
}