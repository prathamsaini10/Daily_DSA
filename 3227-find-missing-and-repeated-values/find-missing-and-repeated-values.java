class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int [] arr=new int[2];
        int [] hashing=new int[n*n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[0].length;j++){
                hashing[grid[i][j]]+=1;
            }
        }
        for(int i=0;i<hashing.length;i++){
            if(hashing[i]==2){
                arr[0]=i;
            }
            if(hashing[i]==0){
                arr[1]=i;
            }

        }
        return arr;
    }
}