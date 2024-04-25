package stringSolution.wordProcessing;

import java.util.Scanner;


public class Solution48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string that contains English words separated by one or more blank characters is
                given. All string letters are in uppercase. Process each word as follows: replace
                all next occurrences of its first letter by the character "." (for example, the
                word "MINIMUM" must be transformed into "MINI.U."). Do not change blank characters
                in the string.
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();

        String processedWords = processWords(s);
        System.out.println("the word processed: " + processedWords);

    }

    public static String processWords(String S) {
        String[] words = S.split(" ");
        StringBuilder processedString = new StringBuilder();


        for (String word : words) {

            for (int i = 0; i < word.length(); i++) {

                if (i == 0 || word.charAt(i) != word.charAt(0)) {
                    processedString.append(word.charAt(i));
                } else {

                    processedString.append(".");
                }
            }

            if (!word.equals(words[words.length - 1])) {
                processedString.append(" ");
            }
        }
        return processedString.toString();
    }


}
