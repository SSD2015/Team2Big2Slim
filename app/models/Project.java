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
    public String sc4;
    public String sc5;
    public String description;

    public static Finder<Integer, Project> find = new Finder<Integer,Project>(
            Integer.class, Project.class

    );

    public static void create(String name,String PicProject,String typeApp,String description){
        Project project = new Project();
        //project.ID = id;
        project.projectName = name;
        project.PicProject = PicProject;
        project.typeApp = typeApp;
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
        create( "Untitle", "assets/project/cat_temp.jpg", "Untitle", "This is description");
    }

    public static List<Project> getAllProject() {
        return Project.find.all();
    }

    public UploadRecord getBanner(int id){
        UploadRecord banner = UploadRecord.find.where().eq("projectID", id).eq("type", "banner").findUnique();
        return banner;
    }
}