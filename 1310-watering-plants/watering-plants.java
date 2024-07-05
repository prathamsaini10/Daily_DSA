class Solution {
    public int wateringPlants(int[] arr, int capacity) {

        int n=arr.length;
        int i=0;
        int steps=0;   int c=capacity;
        while(i<n){
         
            if(arr[i]<=c){
                 c-=arr[i];

                steps=steps+1;
               
            
               i++;
            }else{
                steps=steps+2*i;
                c=capacity;
              
            }
 
        }
        return steps;
        
    }
}