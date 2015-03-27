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
    public int ID;
    public int projectID;
    public int criteriaID;
    public int score;

    public static Finder<Integer, User> find = new Finder<Integer,User>(
            Integer.class, User.class
    );

    public int getID() {
        return ID;
    }

    public int getProjectID() {
        return this.projectID;
    }

    public int getCriteriaID() {
        return this.criteriaID;
    }

    public int getScore() {
        return this.score;
    }


}
