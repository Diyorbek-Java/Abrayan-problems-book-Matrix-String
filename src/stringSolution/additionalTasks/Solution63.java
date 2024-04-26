package stringSolution.additionalTasks;

import java.util.Scanner;


public class Solution63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string with an English sentence and an integer K (0 < K < 10) are given. Encrypt the string using the right
                cyclic shift of any letter by K positions of the English alphabet (for instance, if K = 2 then the letter
                "A" is encoded by the letter "C", "a" is encoded by "c", "B" is encoded by "D", "z" is encoded by "b",
                and so on). Do not change blank characters and punctuation marks.
                """);
        System.out.print("Enter the sentence : ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the integer K : ");
        int k = scanner.nextInt();

        String encrypted = encrypt(sentence, k);
        System.out.println("Given Sentence: " + sentence);
        System.out.println("Encrypted: " + encrypted);

    }

    public static String encrypt(String input, int k) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                chars[i] = (char) ((c - base + k) % 26 + base);
            }
        }
        return new String(chars);
    }
}
