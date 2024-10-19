class Solution {
    void invert(StringBuilder sb){

        for(int i=0;i<sb.length();i++){
             if (sb.charAt(i) == '0') {
                sb.setCharAt(i, '1');  // Change '0' to '1'
            } else {
                sb.setCharAt(i, '0');  // Change '1' to '0'
            }
        }

    }
    public char findKthBit(int n, int k) {
        if(n==1){
            return '0';
        }
       String sb="0";
        int N=1;
        while(N<n){
          StringBuilder inverted=new StringBuilder(sb);
            invert(inverted);
            inverted.reverse();
            sb=sb+"1"+inverted.toString();
            N++;
        }
     return sb.charAt(k-1);
    }
}