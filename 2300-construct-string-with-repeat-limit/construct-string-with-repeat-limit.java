class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int [] arr=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
      
        StringBuilder sb = new StringBuilder();
        for(int i=25;i>=0;){
            if(arr[i]==0){i--;continue;}
            char ch=(char)('a'+i);
            int freq=Math.min(arr[i],repeatLimit);
           for (int k = 0; k < freq; k++) {
            sb.append(ch);
        }
        arr[i] -= freq;
           
            if(arr[i]>0){
                int j=i-1;
                while(j>=0&&arr[j]==0){
                    j--;
                }
                if(j<0)break;
                sb.append((char)('a'+j));
                arr[j]--;
            }
        }
        return sb.toString();
    }
}