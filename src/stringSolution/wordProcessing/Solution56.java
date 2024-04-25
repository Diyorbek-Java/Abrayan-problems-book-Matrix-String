package stringSolution.wordProcessing;

import java.util.Scanner;


public class Solution56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string with an English sentence is given. Output the shortest word in the string. If there are several
                words of the maximal length then output the last one. A word is defined as a character sequence that
                does not contain blank characters, punctuation marks and is bounded by blank characters, punctuation
                marks or the string beginning/end.
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();

        String shortestWord = findShortestWord(s);
        System.out.println("Longest word: " + shortestWord);

    }

    public static String findShortestWord(String sentence) {
        String[] words = sentence.split(" ");
        String shortestWord = "";

        for (String word : words) {

            word = word.replaceAll("^\\p{Punct}+|\\p{Punct}+$", "");

            if (shortestWord.isEmpty() || word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }
        return shortestWord;
    }

}
