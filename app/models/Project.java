package models;

/**
 * Created by nicole on 3/5/15 AD.
 */
import controllers.Secured;
import play.db.ebean.Model;
import play.mvc.Security;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Project extends Model {
    @Id
    public int ID;
    public String projectName;
    public String PicProject;
    public String typeApp;
    public String sc1;
    public String sc2;
    public String sc3;
    public String description;

    public static Finder<Integer, Project> find = new Finder<Integer,Project>(
            Integer.class, Project.class

    );

    public static void create(int id,String name,String PicProject,String typeApp,String sc1,String sc2,String sc3, String description){
        Project project = new Project();
        project.ID = id;
        project.projectName = name;
        project.PicProject = PicProject;
        project.typeApp = typeApp;
        project.sc1 = sc1;
        project.sc2 = sc2;
        project.sc3 = sc3;
        project.description = description;
        project.save();
    }

    public int getID() {
        return ID;
    }

    public String getProjectName() {
        return projectName;
    }

    public int getVoteScore(int vc) {
       return VotingRecord.find.where().eq("projectID", this.ID).eq("criteriaID", vc).findList().size();
    }

    public int getNoOfRate(int rc) {
        return RatingRecord.find.where().eq("projectID", this.ID).eq("criteriaID", rc).findList().size();
    }

    public int getNoOfNoRate(int rc) {
        return RatingRecord.find.where().eq("projectID", this.ID).eq("criteriaID", rc).eq("score", 0).findList().size();
    }

    public int getVoteScoreAverage(int vc) {
        int voteScore = getVoteScore(vc);
        double allVotes = VotingRecord.getTotalVote(vc);
        double avg = voteScore / allVotes;
        avg *= 100;
        return (int)Math.round(avg);
    }

    public String getLowerCaseName() {
        return this.projectName.toLowerCase();
    }

    public static int getSizeOfProjectList() {
        List<Project> projectList = find.all();
        int amount = projectList.size();
        return amount;
    }

    public static Project getProjectByID(int id) {
        Project thisProject = find.byId(id);
        return thisProject;
    }
    
    public static void createTemplate() {
        //create(0, "Untitle", "404", "404", "404", "404", "404", "404");
        Project project = new Project();
        project.projectName = "Untitle";
        project.PicProject = "404";
        project.typeApp = "404";
        project.sc1 = "404";
        project.sc2 = "404";
        project.sc3 = "404";
        project.description = "404";
        project.save();
    }

    public static List<Project> getAllProject() {
        return Project.find.all();
    }

}