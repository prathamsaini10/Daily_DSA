class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] count=new int[26];
        int n1=s1.length();
        int n2=s2.length();
        for(int i=0;i<n1;i++){
            count[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<n2;i++){
            count[s2.charAt(i)-'a']--;
            if(i-n1>=0){
                 count[s2.charAt(i-n1)-'a']++;
            }
            if(allzero(count))return true;

        }
        return false;
    }
    boolean allzero(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)return false;
        }
        return true;
    }
}