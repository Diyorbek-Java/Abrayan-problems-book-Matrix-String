package stringSolution.basicOperations;

import java.util.Scanner;


public class Solution39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string with at least one blank character is given. Output the substring of S that contains all
                characters between the first and the second blank character. If the string S contains only one
                blank character then output an empty string
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();

        String result = extractSubstring(s);
        System.out.println("The substring of S that contains all characters between the first and the second blank character is" + result);

    }

    public static String extractSubstring(String S) {
        int firstBlankIndex = S.indexOf(' ');
        int secondBlankIndex = S.indexOf(' ', firstBlankIndex + 1);


        if (secondBlankIndex != -1 && secondBlankIndex != firstBlankIndex + 1) {

            return S.substring(firstBlankIndex + 1, secondBlankIndex);
        } else {

            return "";
        }
    }

}
