package stringSolution.additionalTasks;

import java.util.Scanner;


public class Solution64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string with an encrypted English sentence and an integer K (0 < K < 10) are given. The string is
                encrypted by means of the right cyclic shift of any letter by K positions of the English alphabet
                (see String63). Decrypt the given string
                """);
        System.out.print("Enter the sentence : ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the integer K : ");
        int k = scanner.nextInt();

        String encrypted = decrypt(sentence, k);
        System.out.println("Given Sentence : " + sentence);
        System.out.println("Decrypted : " + encrypted);

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
}
