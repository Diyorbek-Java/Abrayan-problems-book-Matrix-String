package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution22 {

    public static String expression;
    public static int index;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a string S that represents a correct expression of integer type, output the value of this expression.
                The expression is defined as follows (functions M and m return their maximal and minimal argument respectively):
                                  <expression>	::=	<digit> | M(<arguments>) | m(<arguments>)
                                  <arguments>	::=	<expression> | <expression> , <arguments>
                """);

        System.out.print("Enter the strings:");
        String s = scanner.nextLine();
        System.out.println("The Expression result is " + evaluate(s));

    }

    public static int evaluate(String s) {
        expression = s;
        index = 0;
        return evaluateExpression();
    }

    public static int evaluateArgument() {
        int arg = evaluateExpression();
        if (index < expression.length() && expression.charAt(index) == ',') {
            index++;
            return Math.min(arg, evaluateArgument());
        }
        return arg;
    }

    public static int evaluateExpression() {
        char currentChar = expression.charAt(index);
        if (Character.isDigit(currentChar)) {
            index++;
            return Character.getNumericValue(currentChar);
        } else if (currentChar == 'M') {
            index++; // Consume 'M'
            index++; // Consume '('
            int arg = evaluateArgument();
            index++; // Consume ')'
            return arg;
        } else if (currentChar == 'm') {
            index++; // Consume 'm'
            index++; // Consume '('
            int arg = evaluateArgument();
            index++; // Consume ')'
            return arg;
        } else {
            throw new IllegalArgumentException("Invalid expression");
        }
    }

}