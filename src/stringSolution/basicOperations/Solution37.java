package stringSolution.basicOperations;

import java.util.Scanner;


public class Solution37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Three strings S, S1, S2 are given. Replace the last occurrence of S1 in the string S by the string S2.
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();
        System.out.print("Enter the string S0: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter the string S0: ");
        String s2 = scanner.nextLine();

        String result = replaceLastOccurrence(s, s1, s2);
        System.out.println("After replacing occurrence: " + result);

    }

    public static String replaceLastOccurrence(String S, String S1, String S2) {

        int index = S.lastIndexOf(S1);

        if (index != -1) {
            return S.substring(0, index) + S2 + S.substring(index + S1.length());
        } else {

            return S;
        }
    }

}
