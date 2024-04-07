class Solution {
    public int finalValueAfterOperations(String[] num) {
                int count=0;
           int a=num.length;
           for(int i=0;i<a;i++){
            if(num[i].equals("++X")||num[i].equals("X++")){
                count ++;
            }
        else if(num[i].equals("--X")||num[i].equals("X--")){
            count--;
        }
           } 
           return count;

    }
}