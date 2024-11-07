class Solution {
    public int largestCombination(int[] c) {
        int max=0;
        for(int i=0;i<24;i++){
            int count=0;
            for(int j=0;j<c.length;j++){
                if((c[j]&(1<<i))!=0){
                    count++;
                }

            }
            max=Math.max(max,count);
        }
        return max;
    }
}