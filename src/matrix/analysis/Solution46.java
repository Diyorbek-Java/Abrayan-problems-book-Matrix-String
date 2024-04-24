package matrix.analysis;

import java.util.Scanner;

public class Solution46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Find maximal element among elements of all matrix
                columns whose values of elements are sorted in ascending or descending order. If the matrix
                does not contain the required columns then output 0 (as a real number).
                """);
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();

        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();

        int[][] matrix = new int[M][N];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        int element = findMaxInRowMinInColumn(matrix);

        System.out.println("Matrix element that is maximum in its row and minimum in its column: " + element);


    }


    public static int findMaxInRowMinInColumn(int[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;

        for (int i = 0; i < M; i++) {
            int maxInRow = Integer.MIN_VALUE;
            int maxIndex = -1;
            // Find maximum in row
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] > maxInRow) {
                    maxInRow = matrix[i][j];
                    maxIndex = j;
                }
            }
            // Check if it's the minimum in its column
            boolean isMinInColumn = true;
            for (int k = 0; k < M; k++) {
                if (matrix[k][maxIndex] < maxInRow) {
                    isMinInColumn = false;
                    break;
                }
            }
            if (isMinInColumn) {
                return maxInRow;
            }
        }

        return 0;
    }
}
