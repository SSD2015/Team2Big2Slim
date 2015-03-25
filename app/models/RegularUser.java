package models;

/**
 * Created by nicole on 3/23/15 AD.
 */

import javax.persistence.Entity;
import java.util.List;

@Entity
public class RegularUser extends User{
    private List<Project> knownProject;
    public void Vote(){}
    public void Rate(){}
    public void Unlock(){}

<<<<<<< HEAD
=======
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
>>>>>>> MakeObject
}
