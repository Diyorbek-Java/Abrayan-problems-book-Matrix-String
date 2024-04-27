package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a string S that represents a correct expression of integer type, output the value of this expression.
                The expression is defined as follows:
                                              <expression>	::=	<digit> | <expression> + <digit> |
                                                               <expression> − <digit>
                """);

        System.out.print("Enter the strings:");
        String s = scanner.nextLine();

        int result = evaluate(s);
        System.out.println("Result: " + result);


    }

    public static String expression;
    public static int index;

    public static int evaluate(String s) {
        expression = s;
        index = 0;
        return evaluateExpression();
    }

    public static int evaluateExpression() {
        int value = evaluateTerm();
        while (index < expression.length() && (expression.charAt(index) == '+' || expression.charAt(index) == '-')) {
            char op = expression.charAt(index);
            index++;
            int termValue = evaluateTerm();
            if (op == '+') {
                value += termValue;
            } else {
                value -= termValue;
            }
        }
        return value;
    }

    public static int evaluateTerm() {
        int value = evaluateElement();
        while (index < expression.length() && expression.charAt(index) == '*') {
            index++;
            value *= evaluateElement();
        }
        return value;
    }

    public static int evaluateElement() {
        if (Character.isDigit(expression.charAt(index))) {
            return expression.charAt(index++) - '0';
        } else if (expression.charAt(index) == '(') {
            index++;
            int value = evaluateExpression();
            index++;
            return value;
        } else {
            throw new IllegalArgumentException("Invalid expression");
        }
    }
}