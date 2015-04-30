package util;

import models.User;

public abstract class Authenticator {

    public static Authenticator getInstance() {
        //TODO make this a singleton
        return DatabaseAuthenticator.getInstance();
    }

    /** authenticate user */
    public abstract User authenticate(String username, String password);

}



