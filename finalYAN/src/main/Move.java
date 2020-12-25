package main;
import users.Player;
public class Move {
    private Box startBox;
    private Box endingBox;
    private  Piece pieceKilled;
    private Player player;
    private boolean isCastlingMove;
    public Move(Box startBox,Box endingBox,Piece pieceKilled,Player player,boolean isCastlingMove){
        this.endingBox=endingBox;
        this.startBox=startBox;
        this.pieceKilled=pieceKilled;
        this.player=player;
        this.isCastlingMove=isCastlingMove;
    }

    public Move() {

    }

    public void setCastingMove(){}

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Box getStartBox() {
        return startBox;
    }

    public void setStartBox(Box startBox) {
        this.startBox = startBox;
    }

    public Box getEndingBox() {
        return endingBox;
    }

    public void setEndingBox(Box endingBox) {
        this.endingBox = endingBox;
    }

    public boolean isCastlingMove() {
        return isCastlingMove;
    }

    public void setCastlingMove(boolean castlingMove) {
        isCastlingMove = castlingMove;
    }

    public Piece getPieceKilled() {
        return pieceKilled;
    }

    public void setPieceKilled(Piece pieceKilled) {
        this.pieceKilled = pieceKilled;
    }
}
