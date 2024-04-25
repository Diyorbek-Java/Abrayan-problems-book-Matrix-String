package stringSolution.wordProcessing;

import java.util.Scanner;


public class Solution54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string with an English sentence is given. Find the amount of vowels ("a", "i", "e", "o", "u") in the string.
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();

        int vowels = countVowels(s);
        System.out.println("Number of vowels in the text: " + vowels);

    }

    public static int countVowels(String sentence) {
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = Character.toLowerCase(sentence.charAt(i));
            if (isVowel(ch)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char ch) {
        String vowels = "aeiou";
        return vowels.indexOf(ch) != -1;
    }

}
