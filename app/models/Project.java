package models;

/**
 * Created by nicole on 3/5/15 AD.
 */
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Project extends Model implements User{
    @Id
    public String ID;
    public String name;
    public String pass;
    public int Vscore;
    public int Rscore;
    public String ProfilePic;
    public ArrayList<String> picture;
    public static Model.Finder<String,Project> find = new Model.Finder<String,Project>(
            String.class, Project.class
    );

    public void Vote(){
        this.Vscore++;
    }
    public void Rate(){
        this.Rscore++;
    }

    @Override
    public String getID() {
        return this.ID;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean validate(String name, String pass) {
        return (name.equals(this.name) && pass.equals(this.pass));
    }

    @Override
    public void login(){

    }

    @Override
    public void logout() {

    }

}