package matrix.diagonals;

import java.util.Scanner;

public class Solution81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A real-valued square matrix A of order M is given. Find the average of elements of its secondary diagonal:
                    A1,M,    A2,M−1,    A3,M−2,    …,    AM,1.
                """);
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();

        double[][] matrix = new double[M][M];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            System.out.printf("Enter matrix element while A(%d)", i);
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();

        double average = findAverage(matrix);

        System.out.println("Given matrix:");
        for (int i = 0; i < M; i++) {

            for (int j = 0; j < M; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The average of elements of its secondary diagonal " + average);
    }

    public static double findAverage(double[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        double sum = 0;
        int count = 0;
        double check = m + 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == check) {
                    sum += matrix[i][j];
                    count++;
                }
            }
        }
        return sum / count;
    }


}
