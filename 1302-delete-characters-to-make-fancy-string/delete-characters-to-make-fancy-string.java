class Solution {
    public String makeFancyString(String s) {
        Stack<Character> st=new Stack<>();
        int count=1;
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
           if(ch==st.peek()){
                count++;
              
            }else{
                count=1;
            }
if(count<3){
    st.push(ch);
}
           
        } 
        StringBuilder str=new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
     str=str.reverse();
        return str.toString();
    }
}