package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Created by momomomomo on 3/27/2015.
 */

@Entity
public class RatingRecord extends Model {
    @Id
    protected int ID;
    private int projectID;
    private int criteriaID;
    private int score;

    public static Finder<Integer, User> find = new Finder<Integer,User>(
            Integer.class, User.class
    );

    public int getProjectID() {
        return projectID;
    }

    public int getCriteriaID() {
        return criteriaID;
    }

    public int getScore() {
        return score;
    }


}
