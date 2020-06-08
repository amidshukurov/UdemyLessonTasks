package udemysecondmonth;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(NioFileUtility.readBytesNio("test.txt")));
        System.out.println(Arrays.toString(NioFileUtility.readBytesNio("test.txt")));
        User user = new User();
        user.name = "Amid";
        ObjectFileUtility.writeObjectToFile(user,"testobj.txt");
        System.out.println((((User) ObjectFileUtility.readObjectFromFile("testobj.txt")).name));
    }
}
