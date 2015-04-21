package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import org.apache.commons.collections.map.MultiKeyMap;

import java.util.List;

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
    public int userID;

    public static Finder<Integer, RatingRecord> find = new Finder<Integer,RatingRecord>(
            Integer.class, RatingRecord.class
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

    public int getUserID() {
        return this.userID;
    }

    public void changeScore(int score) {
        this.score = score;
    }


    public static MultiKeyMap summarize() {
        MultiKeyMap result = new MultiKeyMap();
        List<Project> projects = Project.find.all();
        List<RatingCriteria> criteria = RatingCriteria.find.all();

        for(Project project : projects) {
            for(RatingCriteria criterion : criteria) {

                int scoreSummation = 0;

                //Got a list of a project with this criteria
                List<RatingRecord> criterionScore = find.where().eq("projectID", project.ID).eq("criteriaID", criterion.ID).findList();
                for(RatingRecord eachScore : criterionScore) {
                    scoreSummation += eachScore.getScore();
                }

                result.put(criterion, project, scoreSummation);
            }
        }
        return result;
    }
}
