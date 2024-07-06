class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
           int n = arr.length;
        int sum=0;
        // Iterate over starting points
        for (int start = 0; start < n; start++) {
            // Iterate over ending points
            for (int end = start; end < n; end++) {
                // Print the subarray from start to end
              if((start+end)%2==0){
                  for (int k = start; k <= end; k++) {
                   sum+=arr[k];
                }
              }
            }
    }
    return sum;
}}