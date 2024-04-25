package stringSolution.wordProcessing;

import java.util.Scanner;


public class Solution47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string that contains English words separated by one or more blank characters is
                given. Output a new string that contains the given words (in the same order)
                separated by one character ".".
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();

        String dotWord = joinWordsWithDot(s);
        System.out.println("the word joint with dots is: " + dotWord);

    }

    public static String joinWordsWithDot(String S) {
        String[] words = S.split(" ");
        // Join the words using the "." character as the separator
        return String.join(".", words);
    }


}
