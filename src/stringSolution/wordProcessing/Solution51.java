package stringSolution.wordProcessing;

import java.util.Arrays;
import java.util.Scanner;


public class Solution51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string that contains English words separated by one or more blank characters is given.
                All string letters are in uppercase. Output a new string that contains the given words
                in alphabetic order. The words must be separated by one blank character.
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();

        String sorted = sortWordsAlphabetically(s);
        System.out.println("Sorted string with alphabetic order: " + sorted);

    }

    public static String sortWordsAlphabetically(String S) {
        String[] words = S.split(" ");

        Arrays.sort(words);

        return String.join(" ", words);
    }


}
