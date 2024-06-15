class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int[] arr=new int[2];
        int max=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]*nums[j]>max){
                    max=nums[i]*nums[j];
                    arr[0]=nums[i];
                    arr[1]=nums[j];
                }
            }
        }
        int m=(arr[0]-1)*(arr[1]-1);
        return m;
    }
}