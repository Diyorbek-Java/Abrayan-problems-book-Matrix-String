package matrix.diagonals;

import java.util.Scanner;

public class Solution100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A real-valued square matrix A of order M is given. Rotate its elements clockwise by 90° (that is, assign
                an initial value of A1,1 to A1,M, an initial value of A1,M to AM,M, and so on).
                Do not use an additional matrix.
                """);
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();

        double[][] matrix = new double[M][M];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            System.out.printf("Enter the elements of the matrix from A(%d):", i);
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();

        System.out.println("Given Diagonal Matrix: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int layer = 0; layer < M / 2; layer++) {
            int first = layer;
            int last = M - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                double top = matrix[first][i];

                matrix[first][i] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];

                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }

        System.out.println("Changed matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }


}
