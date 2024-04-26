package stringSolution.additionalTasks;

import java.util.Scanner;


public class Solution66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string with an English sentence is given. Encrypt the string by moving all characters that are at the
                string positions with even numbers (2, 4, …) to the beginning of the string (in the same order) and
                moving all characters that are at the string positions with odd numbers (1, 3, …) to the end of the
                string (in inverse order). For instance, the string "Program" must be encrypted to "rgamroP".
                """);
        System.out.print("Enter the sentence : ");
        String sentence = scanner.nextLine();

        String encrypted = encrypt(sentence);
        System.out.println("Given Sentence : " + sentence);
        System.out.println("Decrypted : " + encrypted);

    }

    public static String encrypt(String input) {
        StringBuilder evenPositions = new StringBuilder();
        StringBuilder oddPositions = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (i % 2 == 0) {
                evenPositions.append(c);
            } else {
                oddPositions.insert(0, c);
            }
        }

        return evenPositions.toString() + oddPositions.toString();
    }
}
