package main;

public class Piece {
    private boolean killed;
    public Piece(boolean killed){
        this.killed=killed;
    }
    public Piece(){

    }
    public boolean isWhite(){
        return true;
    }
    public boolean isKilled(){
        return true;
    }
    public boolean canMove(){
        return true;
    }
}
