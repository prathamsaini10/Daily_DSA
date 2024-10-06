class Solution {
    public double myPow(double x, int n1) {
        // return solve(x,(long)n);
    double ans=1;
    long n=n1;
    if(n>=0){
        while(n>0){
        if((n&1)==0){
            n=n/2;
            x*=x;
        }else {
            ans*=x;
            n=n-1;
        }
     
    }
    }else{
        x=1/x;
        n=n*(-1);
          while(n>0){
        if((n&1)==0){
            n=n/2;
            x*=x;
        }else {
            ans*=x;
            n=n-1;
        }
     
    }
    }
       return ans;
    }

    public double solve (double x,long n){

        if(n==0){
            return 1;
        }
        if(n<0){
            return solve(1/x,-n);
        }
        if((n&1)==0){
            return solve(x*x,n/2);
        }
        return x*solve(x*x,(n-1)/2);

    }
}