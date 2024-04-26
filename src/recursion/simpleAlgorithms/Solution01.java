package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Write a recursive real-valued function Fact(N) that returns the value of N-factorial:
                                N! = 1·2·…·N,
                where N (> 0) is an integer parameter. Using this function, output factorials of five given integers.
                """);
        System.out.print("Enter integer N:");
        int n = scanner.nextInt();
        System.out.printf("The %d factorial is equal to %d", n, factorial(n));

    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
