package matrix;

import java.util.Scanner;

public class Solution43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Find the amount of
                its columns whose values of elements are sorted in descending order
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

        double[][] transposedMatrix = transpose(matrix);

        int descendingColumnsCount = 0;
        for (int i = 0; i < N; i++) {
            if (isSortedDescending(transposedMatrix[i])) {
                descendingColumnsCount++;
            }
        }

        System.out.println("Amount of matrix columns with elements sorted in descending order: " + descendingColumnsCount);

    }

    public static double[][] transpose(double[][] matrix) {

        int M = matrix.length;
        int N = matrix[0].length;

        double[][] transposed = new double[N][M];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static boolean isSortedDescending(double[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
