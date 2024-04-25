package stringSolution.basicOperations;

import java.util.Scanner;


public class Solution31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Two strings S, S0 are given. If the string S0 is a substring of S then output True, otherwise output False. 
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();
        System.out.print("Enter the string S0: ");
        String s1 = scanner.nextLine();

        boolean result = isSubstring(s, s1);
        System.out.println("Result: " + result);

    }

    public static boolean isSubstring(String s, String s1) {

        if (s1.length() == 0) {
            return true;
        }

        for (int i = 0; i <= s.length() - s1.length(); i++) {

            if (isMatch(s, s1, i)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isMatch(String s, String s1, int startIndex) {

        for (int j = 0; j < s1.length(); j++) {

            if (s.charAt(startIndex + j) != s1.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
