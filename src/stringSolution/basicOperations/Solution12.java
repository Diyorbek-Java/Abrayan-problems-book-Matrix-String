package stringSolution.basicOperations;

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given a nonempty string and an integer N (> 0), output a new string that contains the given string
                characters separated by N characters "*".
                """);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the integer N: ");
        int n = scanner.nextInt();
        scanner.close();

        StringBuilder separated = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            separated.append(str.charAt(i));
            if ((i + 1) % n == 0 && i != str.length() - 1) {
                separated.append('*');
            }
        }
        System.out.println("Seperated string: " +separated.toString());

    }
}
