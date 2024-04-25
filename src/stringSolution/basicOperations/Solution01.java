package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given a character C, output its numeric value in the character set.");
        System.out.print("Enter Character : ");
        Character c = scanner.next().charAt(0);
        scanner.close();

        int numericValue = (int) c;
        System.out.printf("Numeric value of character %c is %d\n", c, numericValue);
    }
}
