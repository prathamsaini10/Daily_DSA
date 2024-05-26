class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        for(int i=0;i<arr.length;){
            int correct =arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{i++;}
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
    
    static void swap(int[] arr,int start,int last){

        int temp=arr[start];
        arr[start]=arr[last];
        arr[last]=temp;

    }

}