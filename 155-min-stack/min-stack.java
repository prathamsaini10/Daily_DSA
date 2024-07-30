
class MinStack {
     Stack<Long> st;
     Long  min;
    public MinStack() {
      	st = new Stack<Long >();
        min=Long.MAX_VALUE;
    }
    
    public void push(int val ) {
          Long x = Long.valueOf(val);
        if(st.isEmpty()){
              min=x;
            st.push(x);
          
        }else{
            if(x>min)st.push(x);
            else
            {
                st.push(2*x-min);
                min=x;
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty())return;
        Long x=st.pop();
        if(x<min){
            min=2*min-x;
        }
    }
    
    public int top() {
         if(st.isEmpty())return 0;

         Long x=st.peek();
         if(min<x)return x.intValue();
         else return min.intValue();
    }
    
    public int getMin() {
       return min.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */