package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a character C and two strings S, S0, insert the string S0 into
                the string S after each occurrence of the character C.
                """);

        System.out.print("Enter the character C: ");
        char c = scanner.nextLine().charAt(0);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();
        System.out.print("Enter the string S0: ");
        String s1 = scanner.nextLine();

        String result = insertStringAfterOccurrences(c, s, s1);
        System.out.println("Result: " + result);
    }

    public static String insertStringAfterOccurrences(char c, String s, String s1) {
        StringBuilder modifiedString = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            modifiedString.append(s.charAt(i));

            if (s.charAt(i) == c) {

                for (int j = 0; j < s1.length(); j++) {
                    modifiedString.append(s1.charAt(j));
                }
            }
        }
        return modifiedString.toString();
    }

}
