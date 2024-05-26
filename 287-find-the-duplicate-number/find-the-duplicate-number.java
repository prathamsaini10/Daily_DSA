class Solution {
    public int findDuplicate(int[] arr) {
          for (int i=0;i<arr.length;){
        int correct=arr[i]-1;
        if(arr[i] != arr[correct]){
            
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;

        }else{
            i++;
        }
    }
    int a=0;
    int n=arr.length-1;
    for(int i=0;i<arr.length;i++){
        if(a==arr[n]){
            return a;
        }
        a=arr[i];
    }
        return -1;

    }
}