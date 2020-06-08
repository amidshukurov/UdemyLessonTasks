package usingio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadChars {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c;
        System.out.println("Enter characters, period to quit.");
        do {
            c=(char)br.read();
            System.out.println(c);
        } while (c!='.');
    }
}

