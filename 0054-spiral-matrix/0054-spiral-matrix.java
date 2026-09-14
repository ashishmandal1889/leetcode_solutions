import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;
        
        // Define initial boundaries
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        
        while (top <= bottom && left <= right) {
            // 1. Move Right across top row
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++; // Top row completed; shift top boundary down
            
            // 2. Move Down along right column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // Right column completed; shift right boundary left
            
            // 3. Move Left across bottom row (check if row still valid)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--; // Bottom row completed; shift bottom boundary up
            }
            
            // 4. Move Up along left column (check if column still valid)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // Left column completed; shift left boundary right
            }
        }
        
        return result;
    }
}