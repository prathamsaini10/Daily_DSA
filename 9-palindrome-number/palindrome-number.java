class Solution {
    public boolean isPalindrome(int x) {
        int dup=x;
        int rev=0;
        while(x>0){
            int r=x%10;
            rev=(rev*10)+r;
            x/=10;
        }
        if(rev==dup){
            return true;
        }
        return false;
    }
}