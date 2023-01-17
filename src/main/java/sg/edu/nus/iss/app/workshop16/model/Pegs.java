package sg.edu.nus.iss.app.workshop16.model;

import java.io.Serializable;

public class Pegs implements Serializable{
    private int totalCount;
    private Type[] types;
    
    public int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
    public Type[] getTypes() {
        return types;
    }
    public void setTypes(Type[] types) {
        this.types = types;
    }
    
}
