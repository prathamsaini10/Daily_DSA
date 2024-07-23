class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> matrix= new ArrayList<>();
        int [ ] hashing = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            hashing[nums[i]]+=1;
        }
        int k=0;
           while(k<=nums.length)
        {
          List<Integer>inner=new ArrayList<>();
          k++;
          for(int i=0;i< hashing.length;i++)
          {
            if(hashing[i]!=0)
            {
               inner.add(i);
               hashing[i]--;
            }
          }
          if(inner.size()>0)
          matrix.add(inner);
        }
        return matrix;
    }
}