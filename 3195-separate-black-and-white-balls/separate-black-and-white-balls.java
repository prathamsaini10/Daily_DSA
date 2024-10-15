class Solution {
    public long minimumSteps(String s) {
     long black =0,swap=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='0')swap+=black;
        else black++;
    }
    return swap;
    }
}