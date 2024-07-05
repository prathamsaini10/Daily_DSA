class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int a=0;
        int[] arr=new int[n];
        while(a<n){
            int count=0;
            for(int i=0;i<=a;i++){
                for(int j=0;j<=a;j++){
                    if(A[i]==B[j]){
                        count++;
                        break;
                    }
                }
               
            }
             arr[a]=count;
            a++;
        
        }
        return arr;
    }
}