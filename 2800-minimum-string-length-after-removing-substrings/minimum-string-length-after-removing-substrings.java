class Solution {
    public int minLength(String s) {
        // Stack<Character> st=new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(st.isEmpty()){
        //             st.push(ch);
        //             continue;
        //     }
        //     if(ch=='B'&&st.peek()=='A'){
        //         st.pop();
        //     }else if(ch=='D'&&st.peek()=='C'){
        //         st.pop();
        //     }else{
        //         st.push(ch);
        //     }
        // }
        // return st.size();


        boolean check=true;
        while(check!=false){
            if(s.contains("AB")){
                s=s.replace("AB","");
            }else if(s.contains("CD")){
                s=s.replace("CD","");
            }else{
                check=false;

            }
        }
        return s.length();
    }
}