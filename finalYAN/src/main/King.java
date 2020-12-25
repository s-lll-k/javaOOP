package main;

public class King extends Piece{
    private boolean castlingDone;
    public King(boolean castlingDone){
        this.castlingDone=castlingDone;
    }
    public boolean canMove(){
        return true;
    }

    public boolean isCastlingDone() {
        return castlingDone;
    }

    public void setCastlingDone(boolean castlingDone) {
        this.castlingDone = castlingDone;
    }
}
