package jsontoxml;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CompanyList {

    @SerializedName("Company")
    @Expose
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
