package models;

/**
 * Created by nicole on 3/23/15 AD.
 */

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class RegularUser extends Model implements User{
    @Id
    private String ID;
    @Column
    private String name;

    private String pass;
    private List<ProjectAccount> knownProject;
    public void Vote(){}
    public void Rate(){}
    public void Unlock(){}

    @Override
    public String getID() {
        return this.ID;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean validate(String name, String pass) {
        return this.getName().equals(name) && this.pass.equals(pass);
    }

    @Override
    public void login() {


    }

    @Override
    public void logout() {

    }
}
