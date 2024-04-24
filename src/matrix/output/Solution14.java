package matrix.output;

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A real-valued square matrix A of order M is given. Starting with the element A(1,1), output its elements as follows:
                all elements of the first column, all elements of the M-th row except the element AM,1 (which is already output),
                all remaining elements of the second column, all remaining elements of the (M−1)-th row, and so on; the element A1,M
                must be output in the end. All rows must be output from left to right, all columns must be output from up to down.
                """);
        System.out.print("Enter the order of the square matrix (M): ");
        int M = scanner.nextInt();

        double[][] matrix = new double[M][M];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();
        System.out.println("Elements of the matrix in the specified order:");
        int startRow = 0;
        int endRow = M - 1;
        int startCol = 0;
        int endCol = M - 1;
        showMatrix(startRow, endRow, startCol, endCol, matrix);
    }

    public static void showMatrix(int startRow, int endRow, int startCol, int endCol, double[][] matrix) {
        while (startRow <= endRow && startCol <= endCol) {
            // Output elements of the current column from up to down
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][startCol] + " ");
            }

            // Output elements of the current row from left to right,
            // except for the element AM,1 (if not in the first column)
            if (startCol < endCol) {
                for (int j = startCol + 1; j <= endCol; j++) {
                    System.out.print(matrix[endRow][j] + " ");
                }
            }

            // Output elements of the rightmost column from down to up,
            // except for the element A1,M (if not in the last row)
            if (startRow < endRow) {
                for (int i = endRow - 1; i >= startRow; i--) {
                    System.out.print(matrix[i][endCol] + " ");
                }
            }

            // Output elements of the top row from right to left,
            // except for the elements in the first and last columns
            if (startRow < endRow && startCol < endCol) {
                for (int j = endCol - 1; j > startCol; j--) {
                    System.out.print(matrix[startRow][j] + " ");
                }
            }

            // Update pointers to the inner matrix
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
}
