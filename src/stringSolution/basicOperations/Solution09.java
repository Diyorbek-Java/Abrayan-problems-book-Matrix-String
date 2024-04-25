package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an even integer N (> 0) and two characters C1, C2, output a string that is of length N,
                begins with C1, and contains alternating characters C1 and C2.
                """);
        System.out.print("Enter integer N: ");
        int n = scanner.nextInt();
        System.out.print("Enter character C1: ");
        char c1 = scanner.next().charAt(0);
        System.out.print("Enter character C2: ");
        char c2 = scanner.next().charAt(0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c1);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                stringBuilder.append(c1);
            } else {
                stringBuilder.append(c2);
            }
        }
        System.out.println("Result is " + stringBuilder.toString());

        scanner.close();

    }

}
