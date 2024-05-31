class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
       List<Integer> arr=new ArrayList<>();
  int n=arr1.length;
  int m=arr2.length;
  Arrays.sort(arr1);
  Arrays.sort(arr2);
  int i=0;
int j=0;


while(i<n&&j<m){
    if(arr1[i]<arr2[j]){
        i++;
    }else if(arr2[j]<arr1[i]){
        j++;
    }else{
        arr.add(arr1[i]);
        i++;
        j++;
    }
}
     int[] nums3 = arr.stream().mapToInt(Integer::valueOf).toArray();
       return nums3;
    }
}