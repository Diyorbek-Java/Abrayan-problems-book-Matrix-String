package matrix;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of integers is given. Find the amount of its rows that contain no elements with equal values.
                """);
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();

        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();

        int[][] matrix = new int[M][N];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        int uniqueRowsCount = 0;
        for (int i = 0; i < M; i++) {
            if (hasUniqueElements(matrix[i])) {
                uniqueRowsCount++;
            }
        }

        System.out.println("Amount of matrix rows with no equal elements: " + uniqueRowsCount);

    }

    public static boolean hasUniqueElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
        }
        return true;
    }
}
