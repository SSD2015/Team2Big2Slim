package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.commons.collections.map.MultiKeyMap;

import java.util.List;

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

    public static MultiKeyMap summarize() {
        MultiKeyMap result = new MultiKeyMap();
        List<VotingCriteria> criteria = VotingCriteria.find.all();
        List<Project> projects = Project.find.all();

        for(VotingCriteria criterion : criteria) {
            for(Project project : projects) {

                int scoreSummation = 0;

                //Got a list of a criteria
                List<VotingRecord> criterionScore = find.where().eq("criteriaID", criterion.ID).eq("projectID", project.ID).findList();
                for(VotingRecord eachScore : criterionScore) {
                    scoreSummation++;
                    //System.out.println(scoreSummation);
                }

                System.out.println("Project" + project.getID() + ", Criteria" + criterion.ID + ", score: " + scoreSummation);
                result.put(criterion, project, scoreSummation);
            }
        }
        return result;
    }

    public static int getTotalVote(int cid) {
        return VotingRecord.find.where().eq("criteriaID", cid).findList().size();
    }
}
