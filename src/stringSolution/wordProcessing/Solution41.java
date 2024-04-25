package stringSolution.wordProcessing;

import java.util.Scanner;


public class Solution41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string that contains English words separated by one or more blank characters is given.
                Find the amount of words in the string.
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();
        String[] words = s.split(" ");

        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        System.out.println("Number of word is given text is " + count);

    }


}
