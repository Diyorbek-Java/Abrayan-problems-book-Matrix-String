package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution07 {

    static long[][] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Write a recursive integer function Combin2(N, K) that returns C(N, K) (the number of combinations of N objects taken K at a time) using the following recursive relations (N and K are integers, N > 0, 0 ≤ K ≤ N):
                .
                C(N, 0) = C(N, N) = 1,
                C(N, K) = C(N − 1, K) + C(N − 1, K − 1)    if 0 < K < N.
                .
                The integer N is assumed to be not greater than 20. Decrease the amount of recursive calls of the function Combin2 (in comparison with the Combin1 function from the task Recur6) by means of using an additional two-dimensionalUsing the function Combin1, find the numbers C(N, K) for a given integer N and five given integers K; output the value of each number and also the amount of the recursive function calls, which are required for its calculation.
                """);

        System.out.print("Enter 5 integers to test recursive function: ");
        memo = new long[21][21];

        System.out.print("Enter the value of N (N > 0 and not greater than 20): ");
        int N = scanner.nextInt();

        System.out.println("Enter five values of K (0 <= K <= N):");
        for (int i = 0; i < 5; i++) {
            int K = scanner.nextInt();
            if (K >= 0 && K <= N) {
                long result = Combin2(N, K);
                System.out.println("C(" + N + ", " + K + ") = " + result);
            } else {
                System.out.println("Please enter a value of K within the range 0 <= K <= N.");
                i--;
            }
        }
    }

    public static long Combin2(int N, int K) {
        if (K == 0 || K == N) {
            return 1;
        }

        if (memo[N][K] != 0) {
            return memo[N][K];
        }
        memo[N][K] = Combin2(N - 1, K) + Combin2(N - 1, K - 1);
        return memo[N][K];
    }


}
