class Solution {
    public int maxDepth(String s) {
      int count =0;
      Stack<Character> st=new Stack<>();

      int max=Integer.MIN_VALUE;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            st.push('(');
        }else if(s.charAt(i)==')'){
            max=Math.max(max,st.size());
            st.pop();
            
        }
        max=Math.max(max,st.size());
      }  
      
      return max;
    }
}