class Solution {
    public String compressedString(String word) {
       StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==word.charAt(i-1)){
               
                if(count<9){
                    count++;
                }else{
                    sb.append(count);
                 sb.append(word.charAt(i-1));
                 count=1;
                }
            }else {
                sb.append(count);
                sb.append(word.charAt(i-1));
                count=1;
            }
        }
        sb.append(count);
                sb.append(word.charAt(word.length()-1));
        return sb.toString();
    }
}