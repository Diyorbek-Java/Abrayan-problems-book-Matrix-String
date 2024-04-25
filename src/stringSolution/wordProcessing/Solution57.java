package stringSolution.wordProcessing;

import java.util.Scanner;


public class Solution57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                 A string with an English sentence is given. Remove all superfluous blank characters in the string,
                 so that its words were separated by exactly one blank character.
                """);
        System.out.print("Enter the string S: ");
        String s = scanner.nextLine();

        String removeSuperfluousBlanks = removeSuperfluousBlanks(s);
        System.out.println("The string S when removed superfluous blanks is: " + removeSuperfluousBlanks);

    }

    public static String removeSuperfluousBlanks(String sentence) {

        String[] words = sentence.trim().split(" ");

        return String.join(" ", words);
    }

}
