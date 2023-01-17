package sg.edu.nus.iss.app.workshop16.model;

import java.io.Serializable;

public class Pieces implements Serializable{
    private DecodingBoard decodingBoard;
    private Pegs pegs;
    private Rulebook rulebook;

    public DecodingBoard getDecodingBoard() {
        return decodingBoard;
    }
    public void setDecodingBoard(DecodingBoard decodingBoard) {
        this.decodingBoard = decodingBoard;
    }
    public Pegs getPegs() {
        return pegs;
    }
    public void setPegs(Pegs pegs) {
        this.pegs = pegs;
    }
    public Rulebook getRulebook() {
        return rulebook;
    }
    public void setRulebook(Rulebook rulebook) {
        this.rulebook = rulebook;
    }


}
