class Solution {
    public int search(int[] nums, int target) {
        return newSearch(nums, target, 0, nums.length-1);
    }

    public int newSearch(int[] nums, int target, int low, int high){

        if(low>high) return -1;
        
        int lowHighRange = high - low;
        int half = lowHighRange/2;
        int midIndex = low+half;
        int numAtMidIndex = nums[midIndex];

        if(numAtMidIndex == target) return midIndex;
        return (numAtMidIndex < target) ? 
        newSearch(nums, target, midIndex+1, high) :
        newSearch(nums, target, low, midIndex-1);
       
    }
}