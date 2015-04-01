package models;

/**
 * Created by nicole on 3/5/15 AD.
 */
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Project extends Model {
    @Id
    public int ID;
    public String projectName;
    public int voteScore;


    public static Finder<Integer, Project> find = new Finder<Integer,Project>(
            Integer.class, Project.class
    );

    public int getID() {
        return ID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void updateVote() {
        voteScore++;
    }

}