package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a string, find the amount of digits in the string.
                """);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        scanner.close();

        char[] arr = str.toCharArray();
        int amountOfDigits = 0;
        for (char c : arr)
            if (Character.isDigit(c))
                amountOfDigits++;



        System.out.printf("Amount of digits: is %d", amountOfDigits);

    }
}
