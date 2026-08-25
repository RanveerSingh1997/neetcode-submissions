class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counts = new HashMap<>();

        for(int num: nums){
            if(counts.containsKey(num)){
                counts.put(num,counts.get(num)+1);   
            }else {
                counts.put(num,1);
            }
        }

        // Step 2: Max heap based on frequency

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> counts.get(b) - counts.get(a)
        );

        // Step 3: Add all unique numbers

        for (int num : counts.keySet()) {
            pq.add(num);
        }

        // Step 4: Get top k
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {

            result[i] = pq.poll();

        }
        return result;
    }
}
