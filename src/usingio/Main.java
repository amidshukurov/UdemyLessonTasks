package usingio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
//        if (args.length != 1) {
//            System.out.println("Usage: ShowFile File");
//            return;
//        }

        try {
            fin = new FileInputStream("C:\\Users\\User\\Desktop\\test.txt");

            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }catch (IOException e) {
            System.out.println("Error reading file");
        } finally {
            try {
               if(fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}
