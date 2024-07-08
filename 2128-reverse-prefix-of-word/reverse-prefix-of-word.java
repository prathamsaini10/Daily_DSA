class Solution {
    public String reversePrefix(String word, char ch) {
        int index=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                index=i;
                break;
            }
        }
        int i=0;
        int j=index;
         char[] chars = word.toCharArray();
        while(i<=j){
         char temp = chars[i];
    chars[i] = chars[j];
    chars[j] = temp;
    i++;
    j--;
        }
       return new String(chars);
    }
}