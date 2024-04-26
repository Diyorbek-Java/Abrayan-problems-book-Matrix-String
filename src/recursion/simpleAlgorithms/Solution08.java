package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Write a recursive real-valued function RootK(X, K, N) that returns an approximate value of a K-th root of X using the following formulas:
                
                Y0 = 1,        YN+1 = YN − (YN − X/(YN)K−1)/K,
                
                where X (> 0) is a real number, K (> 1), N (> 0) are integers, YN denotes RootK(X, K, N) for a fixed values of X and K. Using this function, output approximate values of a K-th root of X for a given X, K and six integers N.
                """);

        System.out.print("Enter the value of X (> 0): ");
        double X = scanner.nextDouble();

        System.out.print("Enter the value of K (> 1): ");
        int K = scanner.nextInt();

        System.out.println("Enter six values of N (> 0):");
        for (int i = 0; i < 6; i++) {
            int N = scanner.nextInt();
            if (N > 0) {
                double result = rootK(X, K, N);
                System.out.println("Approximate K-th root of " + X + " for N = " + N + ": " + result);
            } else {
                System.out.println("Please enter a value of N greater than 0.");
                i--;
            }
        }
    }

    public static double rootK(double X, int K, int N) {
        if (N == 0) {
            return 1;
        }
        double YN = rootK(X, K, N - 1);
        return YN - (YN - X / Math.pow(YN, K - 1)) / K;
    }


}
