class Solution {
    public int reductionOperations(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
    int max=nums[n-1];
       
        int op=0;
         for(int i=n-1;i>0;i--){
              if(nums[i]!=nums[i-1]){
            
          op+=(n-i);
              
              }else{
                  continue;
              }
            
              }
          return op;  
    }
}