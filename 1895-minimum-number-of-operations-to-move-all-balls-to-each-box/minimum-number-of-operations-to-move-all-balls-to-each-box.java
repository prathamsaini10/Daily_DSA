class Solution {
    public int[] minOperations(String boxes) {
        int [] arr=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            int sum=0;
        for(int j=0;j<boxes.length();j++){
            if(boxes.charAt(j)=='0'){
                continue;
            }else if(boxes.charAt(j)=='1'&&j!=i){
                sum+=Math.abs(i-j);
            }
        }
        arr[i]=sum;
        }
        return arr;
    }
}