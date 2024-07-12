class Solution {
    public String reverseWords(String s) {
      String[] array = s.trim().split("\\s+");
      StringBuilder sb = new StringBuilder();

for (int i = 1; i <= array.length; i++) {
  sb.append(array[array.length-i]);
  if (i < array.length ) {
    sb.append(" "); // Add spaces between words (optional)
  }
}
        return sb.toString();
    }
}