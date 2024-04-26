package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Write a recursive integer function DigitSum(K) that returns the sum of digits of an integer K (the loop
                statements should not be used). Using this function, output the sum of digits for each of five given integers.
                """);

        System.out.println("Enter five integers:");

        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            int sum = DigitSum(number);
            System.out.println("Sum of digits of " + number + ": " + sum);
        }
    }

    public static int DigitSum(int K) {
        if (K < 10) {
            return K;
        } else {
            return K % 10 + DigitSum(K / 10);
        }
    }


}
