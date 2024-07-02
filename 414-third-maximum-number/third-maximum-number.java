class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
         for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
         }
       int count=0;
         Arrays.sort(nums);
        
         int max1=max;
        for(int i=n-1;i>=0;i--){
          
           if(nums[i]<max1){
            count++;
            max1=nums[i];
            
            if(count==2){
                return max1;
            }
           }
        }
         return max;
    }
}