package models;

/**
 * Created by nicole on 3/5/15 AD.
 */
import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Project extends User  {
    public int score;
    public String ProfilePic;   //
    public ArrayList<String> picture;

    public static Finder<String,Project> find = new Finder<String,Project>(
            String.class, Project.class
    );

    @Override
    public void login(){

    }

    @Override
    public void logout() {

    }


}