class Solution {
    public int minEatingSpeed(int[] piles, int h) {
 int low=1;
 int max=Integer.MIN_VALUE;
 int n=piles.length;       
 for(int i=0;i<n;i++){
    max=Math.max(max,piles[i]);
 }    
 int high=max;
 while(low<=high){
    int mid= low + (high - low) / 2;
    int total =fun(piles,mid);
    if(total<=h){
            high=mid-1;
    }else{
        low=mid+1;
    }
 }
 return low;
    }
public int fun(int[] arr,int h){
    int total=0;
    for(int i=0;i<arr.length;i++){
        total +=Math.ceil((double)arr[i]/(double)h);
    }
    return total;
}
}