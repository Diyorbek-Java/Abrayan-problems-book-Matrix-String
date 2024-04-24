package matrix.analysis;

import java.util.Scanner;

public class Solution45 {
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

        double[][] matrix = new double[M][N];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        scanner.close();

        double[][] transposedMatrix = transpose(matrix);

        // Find the maximal element among elements of columns sorted in ascending or descending order
        double maxElement = findMaxElementSortedColumns(transposedMatrix);

        System.out.println("Maximal element among elements of sorted columns: " + maxElement);

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

    public static double findMaxElementSortedColumns(double[][] matrix) {
        double maxElement = Double.MIN_VALUE;
        boolean foundSortedColumn = false;

        for (double[] column : matrix) {
            if (isSortedAscending(column) || isSortedDescending(column)) {
                for (double num : column) {
                    maxElement = Math.max(maxElement, num);
                }
                foundSortedColumn = true;
            }
        }

        if (!foundSortedColumn) {
            maxElement = 0.0;
        }

        return maxElement;
    }

    public static boolean isSortedAscending(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
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
