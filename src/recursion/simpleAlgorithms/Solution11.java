package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Write a recursive integer function DigitSum(K) that returns the sum of digits of an integer K (the loop
                statements should not be used). Using this function, output the sum of digits for each of five given integers.
                """);

        System.out.print("Enter the size of array1 (1 ≤ N ≤ 10): ");
        int nA = scanner.nextInt();
        int[] array1 = new int[nA];
        System.out.println("Enter the elements of array1:");
        for (int i = 0; i < nA; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of array2 (1 ≤ N ≤ 10): ");
        int nB = scanner.nextInt();
        int[] array2 = new int[nB];
        System.out.println("Enter the elements of array2:");
        for (int i = 0; i < nB; i++) {
            array2[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of array3 (1 ≤ N ≤ 10): ");
        int n3 = scanner.nextInt();
        int[] array3 = new int[n3];
        System.out.println("Enter the elements of array3:");
        for (int i = 0; i < n3; i++) {
            array3[i] = scanner.nextInt();
        }

        // Find maximal elements for arrays array1, array2, and array3
        int maxA = MaxElem(array1, nA);
        int maxB = MaxElem(array2, nB);
        int maxC = MaxElem(array3, n3);

        // Output the maximal elements
        System.out.println("Maximal element of array array1: " + maxA);
        System.out.println("Maximal element of array array2: " + maxB);
        System.out.println("Maximal element of array array3: " + maxC);
    }

    public static int MaxElem(int[] A, int N) {
        if (N == 1) {
            return A[0]; // Base case: array of size 1
        } else {
            int maxOfRest = MaxElem(A, N - 1); // Recursively find maximal element of the rest of the array
            return Math.max(maxOfRest, A[N - 1]); // Return the maximum of maxOfRest and the last element of the array
        }
    }


}
