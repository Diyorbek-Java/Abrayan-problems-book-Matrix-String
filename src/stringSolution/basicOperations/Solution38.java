package stringSolution.basicOperations;

import java.util.Scanner;


public class Solution38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Three strings S, S1, S2 are given. Replace all occurrences of S1 in the string S by the string S2.
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();
        System.out.print("Enter the string S0: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter the string S0: ");
        String s2 = scanner.nextLine();

        String result = replaceAllOccurrences(s, s1, s2);
        System.out.println("After replacing all occurrence: " + result);

    }

    public static String replaceAllOccurrences(String S, String S1, String S2) {
        while (S.contains(S1)) {

            S = S.replace(S1, S2);
        }

        return S;
    }

}
