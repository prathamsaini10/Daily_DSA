class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
          int k=nums.size();

            PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

            int minelemindx=0;//min element index
            int minelem=Integer.MAX_VALUE;
            int maxelem=Integer.MIN_VALUE;
            int[] range={-1000000,1000000};// default range
            // this step initailize the heap 
            //puts the first index of each list with there list index and thiie index in the list
            //fetch the max element alongside 
            for(int i=0;i<k;i++){
                int li=i;
                int ei=0;
                maxelem=Math.max(maxelem,nums.get(li).get(0));
                minHeap.add(new int[]{nums.get(li).get(0),li,0});
            }
            // this loop runs untill the minelem list index runs out of bound
            while(!minHeap.isEmpty()){
                //get the top array i.e is minimum info from min heap
                int top[]=minHeap.poll();
                minelem=top[0];
                // update the range if required
                if(maxelem-minelem<range[1]-range[0]) {
                    range[0]=minelem;
                    range[1]=maxelem;
                }
                // move the element index as +1 
                int nextindx=top[2]+1;
                // check if the next index is out of boud 
                if(nextindx>=nums.get(top[1]).size()) break;
                //if not then check if it is bigger than the maxelem if yes then update 
                maxelem=Math.max(maxelem,nums.get(top[1]).get(nextindx));
                // add that element to the hesp
                minHeap.add(new int[]{nums.get(top[1]).get(nextindx),top[1],nextindx});
            }
            return range;

    }
}