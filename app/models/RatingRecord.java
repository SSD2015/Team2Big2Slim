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

                ScoreSummarize rateResult = new ScoreSummarize();

                int scoreSummation = 0;
                int noRateCount = 0;
                double participant = 10;
                double averageScore = 0;

                //Got a list of a project with this criteria
                List<RatingRecord> criterionScore = find.where().eq("projectID", project.ID).eq("criteriaID", criterion.ID).findList();
                for(RatingRecord eachScore : criterionScore) {
                    if( eachScore.getScore() == 0 ) {
                        noRateCount++;
                    }
                    else {
                        scoreSummation += eachScore.getScore();
                    }
                    //System.out.println(scoreSummation);
                }
                //System.out.println("no " + noRateCount);
                //System.out.println("par " + criterionScore.size());
                participant = criterionScore.size() - noRateCount;
                if( participant == 0 ) {
                    averageScore = 0;
                }
                else {
                    averageScore = scoreSummation / participant;
                }

                //System.out.println("Project" + project.getID() + ", Criteria" + criterion.ID + ", score: " + scoreSummation);
                rateResult.summation = scoreSummation;
                rateResult.averageScore = averageScore;
                result.put(project, criterion, rateResult);
            }
        }
        return result;
    }

    public static class ScoreSummarize {
        public int summation;
        public double averageScore;
    }
}
