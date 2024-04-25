package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a nonempty string, output a new string that contains the given string characters separated by a blank character.
                """);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        scanner.close();
        StringBuilder separated = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            separated.append(str.charAt(i));
            if (i != str.length() - 1) {
                separated.append(' ');
            }
        }
        System.out.println("Seperated string: " +separated.toString());

    }
}
