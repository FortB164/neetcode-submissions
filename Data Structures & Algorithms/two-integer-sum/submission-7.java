class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashSeen = new HashMap<>();
        // key and index cant be duped, so index becomes the key
        // index, value
        for(int i = 0; i<nums.length;i++){
            int comp = target - nums[i];
            if (hashSeen.containsKey(comp)){
                // return i (i is the position of num[i]) and value of comp if found
                return new int[] {hashSeen.get(comp), i};
            }
            else hashSeen.put(nums[i], i);

        }

        return new int[] {};
    }
}
