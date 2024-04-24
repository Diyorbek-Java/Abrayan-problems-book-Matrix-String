package matrix;

import java.util.Scanner;

public class Solution70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Double the occurrence of the matrix row that contains the maximal matrix element.
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

        double[][] newMatrix = doubleRowWithMaxElement(matrix);

        System.out.println("Matrix after exchanging :");
        for (double[] doubles : newMatrix) {
            for (int j = 0; j < newMatrix[0].length; j++) {
                System.out.print(doubles[j] + " ");
            }
            System.out.println();
        }

    }

    public static double[][] doubleRowWithMaxElement(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int maxRowIndex = 0;
        double maxElement = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    maxRowIndex = i;
                }
            }
        }

        double[][] newMatrix = new double[rows + 1][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newMatrix[i][j] = matrix[i][j];
            }
        }

        for (int j = 0; j < cols; j++) {
            newMatrix[rows][j] = matrix[maxRowIndex][j];
        }

        return newMatrix;
    }

}
