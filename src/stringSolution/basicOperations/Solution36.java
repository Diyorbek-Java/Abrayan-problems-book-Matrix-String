package stringSolution.basicOperations;

import java.util.Scanner;


public class Solution36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Three strings S, S1, S2 are given. Replace the first occurrence of S1 in the string S by the string S2.
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();
        System.out.print("Enter the string S0: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter the string S0: ");
        String s2 = scanner.nextLine();

        String result = replaceFirstOccurrence(s, s1, s2);
        System.out.println("After replacing last occurrence: " + result);

    }

    public static String replaceFirstOccurrence(String s, String s1, String s2) {
        int index = s.indexOf(s1);

        if (index != -1) {
            return s.substring(0, index) + s2 + s.substring(index + s1.length());
        } else {
            return s;
        }
    }

}
