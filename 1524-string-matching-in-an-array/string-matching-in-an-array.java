class Solution {
    public List<String> stringMatching(String[] words) {
        //  List<String> ans = new ArrayList<>();
        // for (int i = 0; i < words.length; i++) {
        //     for (int j = 0; j < words.length; j++) {
        //         if (i == j) {
        //             continue;
        //         }
        //         if (words[j].contains(words[i])) {
        //             ans.add(words[i]);
        //             break;
        //         }
        //     }
        // }
        // return ans;

          List<String> list = new ArrayList<>();

        for(int i=0;i<words.length;i++){
            if(isSub(words,words[i],i)){
                list.add(words[i]);
            }
        }
        return list;

    }

    private Boolean isSub(String[] words,String word,int curr){

        for(int i=0;i<words.length;i++){
            if(i!=curr && words[i].contains(word)){
                return true;   
            }
        }

        return false;
    }
}