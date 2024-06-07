class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> num=new ArrayList<>();
        int n=arr.length;
        int m=arr[0].length;
        int top=0;
        int right=m-1;
        int left =0;
        int bottom=n-1;
         while(top<=bottom&&left<=right){
                     for (int i = left; i <= right; i++){
                    num.add(arr[top][i]);}
    
                top++;
    
                for(int i=top;i<=bottom;i++){
                    num.add(arr[i][right]);}
                    right--;
                
                if(top<=bottom){
                for(int i=right;i>=left;i--){
                    num.add(arr[bottom][i]);}
                    bottom--;
                }
                if(left<=right){
                for(int i=bottom;i>=top;i--)
                num.add(arr[i][left]);
                left++;
                }
            }
            return num;
    
    }
}