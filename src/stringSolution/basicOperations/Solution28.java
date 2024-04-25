package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a character C and a string S, double each occurrence of the character C in the string S.
                """);

        System.out.print("Enter the character C: ");
        char c = scanner.nextLine().charAt(0);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();

        String result = doubleOccurrences(c, s);
        System.out.println("Result: " + result);
    }

    public static String doubleOccurrences(char C, String S) {
        StringBuilder doubledString = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {

            doubledString.append(S.charAt(i));

            if (S.charAt(i) == C) {
                doubledString.append(C);
            }
        }
        return doubledString.toString();
    }

}
