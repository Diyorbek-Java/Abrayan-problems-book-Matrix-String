package matrix;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Find the amount of its rows
                whose values of elements are sorted in ascending order.
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

        int ascendingRowsCount = 0;
        for (int i = 0; i < M; i++) {
            if (isSortedAscending(matrix[i])) {
                ascendingRowsCount++;
            }
        }

        System.out.println("Amount of matrix rows with elements sorted in ascending order: " + ascendingRowsCount);
    }
    public static boolean isSortedAscending(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
