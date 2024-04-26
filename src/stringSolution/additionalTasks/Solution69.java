package stringSolution.additionalTasks;

import java.util.Scanner;


public class Solution69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string that contains Latin letters and parentheses "(", ")" is given. If parentheses are in correct order
                (that is, each closing parenthesis ")" corresponds to an opening one "(") then output 0. If the string
                contains illegal parentheses ")" then output the order number of the first string character that is an
                illegal ")". If the amount of closing parentheses is less than the amount of opening ones then output −1.
                """);
        System.out.print("Enter the  sentence : ");
        String sentence = scanner.nextLine();

        System.out.println("According to sentence result is: " + checkParentheses(sentence));

    }

    public static int checkParentheses(String input) {
        int openParenthesesCount = 0;
        int order = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '(') {
                openParenthesesCount++;
            } else if (currentChar == ')') {
                if (openParenthesesCount == 0) {
                    order = i + 1;
                    break;
                }
                openParenthesesCount--;
            }
        }

        if (openParenthesesCount > 0) {
            return -1;
        }

        return order;
    }
}
