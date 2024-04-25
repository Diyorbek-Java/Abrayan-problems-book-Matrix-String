package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given an integer N (1 ≤ N ≤ 26), output N first capital (that is, uppercase) letters of the English
                alphabet ("A", "B", "C", and so on).
                """);
        System.out.print("Enter number N");
        int n = scanner.nextInt();
        scanner.close();
        char startChar = 'A';
        for (int i = 0; i < n; i++) {
            char currentChar = (char) (startChar + i);
            System.out.print(currentChar + " ");
        }
        System.out.println();
    }
}
