class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int[] arr=new int[n-k+1];
        for(int i=0;i<=n-k;i++){
              boolean flag=true;
            for(int j=i+1;j<i+k;j++){
              
                if(nums[j]!=nums[j-1]+1){
                   flag=false;
                }
            }
            if(flag){
                arr[i]=nums[i+k-1];
            }else{
                arr[i]=-1;
            }
        }
        return arr;
    }
}