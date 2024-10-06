class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
     String [] arr1= sentence1.split(" ");
     String [] arr2= sentence2.split(" ");

     if(arr1.length>arr2.length){
        return areSentencesSimilar(sentence2,sentence1);
     }   
        int start=0,
        end1=arr1.length-1,
        end2=arr2.length-1;
        while(start<arr1.length&&arr1[start].equals(arr2[start])){
            start++;
        }
        while(end1>=0&&arr1[end1].equals(arr2[end2])){
            end1--;
            end2--;
        }
    return start>end1;
    }
}