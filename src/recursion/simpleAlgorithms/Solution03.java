package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Write a recursive real-valued function PowerN(X, N) that returns the power XN (X ≠ 0 is a real number,
                N is an integer) calculated as follows:
                X^0 = 1,
                X^N = (X^(N div 2))^2 if N is a positive even number,
                X^N = X·X^(N−1) if N is a positive odd number,
                X^N = 1/X −N if N < 0,
                                
                where "div" denotes the operator of integer division. Using this function, output powers XN for a given
                real number X and five given integers N.
                """);

        System.out.print("Enter integer N: ");
        int n = scanner.nextInt();
        System.out.print("Enter power X: ");
        double x = scanner.nextDouble();
        scanner.close();
        System.out.print("Power when x = %s and n = %d is " + powerN(x, n));


    }

    public static double powerN(double X, int N) {
        if (N == 0)
            return 1;
        else if (N > 0) {
            if (N % 2 == 0) {
                double temp = powerN(X, N / 2);
                return temp * temp;
            } else {
                return X * powerN(X, N - 1);
            }
        } else {
            return 1 / powerN(X, -N);
        }
    }

}
