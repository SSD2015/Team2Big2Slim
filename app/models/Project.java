package models;

/**
 * Created by nicole on 3/5/15 AD.
 */
import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project extends Model  {
    @Id
    public String ID;
    public String name;
    public int score;
    public static Finder<String,Project> find = new Finder<String,Project>(
            String.class, Project.class
    );

}