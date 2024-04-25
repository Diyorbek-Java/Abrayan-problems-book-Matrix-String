package stringSolution.wordProcessing;

import java.util.Scanner;


public class Solution50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string that contains English words separated by one or more blank characters is given. Output a
                new string that contains the given words in inverse order. The words must be separated by one
                blank character.
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();

        String processedWords = reverseWords(s);
        System.out.println("inverse ordered word is: " + processedWords);

    }

    public static String reverseWords(String S) {

        String[] words = S.split(" ");
        StringBuilder reversedString = new StringBuilder();


        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);

            if (i > 0) {
                reversedString.append(" ");
            }
        }
        return reversedString.toString();
    }


}
