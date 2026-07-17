class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length < 2) return false;

        HashMap<Integer, Boolean> hs = new HashMap();

        for(int i:nums){
            if(hs.containsKey(i)) return true;
            else hs.put(i, true);
        }

        return false;
    }
}