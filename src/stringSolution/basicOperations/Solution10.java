package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a string, output a new string that contains the given string characters in inverse order.
                """);
        System.out.print("Enter the string: ");
        String string = scanner.nextLine();
        scanner.close();
        StringBuilder stringBuilder = new StringBuilder(string);
        String invertedString = stringBuilder.reverse().toString();
        System.out.println("Reverse the string: " + invertedString);

    }
}
