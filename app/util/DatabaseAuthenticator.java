package util;


import models.User;

public class DatabaseAuthenticator extends Authenticator {
    private static DatabaseAuthenticator dba = null;

    private DatabaseAuthenticator() { }
    public static DatabaseAuthenticator getInstance() {
        if (dba == null)
            dba = new DatabaseAuthenticator();
        return dba;
    }

    public User authenticate(String username, String password) {
        User authenUser = User.authenticate(username, password);
        return authenUser;
    }
}
