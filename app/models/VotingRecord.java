package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VotingRecord extends Model{

    @Id
    public int ID;
    public int userID;
    public int criteriaID;
    public int projectID;


    public static Model.Finder<Integer, VotingRecord> find = new Model.Finder<Integer,VotingRecord>(
            Integer.class, VotingRecord.class
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

    public int getUserID() {
        return this.userID;
    }

    public void changeProject(int projectID) {
        this.projectID = projectID;
    }

}
