package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution20 {

    public static String expression;
    public static int index;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a string S that represents a correct expression of integer type, output the value of this expression.
                The expression is defined as follows (functions M and m return their maximal and minimal argument respectively):

                <expression>	::=	<digit> | M(<expression> , <expression>) |
                 	 	m(<expression> , <expression>)
                """);

        System.out.print("Enter the strings:");
        String s = scanner.nextLine();

        System.out.println("Expression result: " + evaluate(s));

    }

    public static int evaluate(String s) {
        expression = s;
        index = 0;
        return evaluateExpression();
    }

    public static int evaluateExpression() {
        char currentChar = expression.charAt(index);
        if (Character.isDigit(currentChar)) {
            index++;
            return Character.getNumericValue(currentChar);
        } else if (currentChar == 'M') {
            index++; // Consume 'M'
            index++; // Consume '('
            int arg1 = evaluateExpression();
            index++; // Consume ','
            int arg2 = evaluateExpression();
            index++; // Consume ')'
            return Math.max(arg1, arg2);
        } else if (currentChar == 'm') {
            index++; // Consume 'm'
            index++; // Consume '('
            int arg1 = evaluateExpression();
            index++; // Consume ','
            int arg2 = evaluateExpression();
            index++; // Consume ')'
            return Math.min(arg1, arg2);
        } else {
            throw new IllegalArgumentException("Invalid expression");
        }
    }


}