class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length;
    //  int count=0;
    //  int ele=0;
    //  for(int i=0;i<n;i++){
    //     if(count==0){
    //         count=1;
    //         ele=arr[i];
    //     }else if(ele==arr[i]){
    //         count++;
    //     }else count--;
    //  }
    //  int count1=0;
    //  for(int i=0;i<n;i++){
    //     if(arr[i]==ele){
    //         count1++;
    //     }
     
    //  }
    //         if(count1>(n/2)){
    //             return ele;
    //         }
    //         return -1;

    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    }
    for(Map.Entry<Integer,Integer> it:map.entrySet()){
        if(it.getValue()>(n/2)){
            return it.getKey();
        }
    
    }
        return -1;
    }
}