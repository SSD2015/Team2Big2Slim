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
    private String username;
    private String password;

    public static Finder<Integer, User> find = new Finder<Integer,User>(
            Integer.class, User.class
    );

    public int getID() {
        return ID;
    }

}
