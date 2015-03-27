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

    public static void create(long id,String name){
        Project project = new Project();
        project.projectName = name;
        project.id = id;
        project.save();
    }

    public static Finder<Long, Project> find = new Finder<Long, Project>(Long.class, Project.class);

}
