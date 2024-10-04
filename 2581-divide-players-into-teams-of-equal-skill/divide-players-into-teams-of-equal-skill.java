class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long sum=skill[0]+skill[skill.length-1];
    long result=0;
        for(int i=0;i<skill.length/2;i++){
            long sum1=skill[i]+skill[skill.length-1-i];
        if(sum!=sum1)return -1;
        result+=skill[i]*skill[skill.length-1-i];
        }
        return result;
    }
}