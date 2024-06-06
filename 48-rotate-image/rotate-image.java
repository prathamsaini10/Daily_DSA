class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                swap(matrix,i,j);
            }
        
        }
        for(int i=0;i<n;i++){
            Reverse(matrix[i],0,n-1);
        }

    }
      static void swap(int[][] arr,int start,int last){

        int temp=arr[start][last];
        arr[start][last]=arr[last][start];
        arr[last][start]=temp;

    }
     static void Reverse(int[] arr,int start,int end){
       
        for(int i=start;i<arr.length/2;i++){
            end=arr.length-(i+1);
            int temp=arr[end];
            arr[end]=arr[i];
            arr[i]=temp;
        }
    }

}