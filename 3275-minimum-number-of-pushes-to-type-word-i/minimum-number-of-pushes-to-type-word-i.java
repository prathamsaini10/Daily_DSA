class Solution {
    public int minimumPushes(String word) {
           int [] map=new int [26];
        int result=0;
        for(int i=0;i<word.length();i++){
            map[word.charAt(i)-'a']++;
        }
        Arrays.sort(map);
          int left = 0;
        int right = map.length - 1;
        while (left < right) {
            int temp = map[left];
            map[left] = map[right];
            map[right] = temp;
            left++;
            right--;
        }
        for(int i=0;i<26;i++){
            int freq=map[i];
           int press=(i/8)+1;
            result+=freq*press;
        }
        return result;
    }
}