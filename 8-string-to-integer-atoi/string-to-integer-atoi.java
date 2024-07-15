class Solution {
    public int myAtoi(String s) {
      long a=0;
        int index=0;
        int sign=1;
        StringBuilder sb=new StringBuilder(s);
        
           while (index < s.length() && s.charAt(index) == ' ') {
            sb.deleteCharAt(0);
            System.out.println(sb.toString());
            index++;
        }
          if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = sb.charAt(0) == '+' ? 1 : -1;
            sb.deleteCharAt(0);
            index++;
        }
       
            for(int i=0;i<sb.length();i++){
              char ch=sb.charAt(i);
                if(ch-'0'==0||ch-'0'==1||ch-'0'==2||ch-'0'==3||ch-'0'==4||ch-'0'==5||ch-'0'==6||ch-'0'==7||ch-'0'==8||ch-'0'==9){
                    a=a*10+Integer.valueOf(ch-'0');
                if(sign*a<=Integer.MIN_VALUE)return Integer.MIN_VALUE;
                if(sign*a>=Integer.MAX_VALUE)return Integer.MAX_VALUE;
               
                }else{
                    break;
                }
               
            }
            

            return sign*(int)a;
    }
}