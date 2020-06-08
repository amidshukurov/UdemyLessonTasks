package jsontoxml;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Header {

    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Company List")
    @Expose
    private List<CompanyList> companyList = null;

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CompanyList> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<CompanyList> companyList) {
        this.companyList = companyList;
    }
}
