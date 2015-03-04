package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class dummyProject extends Model  {
    @Id
    String ID;
    String name;
    int score;

}