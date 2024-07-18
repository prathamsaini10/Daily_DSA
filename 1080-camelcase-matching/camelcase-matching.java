class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        int n=queries.length;
        List<Boolean> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(check(queries[i],pattern));
        }
        return ans;
    }

    public boolean check(String str,String pattern){
        int j=0;
int cap=0;
        for(int i=0;i<str.length();i++){
                if(j<pattern.length()&&str.charAt(i)==pattern.charAt(j))j++;
                else if(str.charAt(i)>='A'&&str.charAt(i)<='Z')cap++;
        }
        return (cap==0&&j==pattern.length());
    }
}