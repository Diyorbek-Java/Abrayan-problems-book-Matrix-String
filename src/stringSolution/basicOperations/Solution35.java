package stringSolution.basicOperations;

import java.util.Scanner;


public class Solution35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Two strings S, S0 are given. Remove all occurrences of S0 from the string S.
                If the string S does not contain required substrings then do not change it.
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();
        System.out.print("Enter the string S0: ");
        String s1 = scanner.nextLine();

        String result = removeAllOccurrences(s, s1);
        System.out.println("After removing all occurrence: " + result);

    }

    public static String removeAllOccurrences(String s, String s1) {
        int index = s.indexOf(s1);

        while (index != -1) {

            s = s.substring(0, index) + s.substring(index + s1.length());

            index = s.indexOf(s1);
        }

        return s;
    }

}
