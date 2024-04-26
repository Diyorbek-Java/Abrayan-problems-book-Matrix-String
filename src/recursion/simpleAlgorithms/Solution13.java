package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Write a recursive logical function Palindrome(S) that returns True if a string S is a palindrome (i. e.,
                it is read equally both from left to right and from right to left), and False otherwise; the loop
                statements should not be used. Output return values of this function for five given string parameters.
                """);

        System.out.println("Enter five strings:");

        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            boolean isPalindrome = Palindrome(str);
            System.out.println("Is \"" + str + "\" a palindrome? " + isPalindrome);
        }
    }

    public static boolean Palindrome(String S) {
        if (S.length() <= 1) {
            return true;
        } else {
            if (S.charAt(0) != S.charAt(S.length() - 1)) {
                return false;
            } else {
                return Palindrome(S.substring(1, S.length() - 1));
            }
        }
    }


}
