class Solution {
    public int maxVowels(String s, int k) {
        int i=0,j=0,max=0,count=0;
        while(j<s.length()){
          if(isvowel(s.charAt(j)))
            count++;
              if((j-i+1)==k){
             max=Math.max(max,count);
             if(isvowel(s.charAt(i)))
               { count--;}
               
                i++;
             
            }
        j++;
          
        
        }
        return max;
    }

    boolean isvowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}