class Solution {
    public String longestPalindrome(String s) {
       int max=0;
       int start=0;
       int end =0;
       for(int i=0;i<s.length();i++){
         for(int j=i;j<s.length();j++){
            if(isPalandrome(s,i,j)){
                
                if(j-i+1>max){
                    max=j-i+1;
                        start=i;
                end=j;
                }
            }
         }
       }
       return s.substring(start,end+1);
    }

    public boolean isPalandrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
    return true;
    }
}