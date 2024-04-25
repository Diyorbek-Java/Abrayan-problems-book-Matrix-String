package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a string with the binary representation of a positive integer, output a new string
                with the decimal representation of this integer.
                """);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        int decimal = Integer.parseInt(text, 2);
        System.out.println("Decimal representation of this integer is " + decimal);
    }

}
