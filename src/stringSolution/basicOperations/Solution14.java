package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a string, find the amount of Latin capital letters in the string.
                """);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        scanner.close();

        char[] arr = str.toCharArray();
        int amountOfCapitalLetters = 0;
        for (char c : arr)
            if (c >= 'A' && c <= 'Z')
                amountOfCapitalLetters++;



        System.out.printf("Amount of Capital letters: is %d", amountOfCapitalLetters);

    }
}
