class Solution {
    public int minPartitions(String n) {
        int ans=0;
        for(int i=0;i<n.length();i++){
            int curr=Integer.valueOf(n.charAt(i)-48);
            ans=Math.max(ans,curr);

        }
   return ans;
    }

}