package stringSolution.wordProcessing;

import java.util.Scanner;


public class Solution46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                 A string that contains English words separated by one or more blank characters is given. Find the length of the shortest word.
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();

        int longestLength = findLongestWordLength(s);
        System.out.println("Length of the longest word: " + longestLength);

    }

    public static int findLongestWordLength(String S) {
        String[] words = S.split(" ");
        int longestLength = 0;
        for (String word : words) {

            longestLength = Math.max(longestLength, word.length());
        }
        return longestLength;
    }


}
