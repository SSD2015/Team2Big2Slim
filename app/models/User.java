package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by nicole on 3/23/15 AD.
 */
@Entity
public class User extends Model{
    @Id
    protected int ID;
    public String username;
    public String password;
    public String name;
    public int projectId;
    public String kuNo;

    public static Finder<Integer, User> find = new Finder<Integer,User>(
            Integer.class, User.class
    );

    public static void create(int id, String username, String password, String name, int projectId, String kuNo){
        User user = new User();
        user.ID = id;
        user.username = username;
        user.password = password;
        user.name = name;
        user.projectId = projectId;
        user.kuNo = kuNo;
        user.save();
    }

    public static Object authenticate(String username, String password) {
        User user = User.find.where().eq("username", username).eq("password", password).findUnique();
        return user;
    }

    public int getID() {
        return ID;
    }

}
