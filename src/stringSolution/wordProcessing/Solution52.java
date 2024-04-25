package stringSolution.wordProcessing;

import java.util.Arrays;
import java.util.Scanner;


public class Solution52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string with an English sentence is given. Convert the first letter of each word to uppercase. A word
                is defined as a character sequence that does not contain blank characters and is bounded by blank
                characters or the string beginning/end. If the first word character is not a letter then do not
                change this word.
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();

        String capitalized = capitalizeFirstLetterOfWords(s);
        System.out.println("Text that the first letter is capitalized " + capitalized);

    }

    public static String capitalizeFirstLetterOfWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder capitalizedSentence = new StringBuilder();


        for (int i = 0; i < words.length; i++) {

            if (Character.isLetter(words[i].charAt(0))) {

                words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
            }

            capitalizedSentence.append(words[i]);

            if (i < words.length - 1) {
                capitalizedSentence.append(" ");
            }
        }
        return capitalizedSentence.toString();
    }


}
