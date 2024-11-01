class Solution {
    public String makeFancyString(String s) {
        StringBuilder str = new StringBuilder();
        int count = 1;
        str.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == s.charAt(i - 1)) {
                count++;

            } else {
                count = 1;
            }
            if (count < 3) {
                str.append(ch);
            }

        }

        return str.toString();
    }
}