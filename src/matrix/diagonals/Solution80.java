package matrix.diagonals;

import java.util.Scanner;

public class Solution80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A real-valued square matrix A of order M is given. Find the sum of elements of its main diagonal:
                    A(1,1),    A(2,2),    A(3,3),    …,    A(M,M)
                """);
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();

        double[][] matrix = new double[M][M];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            System.out.printf("Enter matrix element while A(%d)", i);
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();

        double sum = findSumOfElements(matrix);

        System.out.println("Given Matrix: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Some of Diagonal A(1,1),A(2,2) .. elements are " + sum);
    }

    public static double findSumOfElements(double[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        double sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}
