package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class dummyProject extends Model  {
    @Id
    public String ID;
    public String name;
    public int score;

}