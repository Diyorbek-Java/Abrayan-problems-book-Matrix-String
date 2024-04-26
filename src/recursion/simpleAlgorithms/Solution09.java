package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Write a recursive integer function GCD(A, B) that returns the greatest common divisor of two positive integers A and B. Use the Euclidean algorithm:
                .
                GCD(A, B) = GCD(B, A mod B),    if B ≠ 0;        GCD(A, 0) = A,
                .
                where "mod" denotes the operator of taking the remainder after integer division. Using this function, find the greatest common divisor for each of pairs (A, B), (A, C), (A, D) provided that integers A, B, C, D are given.
                """);

        System.out.print("Enter the value of A (positive integer): ");
        int A = scanner.nextInt();

        System.out.print("Enter the value of B (positive integer): ");
        int B = scanner.nextInt();

        // Find GCD for pair (A, B)
        int gcdAB = GCD(A, B);
        System.out.println("GCD of (" + A + ", " + B + ") = " + gcdAB);

        System.out.print("Enter the value of C (positive integer): ");
        int C = scanner.nextInt();

        // Find GCD for pair (A, C)
        int gcdAC = GCD(A, C);
        System.out.println("GCD of (" + A + ", " + C + ") = " + gcdAC);

        System.out.print("Enter the value of D (positive integer): ");
        int D = scanner.nextInt();

        // Find GCD for pair (A, D)
        int gcdAD = GCD(A, D);
        System.out.println("GCD of (" + A + ", " + D + ") = " + gcdAD);
    }

    public static int GCD(int A, int B) {
        if (B == 0) {
            return A; // Base case: GCD(A, 0) = A
        }
        // Recursive case: GCD(A, B) = GCD(B, A mod B)
        return GCD(B, A % B);
    }


}
