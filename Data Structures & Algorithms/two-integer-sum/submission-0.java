class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int i = 0;
        for(int num : nums){
            int complementOfNum = target - num;

            if(hm.containsKey(complementOfNum))
                return new int[] {hm.get(complementOfNum), i};

            hm.put(num, i);
            i++;
        }
        return new int[] {};
    }
}
