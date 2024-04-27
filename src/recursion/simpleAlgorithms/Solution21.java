package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution21 {

    public static String expression;
    public static int index;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a string S that represents a correct expression of logical type, output the value of this expression.
                The expression is defined as follows ("T" means True, "F" means False):
                <expression>	::=	T | F | And(<expression> , <expression>) |
                 	 	Or(<expression> , <expression>)
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
        } else if (currentChar == 'A') { // Assuming "And" is represented as "A"
            index += 4; // Consume "And("
            boolean arg1 = evaluateExpression();
            index++; // Consume ','
            boolean arg2 = evaluateExpression();
            index++; // Consume ')'
            return arg1 && arg2;
        } else if (currentChar == 'O') { // Assuming "Or" is represented as "O"
            index += 3; // Consume "Or("
            boolean arg1 = evaluateExpression();
            index++; // Consume ','
            boolean arg2 = evaluateExpression();
            index++; // Consume ')'
            return arg1 || arg2;
        } else {
            throw new IllegalArgumentException("Invalid expression");
        }
    }

}