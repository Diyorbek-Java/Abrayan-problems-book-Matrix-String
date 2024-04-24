package matrix.changing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Rearrange the matrix rows so that values of their first elements were in ascending order.
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

        double[][] rearrangedMatrix = rearrangeRows(matrix);

        System.out.println("Rearranged matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(rearrangedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] rearrangeRows(double[][] matrix) {
        Integer[] rowIndices = new Integer[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            rowIndices[i] = i;
        }

        Arrays.sort(rowIndices, Comparator.comparingDouble(index -> matrix[index][0]));

        double[][] rearrangedMatrix = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {

            System.arraycopy(matrix[rowIndices[i]], 0, rearrangedMatrix[i], 0, matrix[0].length);
        }

        return rearrangedMatrix;
    }
}
