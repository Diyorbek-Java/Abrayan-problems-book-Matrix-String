package stringSolution.additionalTasks;

import java.util.Scanner;


public class Solution65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string with an encrypted English sentence and its decrypted first character C are given (the character
                C is always an English letter). The string is encrypted by means of the right cyclic shift of any letter
                by K positions of the English alphabet (see String63). Find the number K and decrypt the given string.
                """);
        System.out.print("Enter the sentence : ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the Character: ");
        char character = scanner.next().charAt(0);

        int k = findK(sentence, character);
        if (k != -1) {
            String decrypted = decrypt(sentence, k);
            System.out.println("Given sentence: " + sentence);
            System.out.println("Decrypted: " + decrypted);
            System.out.println("Found K: " + k);
        } else {
            System.out.println("K not found!");
        }


    }

    public static String decrypt(String input, int k) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                chars[i] = (char) ((c - base - k + 26) % 26 + base);
            }
        }
        return new String(chars);
    }

    public static int findK(String encrypted, char decryptedFirstChar) {
        for (int k = 0; k < 26; k++) {
            String decrypted = decrypt(encrypted, k);
            if (decrypted.charAt(0) == decryptedFirstChar) {
                return k;
            }
        }
        return -1;
    }
}
