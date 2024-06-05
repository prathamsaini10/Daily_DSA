class Solution {
    public int maxSubArray(int[] arr) {
        int max=arr[0], sum=0,a=arr.length;

        for(int i=0;i<a;i++){
            sum+=arr[i];
           max=sum>max?sum:max;
            if(sum<0) sum=0;
        }
        return max;
    }
}