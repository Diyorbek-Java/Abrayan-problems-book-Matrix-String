package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a positive integer, output all digit characters in the decimal representation of the integer (from left to right).
                """);
        System.out.print("Enter integer: ");
        int n = scanner.nextInt();

        String numString = Integer.toString(n);
        System.out.println("Digits in the decimal representation of " + n + ":");
        for (int i = 0; i < numString.length(); i++) {
            char digit = numString.charAt(i);
            System.out.println(digit);
        }

    }

}
