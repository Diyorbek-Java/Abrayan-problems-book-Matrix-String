package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Write a recursive integer function DigitCount(S) that returns the amount of digit characters in a
                string S (the loop statements should not be used). Using this function, output the amount of digit
                characters for each of five given strings.
                """);

        System.out.println("Enter five strings:");

        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            int count = DigitCount(str);
            System.out.println("Number of digit characters in \"" + str + "\": " + count);
        }
    }

    public static int DigitCount(String S) {
        if (S.isEmpty()) {
            return 0;
        } else {
            char firstChar = S.charAt(0);
            int countInRest = DigitCount(S.substring(1));
            if (Character.isDigit(firstChar)) {
                return 1 + countInRest;
            } else {
                return countInRest; // Otherwise, return count without incrementing
            }
        }
    }


}
