package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Note extends Model {
    @Id
    public Long id;
    public String name;

    // Finder will help us easily query data from database.
    public static Finder<Long, Note> find =
            new Model.Finder<Long, Note>(Long.class, Note.class);
}