class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<items1.length;i++){
          
                map.put(items1[i][0],items1[i][1]);
            
        }
        for(int i = 0;i<items2.length;i++){

            if( map.containsKey(items2[i][0]) ){
            
                map.put(items2[i][0],map.get(items2[i][0])+ items2[i][1]);

            }else{

                map.put(items2[i][0],items2[i][1]);

            }
            
        }

          List<List<Integer>> ret = new ArrayList<>();
 for(int value: map.keySet()){

            List<Integer> list = new ArrayList<>();
            list.add(value);
            list.add(map.get(value));
            ret.add(list);

        }
     Collections.sort(ret, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0).compareTo(o2.get(0));
            }
        });
        return ret;
    }
}