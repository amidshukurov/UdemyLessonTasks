package usingio;

import java.io.*;
class CompFiles {
    public static void main(String args[]) {
        int i = 0, j = 0;
// Compare the files.
        try (FileInputStream f1 = new FileInputStream("C:\\Users\\User\\Desktop\\test2.txt");
             FileInputStream f2 = new FileInputStream("C:\\Users\\User\\Desktop\\test2.txt")) {
            // Check the contents of each file.
            do {
                i = f1.read();
                j = f2.read();
                if (i != j) break;
            } while (i != -1 && j != -1);
            if (i != j)
                System.out.println("Files differ.");
            else
                System.out.println("Files are the same.");
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}