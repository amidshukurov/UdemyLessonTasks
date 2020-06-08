package udemysecondmonth;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFileUtility {

    public static byte[] readBytesNio(String fileName) throws Exception {
        Path filePath = Paths.get(fileName);
        return Files.readAllBytes(filePath);
    }
    public static void writeBytesNio(byte[] data, String fileName) throws Exception {
        Path filePath = Paths.get(fileName);
        Files.write(filePath,data);
    }
    public static void readFromURLNio(String fromFile, String toFile) throws Exception {
        URL website = new URL(fromFile);
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream(toFile);
        fos.getChannel().transferFrom(rbc,0,Long.MAX_VALUE);
        fos.close();
        rbc.close();
    }


}
