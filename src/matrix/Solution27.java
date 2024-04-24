package matrix;

import java.util.Scanner;

public class Solution27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Find the maximal value among the minimal elements of matrix rows.
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

        double maxOfMinElementsRow = Double.MIN_VALUE;
        for (int i = 0; i < M; i++) {
            double minRowElement = matrix[i][0];
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] < minRowElement) {
                    minRowElement = matrix[i][j];
                }
            }
            if (minRowElement > maxOfMinElementsRow) {
                maxOfMinElementsRow = minRowElement;
            }
        }

        System.out.println("Maximal value among the minimal elements of matrix rows: " + maxOfMinElementsRow);
    }
}
