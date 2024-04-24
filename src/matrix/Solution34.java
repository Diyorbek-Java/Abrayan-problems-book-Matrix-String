package matrix;

import java.util.Scanner;

public class Solution34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of integers is given. Find the order number of the last matrix row that contains even
                numbers only. If the matrix does not contain the required rows then output 0.
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

        int rowNumber = 0;
        for (int i = M - 1; i >= 0; i--) {
            boolean hasOdd = false;
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] % 2 != 0) {
                    hasOdd = true;
                    break;
                }
            }
            if (!hasOdd) {
                rowNumber = i + 1;
                break;
            }
        }

        System.out.println("Order number of the last row with even numbers only: " + rowNumber);

    }
}
