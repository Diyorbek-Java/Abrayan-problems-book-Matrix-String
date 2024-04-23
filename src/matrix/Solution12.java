package matrix;

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Output elements of the matrix in the following order:
                the first column from up to down, the second column from down to up, the third column from up to down,
                the fourth column from down to up, and so on.
                """);
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();

        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();

        double[][] matrix = new double[M][N];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            System.out.println("Enter the elements of the matrix: When M = " + i);
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();

        System.out.println("Elements of the matrix in the specified order:");
        for (int j = 0; j < N; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < M; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            else {
                for (int i = M - 1; i >= 0; i--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
