class Solution {
    public String minWindow(String s, String t) {
        int i=0,j=0;
        int counter=t.length();
        Map<Character,Integer> map=new HashMap<>();
        String result="";
        for(int u=0;u<t.length();u++){
            char ch=t.charAt(u);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        while(j<s.length()){
            if(map.containsKey(s.charAt(j))){
                if(map.get(s.charAt(j))>0){
                    counter--;
                }
               map.put(s.charAt(j),map.get(s.charAt(j))-1);
            }
            if(counter==0){
                while(i<=j){
                     if(map.containsKey(s.charAt(i))){
                        boolean check=map.get(s.charAt(i))+1<=0?true:false;
                        if(check){
                            map.put(s.charAt(i),map.get(s.charAt(i))+1);
                            i++;
                        }else{
                            break;
                        }
                     }else{
                        i++;
                     }

                }
                String temp=s.substring(i,j+1);
                if(result.isEmpty()||result.length()>temp.length()){
                    result=temp;
                }
            }
            j++;
        }
        return result;
    }
}