package recursion.simpleAlgorithms;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A tree of depth N is given. Each internal node of the tree has three children; the left child "A" with the weight 1,
                the middle child "B" with the weight 0, the right child "C" with the weight −1. The tree root "D" has the weight 0.
                Create a text file (with a given name) whose lines contain paths from the root to all tree leaves; each path must satisfy
                two additional conditions: the total weight of any initial part of the path nodes is nonpositive, and the total weight of
                all path nodes equals 0. The order of paths must be the same as in Recur25.
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
            if (totalWeight == 0 && minWeight >= 0) {
                writer.write(path + "\n"); // Write the path to the file
            }
            return;
        }


        generatePaths(writer, path + "A", depth - 1, totalWeight + 1, Math.min(minWeight, totalWeight + 1));

        generatePaths(writer, path + "B", depth - 1, totalWeight, Math.min(minWeight, totalWeight));

        generatePaths(writer, path + "C", depth - 1, totalWeight - 1, Math.min(minWeight, totalWeight - 1));
    }


}
