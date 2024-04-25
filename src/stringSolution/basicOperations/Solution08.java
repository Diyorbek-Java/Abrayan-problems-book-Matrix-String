package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an integer N (> 0) and a character C, output a string that is of length N and contains characters C.
                """);
        System.out.print("Enter integer N: ");
        int n = scanner.nextInt();
        System.out.print("Enter character C: ");
        char c = scanner.next().charAt(0);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(c);
        }
        System.out.println("Result is " + stringBuilder.toString());

        scanner.close();

    }

}
