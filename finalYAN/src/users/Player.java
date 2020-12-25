package users;
import dataType.Person;
import enums.AccountStatus;
import main.Accaunt;
import main.GameController;

public class Player extends Accaunt {
    private GameController gameController;
private Person person;
private int TotalGamesPlayed;
private boolean whiteSide;
    public Player(int id, String Password, AccountStatus status, int TotalGamesPlayed,Person person,boolean whiteSide) {
        super(id, Password, status);
        this.TotalGamesPlayed= TotalGamesPlayed;
        this.person=person;
        this.whiteSide=whiteSide;
    }

    public boolean isWhiteSide() {
        return false;
    }
    public boolean isCheaked(){
        return false;
    }

    public GameController getGameController() {
        return gameController;
    }

    public void setGameController(GameController gameController) {
        this.gameController = gameController;
    }

    public int getTotalGamesPlayed() {
        return TotalGamesPlayed;
    }

    public void setTotalGamesPlayed(int totalGamesPlayed) {
        TotalGamesPlayed = totalGamesPlayed;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    public boolean getWhiteSide(){
        return whiteSide;
    }

    public void setWhiteSide(boolean whiteSide) {
        this.whiteSide = whiteSide;
    }
}
