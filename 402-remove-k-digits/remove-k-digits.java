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
          for (Character c : st) {
        	if(sb.length()==0 && c=='0')continue;
            sb.append(c);
        }
        
       if(sb.toString().equals("")) return "0";
		return sb.toString();
}}

