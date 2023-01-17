package sg.edu.nus.iss.app.workshop16.model;

import java.io.Serializable;

public class Rulebook implements Serializable{
    private int totalCount;
    private String file;
    
    public int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
    public String getFile() {
        return file;
    }
    public void setFile(String file) {
        this.file = file;
    }

}
