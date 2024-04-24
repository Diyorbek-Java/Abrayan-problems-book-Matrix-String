package matrix.changing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Rearrange the matrix columns so that values of their last elements were in descending order.
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

        double[][] rearrangedMatrix = rearrangeColumns(matrix);

        System.out.println("Rearranged matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(rearrangedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] rearrangeColumns(double[][] matrix) {
        Integer[] columnIndices = new Integer[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            columnIndices[i] = i;
        }

        Arrays.sort(columnIndices, Comparator.comparingDouble(index -> matrix[matrix.length - 1][index]));

        double[][] rearrangedMatrix = new double[matrix.length][matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                rearrangedMatrix[i][j] = matrix[i][columnIndices[j]];
            }
        }

        return rearrangedMatrix;
    }
}
