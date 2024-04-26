package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution05 {

    static long[] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        memo = new long[21];
        System.out.println("""
                 Write a recursive integer function Fib2(N) that returns the Fibonacci number FN (N is a positive integer).
                 The Fibonacci numbers FK are defined as:
                F1 = F2 = 1,        FK = FK−2 + FK−1,    K = 3, 4, … .
                The integer N is assumed to be not greater than 20. Decrease the amount of recursive calls of the function
                Fib2 (in comparison with the Fib1 function from the task Recur4) by means of using an additional array of
                integers that should store the Fibonacci numbers having been calculated. Using the Fib2 function, output
                the Fibonacci numbers FN for five given integers N.
                """);

        System.out.print("Enter 5 integers to test recursive function: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a positive integer N (not greater than 20): ");
            int N = scanner.nextInt();
            if (N > 0 && N <= 20) {
                long result = Fib2(N);
                System.out.println("F(" + N + ") = " + result);
            } else {
                System.out.println("Please enter a positive integer not greater than 20.");
                i--;
            }
        }


    }

    public static long Fib2(int N) {
        if (N <= 2) {
            return 1;
        }

        if (memo[N] != 0) {
            return memo[N];
        }

        memo[N] = Fib2(N - 1) + Fib2(N - 2);
        return memo[N];
    }

}
