class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] output = new int[nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            int [] copy = Arrays.copyOf(nums, nums.length);
            output[i] = getMul(copy, i);
        }
        return output;
        
    }

    public static int getMul(int[] nums, int pos){
        nums[pos] = 1;
        int ret = 1;
        for(int i = 0 ; i<nums.length ; i++){
            ret = ret * nums[i];
        }
        return ret;
    }
}  
