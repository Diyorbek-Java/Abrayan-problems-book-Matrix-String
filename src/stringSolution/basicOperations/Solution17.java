package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a string, convert all Latin small letters of the string to uppercase.
                """);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        scanner.close();

        System.out.println("Given String in upper case is " + str.toUpperCase());

    }
}
