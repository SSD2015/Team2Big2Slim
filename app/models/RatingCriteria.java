package models;

import play.db.ebean.Model;

import javax.persistence.Id;

/**
 * Created by momomomomo on 4/8/2015.
 */
public class RatingCriteria extends Model {
    @Id
    public int ID;
    public int criteriaID;
    public String criteriaName;

    public static Finder<Integer, RatingCriteria> find = new Finder<Integer,RatingCriteria>(
            Integer.class, RatingCriteria.class
    );
}
