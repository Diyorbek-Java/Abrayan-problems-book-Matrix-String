package matrix.analysis;

import java.util.Scanner;

public class Solution44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Find minimal element among elements of all matrix
                rows whose values of elements are sorted in ascending or descending order. If the matrix does
                not contain the required rows then output 0 (as a real number).
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

        double minElement = findMinElementSortedRows(matrix);

        System.out.println("Minimal element among elements of sorted rows: " + minElement);

    }

    public static double findMinElementSortedRows(double[][] matrix) {
        double minElement = Double.MAX_VALUE;
        boolean foundSortedRow = false;

        for (double[] row : matrix) {
            if (isSortedAscending(row) || isSortedDescending(row)) {
                for (double num : row) {
                    minElement = Math.min(minElement, num);
                }
                foundSortedRow = true;
            }
        }

        if (!foundSortedRow) {
            minElement = 0.0;
        }

        return minElement;
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
