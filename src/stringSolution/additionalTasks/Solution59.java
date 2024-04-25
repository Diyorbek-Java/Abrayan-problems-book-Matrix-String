package stringSolution.additionalTasks;

import java.util.Scanner;


public class Solution59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string that contains a fully qualified path name (that is, the drive and directory parts, the file
                name and extension) is given. Extract the file name (without the path and extension) from the string.
                """);
        System.out.print("Enter the path S: ");
        String path = scanner.nextLine();

        String extension = extractExtension(path);
        System.out.println(" Extension that given on the path is: " + extension);

    }

    public static String extractExtension(String path) {

        int dotIndex = path.lastIndexOf('.');
        if (dotIndex != -1 && dotIndex < path.length() - 1) {
            return path.substring(dotIndex + 1);
        }
        return "";
    }
}
