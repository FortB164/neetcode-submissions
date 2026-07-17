class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length<1 || nums == null) return new int[] {};
        HashMap<Integer, Integer> hashSeen = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            int comp = target - nums[i];
            if (hashSeen.containsKey(comp)) return new int[] {hashSeen.get(comp), i};
            hashSeen.put(nums[i], i);
        }
        return new int[] {};
    }
}
