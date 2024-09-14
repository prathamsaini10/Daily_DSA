class Solution {
    public String removeKdigits(String num, int k) {
            Stack<Character> st =new Stack<>();
            for(int i=0;i<num.length();i++){
                char ch=num.charAt(i);
               while(!st.isEmpty()&&k>0&&st.peek()>ch){
                st.pop();
                k--;
               }
               st.push(ch);
            }
            while(k>0){
                if(!st.isEmpty()){
                    st.pop();
                    k--;
                }else{break;}
            }

            StringBuilder sb=new StringBuilder();
            if(st.isEmpty())return "0";
          while(!st.isEmpty()){
               sb.append(st.pop());
          }
          while(sb.length()>0&&sb.charAt(sb.length()-1)=='0'){
             sb.deleteCharAt(sb.length()-1);
          }
            sb.reverse();
        
       if(sb.toString().equals("")) return "0";
		return sb.toString();
}}

