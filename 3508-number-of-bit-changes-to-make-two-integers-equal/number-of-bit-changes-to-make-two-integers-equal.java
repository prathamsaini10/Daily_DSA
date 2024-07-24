class Solution {
    public int minChanges(int start, int goal) {
         int ans=start^goal;
        int count=0;
        if((start|goal)!=start)return -1;
        for(int i=0;i<31;i++){
            if((ans & (1<<i))!=0)count++;
        }
        return count;
    }
}