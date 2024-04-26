package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution06 {

    static int recursiveCalls = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Write a recursive integer function Combin1(N, K) that returns C(N, K) (the number of combinations of N objects taken K at a time) using the following recursive relations (N and K are integers, N > 0, 0 ≤ K ≤ N):
                .
                C(N, 0) = C(N, N) = 1,
                C(N, K) = C(N − 1, K) + C(N − 1, K − 1)    if 0 < K < N.
                .
                Using the function Combin1, find the numbers C(N, K) for a given integer N and five given integers K; output the value of each number and also the amount of the recursive function calls, which are required for its calculation.
                """);

        System.out.print("Enter 5 integers to test recursive function: ");
        System.out.print("Enter the value of N (N > 0): ");
        int N = scanner.nextInt();

        System.out.println("Enter five values of K (0 <= K <= N):");
        for (int i = 0; i < 5; i++) {
            int K = scanner.nextInt();
            if (K >= 0 && K <= N) {
                recursiveCalls = 0;
                long result = Combin1(N, K);
                System.out.println("C(" + N + ", " + K + ") = " + result);
                System.out.println("Recursive calls required: " + recursiveCalls);
            } else {
                System.out.println("Please enter a value of K within the range 0 <= K <= N.");
                i--;
            }
        }
    }

    public static long Combin1(int N, int K) {
        recursiveCalls++;
        if (K == 0 || K == N) {
            return 1;
        }
        return Combin1(N - 1, K) + Combin1(N - 1, K - 1);
    }


}
