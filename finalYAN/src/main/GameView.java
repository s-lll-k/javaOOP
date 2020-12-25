package main;
import users.Player;
public class GameView {
    private Player player;
    public boolean makeMove(){
        return true;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
