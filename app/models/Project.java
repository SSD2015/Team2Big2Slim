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
}