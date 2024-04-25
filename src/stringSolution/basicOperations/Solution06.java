package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A character C representing a digit or a letter of the Latin alphabet is given. If C is a digit then output
                the string "digit", if C is a capital letter then output the string "capital", otherwise output the string "small".
                """);
        System.out.print("Enter Character C: ");
        char c = scanner.next().charAt(0);
        scanner.close();
        String result = checkCharacterType(c);
        System.out.println("Character C is " + result);

    }

    public static String checkCharacterType(char C) {
        if (Character.isDigit(C)) {
            return "digit";
        } else if (Character.isUpperCase(C)) {
            return "capital";
        } else {
            return "small";
        }
    }
}
