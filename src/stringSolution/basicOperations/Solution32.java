package stringSolution.basicOperations;

import java.util.Scanner;


public class Solution32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Two strings S, S0 are given. If the string S0 is a substring of S then output True, otherwise output False. 
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();
        System.out.print("Enter the string S0: ");
        String s1 = scanner.nextLine();

        int occurrences = countOccurrences(s, s1);
        System.out.println("Occurrences of S0 in S: " + occurrences);

    }

    public static int countOccurrences(String s, String s1) {
        int count = 0;

        for (int i = 0; i <= s.length() - s1.length(); i++) {

            if (isMatch(s, s1, i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isMatch(String S, String S0, int startIndex) {

        for (int j = 0; j < S0.length(); j++) {

            if (S.charAt(startIndex + j) != S0.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
