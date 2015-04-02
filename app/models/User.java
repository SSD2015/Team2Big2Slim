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

    public static Finder<Integer, User> find = new Finder<Integer,User>(
            Integer.class, User.class
    );

    public static void create(int id, String username, String password){
        User user = new User();
        user.ID = id;
        user.username = username;
        user.password = password;
        user.save();
    }

    public int getID() {
        return ID;
    }

}