package stringSolution.wordProcessing;

import java.util.Scanner;


public class Solution42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string that contains English words separated by one or more blank characters is given.
                All string letters are in uppercase. Find the amount of words whose first letter is
                coincides with the last one.
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();
        String[] words = s.split(" ");

        int count = 0;
        for (String word : words) {
            if (!word.isEmpty() && word.charAt(0) == word.charAt(word.length() - 1)) {
                count++;
            }
        }

        System.out.println("Number of word is given text is " + count);

    }


}
