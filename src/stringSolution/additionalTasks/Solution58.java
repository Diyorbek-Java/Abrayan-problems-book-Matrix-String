package stringSolution.additionalTasks;

import java.util.Scanner;


public class Solution58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A string that contains a fully qualified path name (that is, the drive and directory parts, the file
                name and extension) is given. Extract the file name (without the path and extension) from the string.
                """);
        System.out.print("Enter the path S: ");
        String path = scanner.nextLine();

        String fileName = extractFileName(path);
        System.out.println("File name: " + fileName);

    }

    public static String extractFileName(String path) {

        String[] parts = path.split("[\\\\/]");

        String fileNameWithExtension = parts[parts.length - 1];

        int extensionIndex = fileNameWithExtension.lastIndexOf('.');
        if (extensionIndex != -1) {
            return fileNameWithExtension.substring(0, extensionIndex);
        } else {
            return fileNameWithExtension;
        }
    }
}
