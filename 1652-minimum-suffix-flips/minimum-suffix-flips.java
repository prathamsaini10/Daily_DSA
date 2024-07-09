class Solution {
    public int minFlips(String target) {
        int count=1;
        char[] c=target.toCharArray();
        if(c[0]!='0'){      
        for(int i=0;i<c.length-1;i++){
            if(c[i]!=c[i+1]){
                count++;
            }
        }
        return count;
        }else{
            count =0;
            for(int i=0;i<c.length-1;i++){
            if(c[i]!=c[i+1]){
                count++;
            }
        }
       
        }
         return count;
    }
}