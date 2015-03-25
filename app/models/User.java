package models;
/**
 * Created by nicole on 3/23/15 AD.
 */

import java.io.Serializable;

public interface User extends Serializable {
    public String getID();
    public String getName();
    public boolean validate(String name,String pass);
    public void login();
    public void logout();
}
