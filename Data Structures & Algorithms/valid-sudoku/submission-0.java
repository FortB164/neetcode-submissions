class Solution {
    public boolean isValidSudoku(char[][] board) {
        // HashSet arrays for rows, columns, and sub-boxes
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        
        // Initialize the sets
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        
        // Traverse the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                
                // If the current cell is not empty
                if (num != '.') {
                    // Check if the number is already in the current row
                    if (rows[i].contains(num)) {
                        return false; // Invalid board
                    }
                    rows[i].add(num); // Mark the number in the current row
                    
                    // Check if the number is already in the current column
                    if (cols[j].contains(num)) {
                        return false; // Invalid board
                    }
                    cols[j].add(num); // Mark the number in the current column
                    
                    // Check if the number is already in the current 3x3 sub-box
                    int boxIndex = (i / 3) * 3 + (j / 3);
                    if (boxes[boxIndex].contains(num)) {
                        return false; // Invalid board
                    }
                    boxes[boxIndex].add(num); // Mark the number in the current sub-box
                }
            }
        }
        return true;
    }
}
