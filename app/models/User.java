package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by nicole on 3/23/15 AD.
 */
public abstract class User extends Model{
    @Id
    public String ID;
    public String name;
    public void login() {

    }
    public void logout() {

    }
}
