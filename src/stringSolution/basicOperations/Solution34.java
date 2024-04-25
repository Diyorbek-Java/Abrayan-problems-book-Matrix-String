package stringSolution.basicOperations;

import java.util.Scanner;


public class Solution34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Two strings S, S0 are given. Remove the last occurrence of S0 from the string S.
                If the string S does not contain required substrings then do not change it.
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();
        System.out.print("Enter the string S0: ");
        String s1 = scanner.nextLine();

        String result = removeLastOccurrence(s, s1);
        System.out.println("After removing last occurrence: " + result);

    }

    public static String removeLastOccurrence(String s, String s1) {

        int index = s.lastIndexOf(s1);

        if (index != -1) {
            return s.substring(0, index) + s.substring(index + s1.length());
        } else {

            return s;
        }
    }

}
