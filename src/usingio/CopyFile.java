package usingio;

/* Copy a text file.
To use this program, specify the name
of the source file and the destination file.
For example, to copy a file called FIRST.TXT
to a file called SECOND.TXT, use the following
command line.
java CopyFile FIRST.TXT SECOND.TXT
*/
import java.io.*;
class CopyFile {
    public static void main(String args[]) throws IOException {
        int i;
//        FileInputStream fin = null;
//        FileOutputStream fout = null;
// First, make sure that both files has been specified.
//        if(args.length != 2) {
//            System.out.println("Usage: CopyFile from to");
//            return;
//        }
// Copy a File.
        try (FileInputStream fin = new FileInputStream("C:\\Users\\User\\Desktop\\test.txt");
             FileOutputStream fout = new FileOutputStream("C:\\Users\\User\\Desktop\\test1.txt")) {
//// Attempt to open the files.
//            fin = new FileInputStream("C:\\Users\\User\\Desktop\\test.txt");
//            fout = new FileOutputStream("C:\\Users\\User\\Desktop\\test1.txt");
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
