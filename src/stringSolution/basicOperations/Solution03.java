package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given a character C, output two characters: the first character precedes C in the character set, the second one follows C in the character set.");
        System.out.print("Enter the first character: ");
        char c = scanner.next().charAt(0);
        scanner.close();

        char preceding = (char) (c - 1);
        char following = (char) (c + 1);
        System.out.println("Preceding character of '" + c + "' is: " + preceding);
        System.out.println("Following character of '" + c + "' is: " + following);
    }
}
