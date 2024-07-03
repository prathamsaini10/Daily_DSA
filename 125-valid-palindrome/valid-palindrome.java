class Solution {
    public boolean isPalindrome(String s) {
    s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();;
     int n=s.length();
     return check(s,0,n);
      
  }
  public boolean check(String s,int i,int n){
 if(i>=s.length()/2) return true ;
       if(s.charAt(i)!=s.charAt(s.length()-1-i)){
        return false;
       }
       
       return check(s,i+1,n);
  } 
}