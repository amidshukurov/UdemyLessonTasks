package udemysecondmonth;

import java.io.File;
import java.io.FileInputStream;

public class FileUtility {
    public static byte[] readBytes(String fileName) throws Exception {
        File file = new File(fileName);
        byte[] bytesArray = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.read(bytesArray);
        return bytesArray;
    }
}
