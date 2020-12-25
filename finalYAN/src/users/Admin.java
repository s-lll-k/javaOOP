package users;

import enums.AccountStatus;
import main.Accaunt;

public class Admin extends Accaunt {

    public Admin(int id, String Password, AccountStatus status) {
        super(id, Password, status);
    }
    public boolean blockUser() {
        return false;
    }
}
