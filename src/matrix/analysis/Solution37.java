package matrix.analysis;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of integers is given, values of its elements are in the range 0 to 100. A matrix column
                is called the similar with the other column if these columns contain the same set of numbers. For example,
                columns (1, 3, 3, 2) and (2, 2, 1, 3) contain the same set {1, 2, 3} and therefore they are the similar columns.
                Find the amount of matrix columns that are the similar with the last column.
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

        Set<Integer> lastColumnSet = new HashSet<>();
        for (int i = 0; i < M; i++) {
            lastColumnSet.add(matrix[i][N - 1]);
        }

        int similarColumnsCount = 0;
        for (int j = 0; j < N - 1; j++) { // Exclude the last column
            Set<Integer> currentColumnSet = new HashSet<>();
            for (int i = 0; i < M; i++) {
                currentColumnSet.add(matrix[i][j]);
            }
            if (currentColumnSet.equals(lastColumnSet)) {
                similarColumnsCount++;
            }
        }

        System.out.println("Amount of matrix columns similar to the last column: " + similarColumnsCount);

    }
}
