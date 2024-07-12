class Solution {
    public boolean isIsomorphic(String s, String t) {
       int n=s.length();
       HashMap<Character,Character> mp1=new HashMap<>();
      HashMap<Character,Boolean> mp2=new HashMap<>();

      for(int i=0;i<n;i++){
        char ch1=s.charAt(i);
      char ch2=t.charAt(i);

        if(mp1.containsKey(ch1)==true){
            if(mp1.get(ch1)!=ch2){
                return false;
            }
        }else{
            if(mp2.containsKey(ch2)==true){
                return false;
            }else{
                mp1.put(ch1,ch2);
                mp2.put(ch2,true);
            }
        }

      }
      return true;
    }
}