package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by nicole on 3/23/15 AD.
 */
public abstract class User extends Model implements Serializable{
    @Id
    public String ID;
    @Constraints.Required
    public String name;
    private String password;
    public abstract boolean validate(String name,String pass);
    public abstract void login();
    public abstract void logout();
}
