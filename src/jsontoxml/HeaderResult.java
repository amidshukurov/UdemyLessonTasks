package jsontoxml;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HeaderResult {

    @SerializedName("Header")
    @Expose
    private List<Header> header = null;

    public List<Header> getHeader() {
        return header;
    }

    public void setHeader(List<Header> header) {
        this.header = header;
    }
}
