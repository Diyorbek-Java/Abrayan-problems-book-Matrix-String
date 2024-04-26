package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution04 {

    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Write a recursive integer function Fib1(N) that returns the Fibonacci number FN (N is a positive integer).
                The Fibonacci numbers FK are defined as:
                    F1 = F2 = 1,        FK = FK−2 + FK−1,    K = 3, 4, … .
                Using the function Fib1, find the Fibonacci numbers FN for five given integers N; output the value of each Fibonacci number and also the amount of the recursive function calls, which are required for its calculation.
                """);

        System.out.print("Enter 5 integers to test recursive function: ");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Fibonacci Numbers:");
        for (int num : arr) {
            count = 0;
            int fib = Fib1(num);
            System.out.println("F" + num + " = " + fib + ", Recursive Calls: " + count);
        }


    }

    public static int Fib1(int N) {
        count++;
        if (N == 1 || N == 2)
            return 1;
        else
            return Fib1(N - 2) + Fib1(N - 1);
    }

}
