package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a string that represents an arithmetic expression of the form "<digit>±< digit>±…±<digit>" with
                operators "+" and "−" only (for example, "4+7−2−8"), output the value of given expression as an integer.
                """);
        System.out.print("Enter a text: ");
        String expression = scanner.nextLine();
        String[] tokens = expression.split("[+-]");

        int result = Integer.parseInt(tokens[0]);

        for (int i = 1; i < tokens.length; i++) {

            char operator = expression.charAt(tokens[i - 1].length());
            int num = Integer.parseInt(tokens[i]);

            if (operator == '+') {
                result += num;
            } else if (operator == '-') {
                result -= num;
            }
        }
        System.out.println("The result is: " + result);

    }

}
