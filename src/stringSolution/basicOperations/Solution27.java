package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Two positive integers N1, N2 and two strings S1, S2 are given. Output new string that
                contains N1 first characters of the string S1 and N2 last characters of the string S2
                (in that order).
                """);

        System.out.print("Enter integer N1: ");
        int N = scanner.nextInt();
        System.out.print("Enter integer N2: ");
        int N1 = scanner.nextInt();

        System.out.print("Enter a text1: ");
        String text = scanner.nextLine();

        System.out.print("Enter a text2: ");
        String text1 = scanner.nextLine();

        String result = concatenateSubstrings(N, N1, text, text1);
        System.out.println("Concatenated string: " + result);
    }

    public static String concatenateSubstrings(int N1, int N2, String S1, String S2) {

        String substring1 = S1.substring(0, Math.min(N1, S1.length()));

        String substring2 = S2.substring(Math.max(0, S2.length() - N2));

        return substring1 + substring2;
    }

}
