package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution15 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                 Given a string S that represents a correct expression of integer type, output the value of this expression.
                 The expression is defined as follows:
                                            <expression>	::=	<term> | <expression> + <term> |
                                                                  <expression> − <term>
                                                                   <term>	::=	<digit> | <term> * <digit>
                """);

        System.out.print("Enter the strings:");
        String s = scanner.nextLine();
        System.out.println("After evaluating result is " + evaluate(s));
    }

    public static int evaluateTerm(String s, int index) {
        if (Character.isDigit(s.charAt(index))) {
            return Character.getNumericValue(s.charAt(index));
        } else {
            int left = evaluateTerm(s, index - 1);
            int right = evaluateTerm(s, index + 1);
            return left * right;
        }
    }

    public static int evaluateExpression(String s, int index) {
        int value = evaluateTerm(s, index);
        index += 1;
        while (index < s.length() && (s.charAt(index)) == '+' || s.charAt(index) == '-') {
            char operator = s.charAt(index);
            int termValue = evaluateTerm(s, index + 1);
            if (operator == '+') {
                value += termValue;
            } else if (operator == '-') {
                value -= termValue;
            }
            index += 2;
        }
        return value;
    }

    public static int evaluate(String s) {
        return evaluateExpression(s, 0);
    }


}
