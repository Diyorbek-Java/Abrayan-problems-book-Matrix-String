package matrix;

import java.util.Scanner;

public class Solution33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of integers is given. Find the order number of the first matrix row that contains the
                equal amount of positive and negative elements (zero elements are not considered). If the matrix
                does not contain the required rows then output 0.
                """);
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();

        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();

        double[][] matrix = new double[M][N];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        scanner.close();

        int columnNumber = 0;
        for (int j = N - 1; j >= 0; j--) {
            int positiveCount = 0;
            int negativeCount = 0;

            for (int i = 0; i < M; i++) {
                if (matrix[i][j] > 0) {
                    positiveCount++;
                } else if (matrix[i][j] < 0) {
                    negativeCount++;
                }
            }

            if (positiveCount == negativeCount) {
                columnNumber = j + 1; // Adjusting to start from 1
                break;
            }
        }

        System.out.println("Order number of the last column with equal positive and negative elements: " + columnNumber);
    }
}
