class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int left = 0;
        int right = heights.length-1;
        while(left < right){
            // find current max area and compare to max area
            maxArea = Math.max(maxArea, Math.min(heights[left], heights[right])*(right - left));
            if (heights[left] <= heights[right]) left++; // we are always trying to find a taller line
            else right--; // same here. trying to maximise line height. because that usually means more water
        }
        return maxArea;
    }
}