package sg.edu.nus.iss.app.workshop16.model;

import java.io.Serializable;
import java.util.Random;

import jakarta.json.Json;
import jakarta.json.JsonObject;

public class Mastermind implements Serializable{
    private String name;
    private Pieces pieces;
    private String id;
    private int insertCount;
    private int updateCount;
    private boolean isUpSert;

    public Mastermind(){
        this.id = generateId(8);
    }

    private synchronized String generateId(int numChars){
        Random r = new Random();
        StringBuilder strBuilder = new StringBuilder();
        while(strBuilder.length() < numChars){
            strBuilder.append(Integer.toHexString(r.nextInt()));
        }
        return strBuilder.toString().substring(0, numChars);
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getInsertCount() {
        return insertCount;
    }
    public void setInsertCount(int insertCount) {
        this.insertCount = insertCount;
    }
    public int getUpdateCount() {
        return updateCount;
    }
    public void setUpdateCount(int updateCount) {
        this.updateCount = updateCount;
    }
    public boolean isUpSert() {
        return isUpSert;
    }
    public void setUpSert(boolean isUpSert) {
        this.isUpSert = isUpSert;
    }

    public Pieces getPieces() {
        return pieces;
    }
    public void setPieces(Pieces pieces) {
        this.pieces = pieces;
    }

    public JsonObject toJSON(){
        // TODO for pieces array.
        return Json.createObjectBuilder()
                .add("name", this.getName())
                //.add("pieces", this.getPieces())
                .add("id", this.getId())
                .add("insertCount", this.getInsertCount())
                .add("updateCount", this.getUpdateCount())
                .add("isUpSert", this.isUpSert())
                .build();
    }  

    @Override
    public String toString(){
        return this.getId() + " " + this.getName();
    }
}
