class Solution {
    public void moveZeroes(int[] arr) {
        int n =arr.length;
        int j=-1;
      for(int i=0;i<n;i++){
        if(arr[i]==0){
            j=i;
            break;
        }
      }
      if(j==-1){
        return;
      }
      int i=j+1;
    while(i<n&&j<n){
        if(arr[i]!=0){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
            j++;
            i++;
        }else{i++;}
      }
    }
}
      

