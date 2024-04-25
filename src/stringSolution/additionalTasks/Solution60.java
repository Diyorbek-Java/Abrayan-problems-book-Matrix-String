package stringSolution.additionalTasks;

import java.util.Scanner;


public class Solution60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string that contains a fully qualified path name (that is, the drive and directory parts, the file
                name and extension) is given. Extract the first directory name (without backslashes "\\") from the
                string. If the file with the given name is located in the root directory then output a backslash.
                """);
        System.out.print("Enter the path S: ");
        String path = scanner.nextLine();

        String firstDirectoryName = extractFirstDirectoryName(path);
        System.out.println("First directory name: " + firstDirectoryName);

    }

    public static String extractFirstDirectoryName(String path) {
        // Split the path based on the backslash character
        String[] parts = path.split("\\\\");

        // Check if the file is located in the root directory
        if (parts.length == 1) {
            return "\\";
        }

        // Return the first directory name
        return parts[1];
    }
}
