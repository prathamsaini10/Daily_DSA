class Solution {
    public int minOperations(String[] logs) {
        int count=0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].compareTo("../") == 0){
                count--;
            }else if(logs[i].compareTo("./") == 0){
                continue;
            }else{
                count++;
            }
            if(count<0)count=0;
        }
        return count;
    }
}