package main;
import enums.GameStatus;
import users.Player;
public class Game {
    private Player currentTurn;
    private GameStatus status;
    private Move ArrayList;
    private Player player;
    private Move move;
    private Board board;
    private GameView gameView;
    public Game(Player currentTurn,GameStatus status, Move ArrayList, Player player){
        this.currentTurn=currentTurn;
        this.status=status;
        this.ArrayList=ArrayList;
        this.move= new Move();
        this.board= new Board();
        this.player=player;
    }

    public GameView getGameView() {
        return gameView;
    }

    public void setGameView(GameView gameView) {
        this.gameView = gameView;
    }

    public boolean isOVer() {
        return true;
    }

    public boolean playerMove() {
        return true;
    }

    public boolean makeMove() {
        return true;
    }

    public Move movesPlayed() {
        return ArrayList;
    }

    public GameStatus get_status() {
        return status;
    }

    public void set_status(GameStatus status) {
        this.status = status;
    }

    public Player get_currentTurn() {
        return currentTurn;
    }

    public void set_currentTurn(Player currentTurn) {
        this.currentTurn = currentTurn;
    }
}
