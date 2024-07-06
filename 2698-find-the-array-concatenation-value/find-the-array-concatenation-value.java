class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int n = nums.length;
    int s = 0, e = n - 1;
    long con = 0;
    while (s <= e) {
      if(s==e){
        con+=nums[s];
        s++;
        e--;
       }
     else{
      int m = digit(nums[e]);
      con += (long)(nums[s] * Math.pow(10, m) + nums[e]);
      s++;
      e--;
     }
     
     
    }
    return con;
  }

  public int digit(int n) {
    int count = 0;
    while (n > 0) {
      n = n / 10;
      count++;
    }
    return count;
}
}