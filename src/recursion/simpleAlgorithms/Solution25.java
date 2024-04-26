package recursion.simpleAlgorithms;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A tree of depth N is given. Each internal node of the tree has K (< 10) children that are numbered from 1 (the most left child) to K
                (the most right child). The number of the tree root is 0. Create a text file (with a given name) whose lines contain paths from the
                root to all tree leaves. Paths must be ordered from the most left path ("011...1") to the most right path (for instance, "033...3"
                provided that K = 3); the last nodes of path must be changed faster than the first ones.
                """);

        System.out.print("Enter the depth of the tree (N): ");
        int depth = scanner.nextInt();

        System.out.print("Enter the number of children for each internal node (K): ");
        int K = scanner.nextInt();

        System.out.print("Enter the name of the output text file: ");
        String fileName = scanner.next();

        try {
            FileWriter writer = new FileWriter(fileName);
            generatePaths(writer, "", depth, K);
            writer.close();
            System.out.println("Tree paths have been written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void generatePaths(FileWriter writer, String path, int depth, int K) throws IOException {
        if (depth == 0) {
            writer.write(path + "\n");
            return;
        }

        for (int i = 1; i <= K; i++) {
            generatePaths(writer, path + i, depth - 1, K);
        }
    }


}
