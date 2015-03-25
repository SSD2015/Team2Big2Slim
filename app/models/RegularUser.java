package models;

import java.util.List;

/**
 * Created by nicole on 3/23/15 AD.
 */
public class RegularUser extends User{
    private List<Project> knownProject;
    public void Vote(){}
    public void Rate(){}
    public void Unlock(){}

    @Override
    public boolean validate(String name, String pass) {
        return false;
    }

    @Override
    public void login() {


    }

    @Override
    public void logout() {

    }
}
