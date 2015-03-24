package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by nicole on 3/23/15 AD.
 */
@Entity
public abstract class User extends Model{
    @Id
    protected String ID;
    public String name;
    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
    public void login() {

    }
    public void logout() {

    }
}
