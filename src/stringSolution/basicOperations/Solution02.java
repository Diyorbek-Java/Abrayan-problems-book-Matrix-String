package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given an integer N (32 ≤ N ≤ 126), output a character with the numeric value N in the character set.");

        System.out.print("Enter number N(32 ≤ N ≤ 126): ");
        scanner.nextLine();

        int N = scanner.nextInt();
        char c = (char) N;
        System.out.printf("Character value of %d is %c", N, c);
    }
}
