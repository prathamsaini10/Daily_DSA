class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        for(int row=0;row<rows;row++){
            for(int col=1;col<cols;col++){
                matrix[row][col]+=matrix[row][col-1];
            }
        }
        int result=0;

        for(int startCol=0;startCol<cols;startCol++){
            for(int j=startCol;j<cols;j++){
                HashMap<Integer,Integer> map=new HashMap<>();
                int cum=0;
                map.put(0,1);
                for(int row=0;row<rows;row++){
                    cum+=matrix[row][j]-(startCol>0?matrix[row][startCol-1]:0);

                    if(map.containsKey(cum-target)){
                        result+=map.get(cum-target);
                    }
                    map.put(cum,map.getOrDefault(cum,0)+1);
                }
            }
        }
        return result;
    }
}