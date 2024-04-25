package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a string that represents a positive integer, output the sum of digits of this integer.
                """);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        int digitSum = 0;
        for (int i = 0; i < str.length(); i++) {
            digitSum += Character.getNumericValue(str.charAt(i));
        }
        System.out.println("The sum of digits of this integer is " + digitSum);

    }

}
