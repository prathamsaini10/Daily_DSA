class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
       HashMap<String,Integer> map=new HashMap<>();
       String [] S1=s1.split(" ");
       String [] S2=s2.split(" ");
       for(String it:S1){
        map.put(it,map.getOrDefault(it,0)+1);

       }
       ArrayList<String> arr=new ArrayList<>();
        for(String it:S2){
        map.put(it,map.getOrDefault(it,0)+1);
        
       }
       Set<String> key=map.keySet();
       for(String keys:key){
  if(map.get(keys)==1){
    arr.add(keys);
  }
}
 String[] array = new String[arr.size()];
        arr.toArray(array);
        return array;
    }
}