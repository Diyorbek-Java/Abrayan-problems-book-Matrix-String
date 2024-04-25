package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                 Given a string, convert all Latin capital letters of the string to lowercase.
                """);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        scanner.close();

        System.out.println("Given String in lower case is " + str.toLowerCase());

    }
}
