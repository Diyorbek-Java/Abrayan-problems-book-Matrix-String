package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution23 {

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

    public static boolean evaluate(String s) {
        expression = s;
        index = 0;
        return evaluateExpression();
    }

    public static boolean evaluateExpression() {
        char currentChar = expression.charAt(index);
        if (currentChar == 'T') {
            index++;
            return true;
        } else if (currentChar == 'F') {
            index++;
            return false;
        } else if (currentChar == 'A') {
            index += 4; // Consume "And("
            boolean arg = evaluateArgument();
            index++; // Consume ')'
            return arg;
        } else if (currentChar == 'O') {
            index += 3; // Consume "Or("
            boolean arg = evaluateArgument();
            index++; // Consume ')'
            return arg;
        } else {
            throw new IllegalArgumentException("Invalid expression");
        }
    }

    public static boolean evaluateArgument() {
        boolean arg = evaluateExpression();
        if (index < expression.length() && expression.charAt(index) == ',') {
            index++;
            return evaluateArgument() && arg;
        }
        return arg;
    }


}