package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string is given. If the string represents an integer then output 1, if the string represents a real
                number (with nonzero fractional part) then output 2, otherwise output 0. A fractional part of a real
                number is preceded by the decimal point ".".
                """);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();


        System.out.println("Result is: " + determineNumberType(str));

    }

    public static int determineNumberType(String str) {
        try {

            int intValue = Integer.parseInt(str);

            return 1;
        } catch (NumberFormatException e) {
            try {
                double doubleValue = Double.parseDouble(str);

                if (str.contains(".") && doubleValue != (int) doubleValue) {
                    return 2;
                }
            } catch (NumberFormatException ex) {

                return 0;
            }
        }


        return 1;
    }
}
