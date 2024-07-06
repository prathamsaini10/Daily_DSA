class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length;
        int maxarea=0;
        int l=0;
        int r=n-1;
        while(l<r){
            if(arr[l]<arr[r]){
                maxarea=Math.max(maxarea,(r-l)*arr[l]);
                l++;
            }else if(arr[l]>arr[r]){
                maxarea=Math.max(maxarea,(r-l)*arr[r]);
                r--;
            }else{
                 maxarea=Math.max(maxarea,(r-l)*arr[r]);
                 l++;
         
                 r--;
            }
            
          
        }
         return maxarea;
    }
}