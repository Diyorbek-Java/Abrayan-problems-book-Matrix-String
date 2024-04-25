package stringSolution.wordProcessing;

import java.util.Scanner;


public class Solution49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string that contains English words separated by one or more blank characters is given. All string
                letters are in uppercase. Process each word as follows: replace all previous occurrences of its last
                letter by the character "." (for example, the word "MINIMUM" must be transformed into ".INI.UM").
                Do not change blank characters in the string.
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();

        String processedWords = processWords(s);
        System.out.println("the word processed is: " + processedWords);

    }

    public static String processWords(String S) {
        String[] words = S.split(" ");
        StringBuilder processedString = new StringBuilder();


        for (String word : words) {

            for (int i = word.length() - 1; i >= 0; i--) {

                if (i == word.length() - 1 || word.charAt(i) != word.charAt(word.length() - 1)) {
                    processedString.insert(0, word.charAt(i));
                } else {

                    processedString.insert(0, ".");
                }
            }

            if (!word.equals(words[words.length - 1])) {
                processedString.insert(0, " ");
            }
        }
        return processedString.toString();
    }


}
