class Solution {
    public int minPartitions(String n) {
        int ans=0;
        for(int i=0;i<n.length();i++){
          
            ans=Math.max(ans, (n.charAt(i)-48));

        }
   return ans;
    }

}