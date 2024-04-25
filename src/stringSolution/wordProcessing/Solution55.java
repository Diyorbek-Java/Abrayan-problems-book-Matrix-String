package stringSolution.wordProcessing;

import java.util.Scanner;


public class Solution55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                 A string with an English sentence is given. Output the longest word in the string. If there are several
                 words of the maximal length then output the first one. A word is defined as a character sequence that
                 does not contain blank characters, punctuation marks and is bounded by blank characters, punctuation
                 marks or the string beginning/end.
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();

        String longestWord = findLongestWord(s);
        System.out.println("Longest word: " + longestWord);

    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

}
