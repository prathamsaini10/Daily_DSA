class Solution {
    public void rotate(int[] arr, int k) {
        int[] nums = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            nums[(i+k)%arr.length] = arr[i];
            // arr[i] = nums[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = nums[i];
        }
    }
}