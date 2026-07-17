class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length < 2) return false;

        HashMap<Integer, Boolean> hs = new HashMap();

        for(int i = 0 ; i < nums.length ; i++){
            if(hs.containsKey(nums[i])) return true;
            else hs.put(nums[i], true);
        }

        return false;
    }
}