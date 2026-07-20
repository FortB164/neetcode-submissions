class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> countedFreq = countFreq(nums);



        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countedFreq.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1];
        }

        return res;
    }

    public static Map<Integer, Integer> countFreq(int [] nums){
        HashMap<Integer, Integer> freqCount = new HashMap<>();

        for(int i : nums){
            freqCount.putIfAbsent(i, 0);
            if(freqCount.containsKey(i)) freqCount.put(i, freqCount.get(i)+1);
        }

        return freqCount;
    }
}
