class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return searchCol(matrix, target);
    }

    public static boolean searchCol(int[][] matrix, int target){
        int mostLikelyRow = 0;
        int top = 0;
        int bottom = matrix.length - 1;

        // binary search the rightmost first index of any row that is not
        // bigger than target
        while(top <= bottom){
            int mid = top + ((bottom - top ) / 2);
            if(matrix[mid][0] == target) return true;
            if(matrix[mid][0] < target){
                mostLikelyRow = mid;
                top = mid + 1;
            }
            else if(matrix[mid][0] > target){
                bottom = mid - 1;
            }
        }
        return searchRow(matrix, target, mostLikelyRow);
    }

    public static boolean searchRow(int[][] matrix, int target, int row){
        int left = 0;
        int right = matrix[0].length-1;
        while(left <= right){
            int mid = left + ((right-left)/2);
            if(matrix[row][mid] == target) return true;
            if(matrix[row][mid] > target){
                right = mid - 1;
            }
            else if(matrix[row][mid] < target){
                left = mid + 1;
            }
        }
        return false;
    }
}
