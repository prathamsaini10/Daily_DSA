class Solution {
    public int longestConsecutive(int[] a) {
         int n = a.length;
        if (n == 0)
            return 0;
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<a.length;i++){
        set.add(a[i]);
    }
int max=0;
    for(int it:set){
        
        if(!set.contains(it-1)){
            int x=it;
            int count=1;
            while(set.contains(x+1)){
                x+=1;
                count++;
            }
            max=Math.max(max,count);
        }
    }
return max;
    }
}