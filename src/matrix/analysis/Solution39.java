package matrix.analysis;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of integers is given. Find the amount of its columns that contain no elements with equal values.
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

        int[][] transposedMatrix = transpose(matrix);

        int uniqueColumnsCount = 0;
        for (int i = 0; i < N; i++) {
            if (hasUniqueElements(transposedMatrix[i])) {
                uniqueColumnsCount++;
            }
        }

        System.out.println("Amount of matrix columns with no equal elements: " + uniqueColumnsCount);
    }

    public static int[][] transpose(int[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;
        int[][] transposed = new int[N][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static boolean hasUniqueElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
        }
        return true;
    }
}
