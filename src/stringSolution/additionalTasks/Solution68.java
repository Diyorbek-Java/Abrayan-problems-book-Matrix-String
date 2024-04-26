package stringSolution.additionalTasks;

import java.util.Scanner;


public class Solution68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string that contains digits and Latin small letters is given. If letters of the string are in alphabetic
                order then output 0, otherwise output the order number of the first string character that is a letter
                and breaks the required order.
                """);
        System.out.print("Enter the sentence : ");
        String sentence = scanner.nextLine();

        System.out.println("according to sentence result is: " + checkOrder(sentence));

    }

    public static int checkOrder(String input) {
        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char prevChar = input.charAt(i - 1);
            if (Character.isLetter(currentChar) && Character.isLetter(prevChar)) {
                if (currentChar < prevChar) {
                    return i + 1;
                }
            }
        }
        return 0;
    }
}
