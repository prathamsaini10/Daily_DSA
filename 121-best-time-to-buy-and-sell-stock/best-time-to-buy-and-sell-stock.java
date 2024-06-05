class Solution {
    public int maxProfit(int[] prices) {
      
      int max=0;
      int mini=prices[0];
      for(int i=1;i<prices.length;i++){
        int cost=prices[i]-mini;
        max=Math.max(max,cost);
        mini=Math.min(mini, prices[i]);
      }
      return max;
    }
}