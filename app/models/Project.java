package models;

/**
 * Created by nicole on 3/5/15 AD.
 */
import javax.persistence.Entity;
<<<<<<< HEAD
=======
import javax.persistence.Id;
import java.io.Serializable;
>>>>>>> MakeObject
import java.util.ArrayList;

@Entity
public class Project extends User {
    public int score;
    public String ProfilePic;
    public ArrayList<String> picture;

    public static Finder<String,Project> find = new Finder<String,Project>(
            String.class, Project.class
    );

<<<<<<< HEAD
=======
    @Override
    public boolean validate(String name, String pass) {
        return false;
    }

    @Override
    public void login(){

    }

    @Override
    public void logout() {

    }

>>>>>>> MakeObject

}