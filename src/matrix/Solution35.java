package matrix;

import java.util.Scanner;

public class Solution35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of integers is given. Find the order number of the first matrix column that contains
                odd numbers only. If the matrix does not contain the required columns then output 0.
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
        for (int j = 0; j < N; j++) {
            boolean hasEven = false;
            for (int i = 0; i < M; i++) {
                if (matrix[i][j] % 2 == 0) {
                    hasEven = true;
                    break;
                }
            }
            if (!hasEven) {
                columnNumber = j + 1;
                break;
            }
        }

        System.out.println("Order number of the first column with odd numbers only: " + columnNumber);

    }
}
