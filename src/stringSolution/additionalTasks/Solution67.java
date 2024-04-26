package stringSolution.additionalTasks;

import java.util.Scanner;


public class Solution67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string with an encrypted English sentence and its decrypted first character C are given (the character
                C is always an English letter). The string is encrypted by means of the right cyclic shift of any letter
                by K positions of the English alphabet (see String63). Find the number K and decrypt the given string.
                """);
        System.out.print("Enter the sentence : ");
        String sentence = scanner.nextLine();

        String decrypted = decrypt(sentence);
        System.out.println("Given Sentence: " + sentence);
        System.out.println("Decrypted: " + decrypted);


    }

    public static String decrypt(String input) {
        int length = input.length();
        int mid = length / 2;

        StringBuilder result = new StringBuilder();

        for (int i = length - 1; i >= mid; i--) {
            result.append(input.charAt(i));
        }

        for (int i = 0; i < mid; i++) {
            result.append(input.charAt(i));
        }

        return result.toString();
    }
}
