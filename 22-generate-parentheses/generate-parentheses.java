class Solution {
    List <String > list=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder str=new StringBuilder();
        solve(str,n);
        return list;
    }

    void solve(StringBuilder str,int n){
        if(str.length()==2*n){
            if(isValid(str.toString())){
                list.add(str.toString());
            }
            return;
        }
       str.append("(");
        solve(str,n);
        str.deleteCharAt(str.length() - 1);

        str.append(")");
        solve(str,n);
        str.deleteCharAt(str.length() - 1);
    }

     private boolean isValid(String str) {
        int sum = 0;
     for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == '(')
            sum++;
        else
            sum--;
        if (sum < 0)
            return false;
    }
    return sum == 0;
    }

}