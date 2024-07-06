class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int k) {
       int n=customers.length;
    int sum=0;
    int max=0;
    for(int i=0;i<n;i++){
        if(grumpy[i]==0){
            sum+=customers[i];
        }
    }
  for(int start=0;start<=n-k;start++){
    int temp=0;
    for(int end=start;end<k+start;end++){
      if(grumpy[end]==1){
        temp+=customers[end];
       
      }

    }
    System.out.println(temp);
    max=Math.max(max,sum+temp);
  }
    return max;

    }
}