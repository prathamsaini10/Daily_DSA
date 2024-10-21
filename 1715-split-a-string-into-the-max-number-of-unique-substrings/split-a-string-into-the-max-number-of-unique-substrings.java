class Solution {
    public int maxUniqueSplit(String s) {
//       HashMap<String,Integer> map=new HashMap<>();
//   int i=0,count=0;
//  while(i<s.length()){
//       char ch=s.charAt(i);
//       StringBuilder sb=new StringBuilder();
//       sb.append(ch);
//       while(i<s.length()-1&&map.containsKey(sb.toString())){
//           i++;
//           sb.append(s.charAt(i));
//       }
//        if(map.containsKey(sb.toString())&&map.get(sb.toString())>0){
//         i++;
//         continue;
//       }
//       map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
     
//       count++;
//       i++;
//   } 
//   return map.size();
  return solve(0, s, new HashSet<>());
    }
    
      public int solve(int start, String s, Set<String> set) {
        if (start == s.length()) {
            return 0;
        }
        int maxSplits = 0;
        
        for (int i = start + 1; i <= s.length(); i++) {
            String substring = s.substring(start, i);
            
            if (!set.contains(substring)) {
                set.add(substring);
                
                int splits = 1 + solve(i, s, set);

                maxSplits = Math.max(maxSplits, splits);
                set.remove(substring);
            }
        }
        
        return maxSplits;
    }
}