class Solution {
    public int[] maximumBeauty(int[][] items, int[] q) {
    
     int columnToSortBy=0;
      Arrays.sort(items, (a, b) -> Integer.compare(a[columnToSortBy], b[columnToSortBy]));
      int maxbeauty=0;
        for(int i=0;i<items.length;i++){
         if(maxbeauty>items[i][1]){
            items[i][1]=maxbeauty;
         }else{
            maxbeauty=Math.max(maxbeauty,items[i][1]);
         }
        }

        for(int i=0;i<q.length;i++){
            int left=0,right=items.length-1,qu=q[i];
            while(left<=right){
              int mid = left + (right - left) / 2;
                if (items[mid][0] <= qu) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }if(right>=0){q[i]=items[right][1];}
            else{q[i]=0;}
        }
        return q;
         }
}