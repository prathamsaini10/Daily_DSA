class Solution {
List<String> result=new ArrayList<>();;

    public List<String> letterCombinations(String digits) {

            if(digits.length()==0)return result;
            HashMap<Character,String> map=new HashMap<>();
            map.put('2',"abc");
             map.put('3',"def");
              map.put('4',"ghi");
               map.put('5',"jkl");
                map.put('6',"mno");
                 map.put('7',"pqrs");
                  map.put('8',"tuv");
                   map.put('9',"wxyz");

                   StringBuilder temp=new StringBuilder();
                   solve(0,digits,temp,map);
                   return result;
    }

     public void solve(int ind,String digit,StringBuilder temp,HashMap<Character,String> map){
       
        if(ind>=digit.length()){
            result.add(temp.toString());
            return ;
        }
        char ch=digit.charAt(ind);
        String st=map.get(ch);


        for(int i=0;i<st.length();i++){
            temp.append(st.charAt(i));
            solve(ind+1,digit,temp,map);
            temp.deleteCharAt(temp.length()-1);
        }

    }
}