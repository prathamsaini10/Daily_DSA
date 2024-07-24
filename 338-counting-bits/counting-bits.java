class Solution {
    public int[] countBits(int n) {
        int arr[] =new int [n+1];
      
        for(int j=0;j<=n;j++){
              int count=0;
             for(int i=0;i<31;i++){
            if((j & (1<<i))!=0)count++;
        }
        arr[j]=count;
        }
        return arr;
    }
}