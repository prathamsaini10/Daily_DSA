class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
       Arrays.sort(capacity);
    int sumapple=0;
    int count=0;
    for(int i=0;i<apple.length;i++){
        sumapple=sumapple+apple[i];
    }
    
    for(int i=capacity.length-1;i>=0;i--){
       if(sumapple>0){
            sumapple-=capacity[i];
            count++;
         
       }
    }
    return count;
    }
}