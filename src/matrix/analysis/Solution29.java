package matrix.analysis;

import java.util.Scanner;

public class Solution29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. For each matrix row find the amount of elements
                that are smaller than the average of all elements of this row.
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

        int[] smallerThanRowAvg = new int[M];

        for (int i = 0; i < M; i++) {
            double rowSum = 0;
            for (int j = 0; j < N; j++) {
                rowSum += matrix[i][j];
            }
            double average = rowSum / N;
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] < average) {
                    smallerThanRowAvg[i]++;
                }
            }
        }

        System.out.println("Number of elements smaller than the average for each row:");
        for (int i = 0; i < M; i++) {
            System.out.println("Row " + (i + 1) + ": " + smallerThanRowAvg[i]);
        }

    }
}
