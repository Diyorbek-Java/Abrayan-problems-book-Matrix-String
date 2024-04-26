package stringSolution.additionalTasks;

import java.util.Scanner;
import java.util.Stack;


public class Solution70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string that contains Latin letters and brackets of three types (parentheses "()", square brackets "[]",
                braces "{}") is given. If brackets are in correct order (that is, each closing bracket corresponds to an
                opening one of the same type) then output 0. If the string contains illegal closing brackets then output
                the order number of the first string character that is an illegal closing bracket. If the amount of
                closing brackets is less than the amount of opening ones then output −1.
                """);
        System.out.print("Enter the f sentence : ");
        String sentence = scanner.nextLine();

        System.out.println("According to sentence result is: " + checkBrackets(sentence));

    }

    public static int checkBrackets(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.push(currentChar);
            } else if (currentChar == ')' || currentChar == ']' || currentChar == '}') {
                if (stack.isEmpty()) {
                    return i + 1; // Order number starts from 1
                }

                char topChar = stack.pop();
                if ((currentChar == ')' && topChar != '(') ||
                        (currentChar == ']' && topChar != '[') ||
                        (currentChar == '}' && topChar != '{')) {
                    return i + 1; // Order number starts from 1
                }
            }
        }

        if (!stack.isEmpty()) {
            return -1;
        }

        return 0;
    }
}
