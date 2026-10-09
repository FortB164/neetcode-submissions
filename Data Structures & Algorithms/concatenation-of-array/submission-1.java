class Solution {
    public int[] getConcatenation(int[] nums) {
        if (nums == null) return null;
        if (nums.length == 1) return new int[] {nums[0], nums[0]};
        int [] ans = new int [nums.length * 2];
        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}