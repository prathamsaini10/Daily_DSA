class Solution {
    public int[] arrayRankTransform(int[] arr) {
       if(arr.length==0){
        return arr;
       }
        int [] num=new int[arr.length];
    int j=1;
        for(int i=0;i<arr.length;i++){
        num[i]=arr[i];
        }
         Arrays.sort(num);
        int[] arr1=new int[arr.length];
        arr1[0]=1;
        for(int i=1;i<arr.length;i++){
               if(num[i-1]==num[i]){
            arr1[i]=j;
           }else{
            j++;
             arr1[i]=j;
            
           }
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<num.length;i++){
            map.put(num[i],arr1[i]);
        }
        for(int i=0;i<arr.length;i++){
            num[i]=map.get(arr[i]);
        }
        return num;
    }
}