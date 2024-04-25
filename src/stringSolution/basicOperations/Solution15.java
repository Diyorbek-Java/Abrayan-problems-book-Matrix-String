package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a string, find the amount of Latin letters in the string.
                """);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        scanner.close();

        char[] arr = str.toCharArray();
        int amountOfLetters = 0;
        for (char c : arr)
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
                amountOfLetters++;


        System.out.printf("Amount of Latin letters: is %d", amountOfLetters);

    }
}
