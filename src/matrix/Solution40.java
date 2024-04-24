package matrix;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of integers is given. Find the order number of the last row that
                contains the maximal amount of elements with equal values.
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

        int maxFrequencyRow = findMaxFrequencyRow(matrix);

        System.out.println("Order number of the last row with maximal amount of equal elements: " + maxFrequencyRow);

    }

    public static int findMaxFrequencyRow(int[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;
        int[] frequency = new int[M];
        int maxFrequencyRow = 0;
        int maxFrequency = 0;
        for (int i = 0; i < M; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < N; j++) {
                set.add(matrix[i][j]);
            }
            frequency[i] = set.size();
            if (frequency[i] >= maxFrequency) {
                maxFrequencyRow = i + 1;
                maxFrequency = frequency[i];
            }
        }
        return maxFrequencyRow;
    }
}
