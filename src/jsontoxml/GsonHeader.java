package jsontoxml;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonHeader {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\json.json"));
            Gson gson = new GsonBuilder().create();
            HeaderResult results = gson.fromJson(reader, HeaderResult.class);

            if (results != null) {
                for (Header h : results.getHeader()) {
                    String temp = ("ID: " + h.getID() + " Name: " + h.getName());
                    for (CompanyList cl : h.getCompanyList()) {
                        System.out.println(temp + " " + "Company: " + cl.getCompany());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
