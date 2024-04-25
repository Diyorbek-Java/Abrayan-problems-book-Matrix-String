package stringSolution.basicOperations;

import java.util.Scanner;


public class Solution40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string with at least one blank character is given. Output the substring of S that contains all
                characters between the first and the last blank character. If the string S contains only one
                blank character then output an empty string
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();

        String result = extractSubstring(s);
        System.out.println("The substring of S that contains all characters between the first and the last blank character is" + result);

    }

    public static String extractSubstring(String S) {
        int firstBlankIndex = S.indexOf(' ');

        int lastBlankIndex = S.lastIndexOf(' ');


        if (firstBlankIndex != -1 && lastBlankIndex != -1 && firstBlankIndex != lastBlankIndex) {


            return S.substring(firstBlankIndex + 1, lastBlankIndex);
        } else {

            return "";
        }
    }

}
