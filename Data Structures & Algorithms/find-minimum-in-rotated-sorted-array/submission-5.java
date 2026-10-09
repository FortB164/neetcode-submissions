class Solution {
    public int findMin(int[] nums) {
        if(nums == null) return -1;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.min(nums[0], nums[1]);

        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int mid = left + (right-left)/2;
            if(mid > 0 && nums[mid] < nums[mid-1]) return nums[mid];
            else if(nums[mid] >= nums[left] && nums[mid] > nums[right]) left = mid +1;
            else right = mid -1;
        }

        return nums[left];
    }
}
