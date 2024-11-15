class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
      int j=arr.length-1;
      while(j>0&&arr[j]>=arr[j-1]){
        j--;
      }
      int i=0,result=j;
      while(i<j&&(i==0||arr[i]>=arr[i-1])){
        while(j<arr.length&&arr[i]>arr[j]){
            j++;
        }
   
        result=Math.min(result,j-i-1);
             i++;
      }
      return result;

    }
}