package matrix.analysis;

import java.util.Arrays;
import java.util.Scanner;

public class Solution36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of integers is given. Find the order number of the first matrix column that contains
                odd numbers only. If the matrix does not contain the required columns then output 0.
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

        int[] firstRowArray = matrix[0];

        int similarRowsCount = 0;
        for (int i = 1; i < M; i++) {
            int[] currentRowArray = matrix[i];
            if (areArraysEqual(firstRowArray, currentRowArray)) {
                similarRowsCount++;
            }
        }

        System.out.println("Amount of matrix rows similar to the first row: " + similarRowsCount);
    }
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
