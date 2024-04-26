package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Write a recursive real-valued function Fact2(N) that returns the value of double factorial of N:
                            N!! = N·(N−2)·(N−4)·…,
                where N (> 0) is an integer parameter; the last factor of the product equals 2 if N is an even number,
                and 1 otherwise. Using this function, output double factorials of five given integers.
                """);

        System.out.print("Enter number N: ");
        int n = scanner.nextInt();
        System.out.printf("The %d !! is equal to %s  ", n, fact2(n));

    }

    public static double fact2(int N) {
        if (N <= 0)
            return 1;
        else
            return N * fact2(N - 2);
    }

}
