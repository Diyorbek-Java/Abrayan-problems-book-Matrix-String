package recursion.simpleAlgorithms;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A tree of depth N is given (N is an even number). Each internal node of the tree has two children; the left child "A" with the weight 1
                and the right child "B" with the weight −1. The tree root "C" has the weight 0. Create a text file (with a given name) whose lines contain
                paths from the root to all tree leaves; each path must satisfy the following additional condition: the total weight of all path nodes is
                equal to 0. The order of paths must be the same as in Recur25.
                """);

        System.out.print("Enter the depth of the tree (N, even number): ");
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

    public static void generatePaths(FileWriter writer, String path, int depth, int totalWeight, int nodeCount) throws IOException {
        if (depth == 0) {
            if (totalWeight == 0 && nodeCount > 0) {
                writer.write(path + "\n");
            }
            return;
        }

        generatePaths(writer, path + "A", depth - 1, totalWeight + 1, nodeCount + 1);


        generatePaths(writer, path + "B", depth - 1, totalWeight - 1, nodeCount + 1);
    }


}
