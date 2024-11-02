class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr=sentence.split(" ");
        String st=arr[arr.length-1];
        if(arr[0].charAt(0)!=st.charAt(st.length()-1)){
            return false;
        }
        for(int i=1;i<arr.length;i++){
            String str=arr[i];
            String str2=arr[i-1];
           if(str.charAt(0)!=str2.charAt(str2.length()-1)){
            return false;
           }
        }
        
        return true;
    }
}