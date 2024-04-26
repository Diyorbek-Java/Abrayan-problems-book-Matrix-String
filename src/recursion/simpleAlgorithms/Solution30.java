package recursion.simpleAlgorithms;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A tree of depth N is given; see the description of tree nodes in Recur29. Create a text file (with a given name) whose lines
                contain paths from the root to all tree leaves; each path must satisfy two additional conditions: adjacent nodes of the path
                have different letters, and the total weight of all path nodes equals 0. The order of paths must be the same as in Recur25.
                """);

        System.out.print("Enter the depth of the tree (N): ");
        int depth = scanner.nextInt();

        System.out.print("Enter the name of the output text file: ");
        String fileName = scanner.next();

        try {
            FileWriter writer = new FileWriter(fileName);
            generatePaths(writer, "", depth, ' ', 0);
            writer.close();
            System.out.println("Tree paths have been written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void generatePaths(FileWriter writer, String path, int depth, char lastNode, int totalWeight) throws IOException {
        if (depth == 0) {
            if (totalWeight == 0) {
                writer.write(path + "\n");
            }
            return;
        }

        if (lastNode != 'A') {
            generatePaths(writer, path + "A", depth - 1, 'A', totalWeight + 1);
        }

        if (lastNode != 'B') {
            generatePaths(writer, path + "B", depth - 1, 'B', totalWeight);
        }

        if (lastNode != 'C') {
            generatePaths(writer, path + "C", depth - 1, 'C', totalWeight - 1);
        }
    }


}
