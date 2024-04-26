package stringSolution.additionalTasks;

import java.util.Scanner;


public class Solution62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string with an English sentence is given. Encrypt the string using the right cyclic shift of any
                letter by one position of the English alphabet (for instance, the letter "A" is encoded by the letter
                "B", "a" is encoded by "b", "B" is encoded by "C", "z" is encoded by "a", and so on). Do not change
                blank characters and punctuation marks.
                """);
        System.out.print("Enter the sentence : ");
        String sentence = scanner.nextLine();

        String encrypted = encrypt(sentence);
        System.out.println("Given Sentence: " + sentence);
        System.out.println("Encrypted: " + encrypted);

    }

    public static String encrypt(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                chars[i] = (char) ((c - base + 1) % 26 + base);
            }
        }
        return new String(chars);
    }
}
