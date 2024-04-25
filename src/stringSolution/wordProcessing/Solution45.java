package stringSolution.wordProcessing;

import java.util.Scanner;


public class Solution45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                 A string that contains English words separated by one or more blank characters is given. Find the length of the shortest word.
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();

        int shortestLength = findShortestWordLength(s);
        System.out.println("Length of the shortest word: " + shortestLength);

    }

    public static int findShortestWordLength(String S) {
        String[] words = S.split(" ");
        int shortestLength = Integer.MAX_VALUE;

        for (String word : words) {
            shortestLength = Math.min(shortestLength, word.length());
        }

        return shortestLength == Integer.MAX_VALUE ? 0 : shortestLength;
    }


}
