package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a character C and two strings S, S0, insert the string S0 into the string S before
                each occurrence of the character C.
                """);

        System.out.print("Enter the character C: ");
        char c = scanner.nextLine().charAt(0);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();
        System.out.print("Enter the string S0: ");
        String s1 = scanner.nextLine();

        String result = insertStringBeforeOccurrences(c, s, s1);
        System.out.println("Result: " + result);
    }

    public static String insertStringBeforeOccurrences(char C, String S, String S0) {
        StringBuilder modifiedString = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {

            if (S.charAt(i) == C) {
                modifiedString.append(S0);
            }
            modifiedString.append(S.charAt(i));
        }
        return modifiedString.toString();
    }

}
