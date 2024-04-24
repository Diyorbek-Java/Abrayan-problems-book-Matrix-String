package matrix;

import java.util.Scanner;

public class Solution31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Find the order numbers of row and
                column for an element whose value is the closest to the average of all matrix elements.
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
        double totalSum = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                totalSum += matrix[i][j];
            }
        }

        double average = totalSum / M;

        double minDifference = Double.POSITIVE_INFINITY;
        int closestRow = -1;
        int closestColumn = -1;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                double difference = Math.abs(matrix[i][j] - average);
                if (difference < minDifference) {
                    minDifference = difference;
                    closestRow = i;
                    closestColumn = j;
                }
            }
        }

        System.out.println("Order numbers of row and column for the element closest to the average:");
        System.out.println("Row: " + (closestRow + 1));
        System.out.println("Column: " + (closestColumn + 1));


    }
}
