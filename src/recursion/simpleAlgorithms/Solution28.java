package recursion.simpleAlgorithms;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A tree of depth N is given; see the description of tree nodes in Recur27. Create a text file (with a given name) whose lines
                contain paths from the root to all tree leaves; each path must satisfy the following additional condition: the total weight
                of any initial part of the path nodes is nonnegative. The order of paths must be the same as in Recur25.
                """);

        System.out.print("Enter the depth of the tree (N): ");
        int depth = scanner.nextInt();

        System.out.print("Enter the name of the output text file: ");
        String fileName = scanner.next();

        try {
            FileWriter writer = new FileWriter(fileName);
            generatePaths(writer, "", depth, 0, 0);
            writer.close();
            System.out.println("Tree paths have been written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void generatePaths(FileWriter writer, String path, int depth, int totalWeight, int minWeight) throws IOException {
        if (depth == 0) {
            if (minWeight >= 0) {
                writer.write(path + "\n");
            }
            return;
        }

        generatePaths(writer, path + "A", depth - 1, totalWeight + 1, Math.min(minWeight, totalWeight + 1));


        generatePaths(writer, path + "B", depth - 1, totalWeight - 1, Math.min(minWeight, totalWeight - 1));
    }


}
