package usingio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDtoS {
    public static void main(String[] args) {



        String str;
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
           while ((str = br.readLine())!=null){
               System.out.println(str);
           }

        } catch (IOException exc) {
            System.out.println("File nor found");
        }
    }
}
