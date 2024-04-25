package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a nonempty string, output numeric values of its first and last character in the character set.
                """);
        System.out.print("Enter text ");
        String text = scanner.nextLine();
        scanner.close();
        char first = text.charAt(0);
        char last = text.charAt(text.length() - 1);

        System.out.printf("First char in text is %c and numeric value of it is %d ", first, (int) first);
        System.out.printf("Last char in text is %c and numeric value of it is %d ", last, (int) last);

    }

}
