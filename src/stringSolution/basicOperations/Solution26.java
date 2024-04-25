package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An integer N (> 0) and a string S are given. Transform the string S to a new string of length N as
                follows: if the length of S is greater than N then remove its first characters, if the length of S
                is less than N then add characters "." to the beginning of S.
                """);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        System.out.print("Enter integer N: ");
        int N = scanner.nextInt();

        String transformedString = transformString(N, text);
        System.out.println("Transformed string: " + transformedString);
    }

    public static String transformString(int N, String S) {
        if (S.length() > N) {

            return S.substring(S.length() - N);
        } else if (S.length() < N) {

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N - S.length(); i++) {
                sb.append('.');
            }
            sb.append(S);
            return sb.toString();
        } else {

            return S;
        }
    }

}
