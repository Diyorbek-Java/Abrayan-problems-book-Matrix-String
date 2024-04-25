package stringSolution.basicOperations;

import java.util.Scanner;


public class Solution33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Two strings S, S0 are given. Remove the first occurrence of S0 from the string S.
                If the string S does not contain required substrings then do not change it.
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();
        System.out.print("Enter the string S0: ");
        String s1 = scanner.nextLine();

        String result = removeFirstOccurrence(s,s1);
        System.out.println("Result: " + result);

    }

    public static String removeFirstOccurrence(String S, String S1) {
        int index = S.indexOf(S1);

        if (index != -1) {
            return S.substring(0, index) + S.substring(index + S1.length());
        } else {

            return S;
        }
    }

}
