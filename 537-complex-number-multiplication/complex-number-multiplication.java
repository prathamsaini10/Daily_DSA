class Solution {
    public String complexNumberMultiply(String num1, String num2) {
         int x = num1.indexOf('+');
        int a = Integer.parseInt(num1.substring(0, x));
        int b = Integer.parseInt(num1.substring(x+1, num1.length() - 1));
        x = num2.indexOf('+');
        int c = Integer.parseInt(num2.substring(0, x));
        int d = Integer.parseInt(num2.substring(x+1, num2.length() - 1));
        StringBuilder ans = new StringBuilder();
        ans.append(a*c - b*d);
        ans.append('+');
        ans.append(a*d + b*c);
        ans.append('i');
        return ans.toString();
    }
}