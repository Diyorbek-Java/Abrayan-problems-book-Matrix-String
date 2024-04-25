package stringSolution.wordProcessing;

import java.util.Scanner;


public class Solution44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string that contains English words separated by one or more blank characters is given.
                All string letters are in uppercase. Find the amount of words containing at least one letter "E".
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();

        int wordCount = countWordsWithThreeLetterE(s);

        System.out.println("Number of word is given text is " + wordCount);

    }
    public static int countWordsWithThreeLetterE(String S) {
        String[] words = S.split(" ");
        int count = 0;
        for (String word : words) {

            if (countOccurrences(word, 'E') == 3) {
                count++;
            }
        }
        return count;
    }
    public static int countOccurrences(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }


}
