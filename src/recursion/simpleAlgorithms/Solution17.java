package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution17 {

    public static String expression;
    public static int index;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a string S that represents a correct expression of integer type, output the value of this expression. The expression is defined as follows:
                                                   <expression>	::=	<digit> |
                                                            (<expression><operator><expression>)
                                                   <operator>	::=	+ | − | *
                """);

        System.out.print("Enter the strings:");
        String s = scanner.nextLine();

        int result = evaluate(s);
        System.out.println("The result is: " + result);

    }


    public static int evaluate(String s) {
        expression = s;
        index = 0;
        return evaluateExpression();
    }

    public static int evaluateExpression() {
        int value = evaluateOperator();
        while (index < expression.length() && (expression.charAt(index) == '+' || expression.charAt(index) == '-' || expression.charAt(index) == '*')) {
            char operator = expression.charAt(index);
            index++;
            int nextOperand = evaluateOperator();
            if (operator == '+') {
                value += nextOperand;
            } else if (operator == '-') {
                value -= nextOperand;
            } else if (operator == '*') {
                value *= nextOperand;
            }
        }
        return value;
    }

    public static int evaluateOperator() {
        if (Character.isDigit(expression.charAt(index))) {
            return readNumber();
        } else if (expression.charAt(index) == '(') {
            index++;
            int value = evaluateExpression();
            index++;
            return value;
        } else {
            throw new IllegalArgumentException("Invalid expression");
        }
    }

    public static int readNumber() {
        int number = 0;
        while (index < expression.length() && Character.isDigit(expression.charAt(index))) {
            number = number * 10 + (expression.charAt(index) - '0');
            index++;
        }
        return number;
    }

}