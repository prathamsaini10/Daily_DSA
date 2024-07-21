class Solution {
    public int distributeCandies(int[] candyType) {
       Set<Integer> arr=new HashSet<>();
       for(int i:candyType){
        arr.add(i);
       }
       return Math.min(arr.size(),candyType.length/2);
    }
}