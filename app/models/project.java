package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by nathakorn on 3/26/15 AD.
 */
@Entity
public class Project extends Model {
    @Id
    public Long id;
    public String projectName;
    public String PicProject;
    public String typeApp;
    public String sc1;
    public String sc2;
    public String sc3;



    public static void create(long id,String name,String PicProject,String typeApp,String sc1,String sc2,String sc3){
        Project project = new Project();
        project.id = id;
        project.projectName = name;
        project.PicProject = PicProject;
        project.typeApp = typeApp;
        project.sc1 = sc1;
        project.sc2 = sc2;
        project.sc3 = sc3;
        project.save();
    }

    public static Finder<Long, Project> find = new Finder<Long, Project>(Long.class, Project.class);

}
