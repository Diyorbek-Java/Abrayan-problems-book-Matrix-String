package matrix.analysis;

import java.util.Scanner;

public class Solution30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. For each matrix column find
                the amount of elements that are greater than the average of all elements of this column.
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

        int[] graterThanColumnAvg = new int[N];
        for (int j = 0; j < N; j++) {
            double columnSum = 0;
            for (int i = 0; i < M; i++) {
                columnSum += matrix[i][j];
            }
            double average = columnSum / M;
            for (int i = 0; i < M; i++) {
                if (average < matrix[i][j]) {
                    graterThanColumnAvg[j]++;
                }
            }
        }

        System.out.println("Number of elements greater than the average for each column:");
        for (int j = 0; j < N; j++) {
            System.out.println("Column " + (j + 1) + ": " + graterThanColumnAvg[j]);
        }
    }
}
