package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution19 {

    public static String expression;
    public static int index;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A nonempty string S that represents an expression of integer type is given (see the expression definition in
                Recur17). Output 0 if the given expression is a correct one, otherwise output the order number of its first
                character that is invalid, superfluous or missing.
                """);

        System.out.print("Enter the strings:");
        String s = scanner.nextLine();
        System.out.println("Expression  is validated : " + validateExpression(s));

    }

    public static int validateExpression(String s) {
        expression = s;
        index = 0;
        try {
            parseExpression();
            if (index == expression.length()) {
                return 0;
            } else {
                return index + 1;
            }
        } catch (IllegalArgumentException e) {
            return index + 1;
        }
    }

    public static void parseExpression() {
        parseOperator();
        if (index < expression.length() && (expression.charAt(index) == '+' || expression.charAt(index) == '-' || expression.charAt(index) == '*')) {
            index++;
            parseOperator();
        }
    }

    public static void parseOperator() {
        if (Character.isDigit(expression.charAt(index))) {
            parseNumber();
        } else if (expression.charAt(index) == '(') {
            index++;
            parseExpression();
            if (index >= expression.length() || expression.charAt(index) != ')') {
                throw new IllegalArgumentException("Missing closing parenthesis");
            }
            index++; // Consume ')'
        } else {
            throw new IllegalArgumentException("Invalid operand");
        }
    }

    public static void parseNumber() {
        while (index < expression.length() && Character.isDigit(expression.charAt(index))) {
            index++;
        }
    }


}