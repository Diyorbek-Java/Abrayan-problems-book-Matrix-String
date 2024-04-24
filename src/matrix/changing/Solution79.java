package matrix.changing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution79 {
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

        double[] maxValues = findMaxValues(matrix);

        rearrangeColumns(matrix, maxValues);


        System.out.println("Rearranged matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rearrangeColumns(double[][] matrix, double[] maxValues) {
        int cols = matrix[0].length;
        int[] indices = new int[cols];
        for (int i = 0; i < cols; i++) {
            indices[i] = i;
        }
        for (int i = 0; i < cols - 1; i++) {
            for (int j = i + 1; j < cols; j++) {
                if (maxValues[j] < maxValues[i]) {
                    double temp = maxValues[i];
                    maxValues[i] = maxValues[j];
                    maxValues[j] = temp;
                    double[] tempIndices = matrix[i];
                    matrix[i] = matrix[j];
                    matrix[j] = tempIndices;
                    int tempIndex = indices[i];
                    indices[i] = indices[j];
                    indices[j] = tempIndex;
                }
            }
        }
    }

    public static double[] findMaxValues(double[][] matrix) {
        int cols = matrix[0].length;
        double[] maxValues = new double[cols];
        for (int j = 0; j < cols; j++) {
            double max = Double.NEGATIVE_INFINITY;
            for (double[] row : matrix) {
                if (row[j] > max) {
                    max = row[j];
                }
            }
            maxValues[j] = max;
        }
        return maxValues;
    }
}
