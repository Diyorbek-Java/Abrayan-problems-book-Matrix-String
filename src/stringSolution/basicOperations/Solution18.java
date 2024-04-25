package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a string, convert all Latin small letters of the string to uppercase.
                """);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        StringBuilder converted = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {

                converted.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {

                converted.append(Character.toUpperCase(ch));
            } else {

                converted.append(ch);
            }
        }
        System.out.println("Result is: " + converted.toString());

    }
}
