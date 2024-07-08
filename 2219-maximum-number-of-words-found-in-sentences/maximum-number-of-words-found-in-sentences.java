class Solution {
    public int mostWordsFound(String[] sentence) {
        int max=-1;
        for(int i=0;i<sentence.length;i++){
            int count =0;
            for(int j=0;j<sentence[i].length();j++){
                if(sentence[i].charAt(j)==' '){
                    count++;
                }
            }
            max=Math.max(max,count);
        }
        return max+1;
    }
}