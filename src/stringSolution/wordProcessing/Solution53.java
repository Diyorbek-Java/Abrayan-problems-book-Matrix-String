package stringSolution.wordProcessing;

import java.util.Scanner;


public class Solution53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string with an English sentence is given. Find the amount of punctuation marks in the string.
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();

        int punctuationCount = countPunctuationMarks(s);
        System.out.println("Number of punctuation marks: " + punctuationCount);

    }

    public static int countPunctuationMarks(String sentence) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (isPunctuationMark(ch)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPunctuationMark(char ch) {
        String punctuationMarks = ".,:;!?";
        return punctuationMarks.indexOf(ch) != -1;
    }


}
