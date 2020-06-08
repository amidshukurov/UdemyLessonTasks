package udemysecondmonth;

import java.io.*;

public class ObjectFileUtility {
    public static void writeObjectToFile(Object obj, String fileName) throws Exception {
        try (FileOutputStream fo = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fo)){
            out.writeObject(obj);
        }
    }

    public static Object readObjectFromFile(String fileName) throws Exception {
        Object obj = null;
        try (FileInputStream fi = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(fi)){
            obj = in.readObject();
            return obj;
        } finally {
            return obj;
        }
    }
}
