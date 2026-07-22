class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1) return 0;
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i : nums){
            hashSet.add(i);
        }

        int max = 0;
        for(int i : nums){
            int conseq = 0;
            int current = i;
            while(hashSet.contains(current)){
                current++;
                conseq++;
            }
            max = Math.max(max, conseq);
        }

        return max;
    }
}
