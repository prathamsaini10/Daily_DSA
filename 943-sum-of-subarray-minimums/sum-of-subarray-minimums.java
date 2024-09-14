class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int ans1[]=pse(arr);
        int ans2[]=nse(arr);
        int mod=(int )(1e9+7);
        long sum=0;
        for(int i=0;i<n;i++){
            sum=(sum+(long)(arr[i]*(long)(ans1[i]*ans2[i]))%mod)%mod;
        }
        return (int )sum;
    }

    public int[] pse(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int [] ans=new int [n];
        for(int i=0;i<n;i++){

while(!st.isEmpty()&&arr[st.peek()]>arr[i]){
    st.pop();
}
            if(st.isEmpty()){
                ans[i]=i-(-1);
            }else{
                ans[i]=i-st.peek();
            }
        st.push(i);
        }
return ans;
    }

    public int[] nse(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int [] ans=new int [n];
        for(int i=n-1;i>=0;i--){

while(!st.isEmpty()&&arr[st.peek()]>=arr[i]){
    st.pop();
}
            if(st.isEmpty()){
                ans[i]=n-i;
            }else{
                ans[i]=st.peek()-i;
            }
        st.push(i);
        }
return ans;
    }
}