package recursion.simpleAlgorithms;

import java.util.Scanner;

public class Solution14 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a string S that represents a correct expression of integer type, output the value of this expression.
                The expression is defined as follows:
                                              <expression>	::=	<digit> | <expression> + <digit> |
                                                               <expression> − <digit>
                """);

        System.out.println("Enter the strings:");
        String s = scanner.nextLine();
        System.out.println("result " + evaluateExpression(s));


    }

    public static int evaluateExpression(String s) {
        return evaluate(s, 0)[0];
    }

    private static int[] evaluate(String s, int index) {
        int result = 0;
        int currentNumber = 0;
        int sign = 1;

        while (index < s.length()) {
            char c = s.charAt(index);
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * currentNumber;
                currentNumber = 0;
                sign = 1;
            } else if (c == '−') {
                result += sign * currentNumber;
                currentNumber = 0;
                sign = -1;
            } else if (c == '(') {
                int[] nestedResult = evaluate(s, index + 1);
                result += sign * nestedResult[0];
                index = nestedResult[1];
            } else if (c == ')') {
                break;
            }
            index++;
        }

        result += sign * currentNumber;

        return new int[]{result, index};
    }


}
