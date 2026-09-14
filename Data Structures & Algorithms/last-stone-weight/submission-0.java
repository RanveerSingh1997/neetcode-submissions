class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            heap.offer(num);
        }
        while(heap.size()>1){
            int max1=heap.poll();
            int max2=heap.poll();
            if(max1!=max2){
                heap.offer(max1-max2);
            }
        }
        return heap.isEmpty()?0:heap.peek();
    }
}
