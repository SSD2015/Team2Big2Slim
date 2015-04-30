package util;

import models.User;

public class OpenIdAuthenticator extends Authenticator{

    private static  OpenIdAuthenticator opa = null;

    private  OpenIdAuthenticator() { }
    public static  OpenIdAuthenticator getInstance() {
        if (opa == null)
            opa = new  OpenIdAuthenticator();
        return opa;
    }
    
    @Override
    public User authenticate(String username, String password) {
        return null;
    }
}
