package main;
import enums.AccountStatus;
public class Accaunt {
    private int id;
    private String Password;
    private AccountStatus status;


    public Accaunt(int id,String Password,AccountStatus status){
        this.id=id;
        this.Password=Password;
        this.status=status;
    }
    public boolean resetPassword(){
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }
}
