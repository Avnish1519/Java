public class SpiralMatrix {//taking class as spiralmatrix
    public static void main(String[] args) {
        int n = 4;  // Size of the matrix (n x n)
        int[][] matrix = new int[n][n];
        
        int value = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        
        //using while loop
        while (value <= n * n) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = value++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }
        
        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
