package usingio;

import java.io.*;

class FileWriterKtoD {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("Enter text ('stop' to quit).");
        try (FileWriter fw = new FileWriter("test.txt")) {
            do {
                System.out.print(": ");
                str = br.readLine();
                if (str.compareTo("stop") == 0) break;
                str = str + "\r\n"; // add newline
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
