package controllers;

import models.Note;
import play.data.Form;
import play.mvc.Result;
import scala.collection.immutable.List;
import views.html.index;
import views.html.quicknote;

import static play.mvc.Results.ok;

/**
 * Created by momomomomo on 3/26/2015.
 */
public class Quicknote {

    public static Result index() {
        return ok(quicknote.render( Note.find.all()) );

    }

    public static Result addNote() {
        // map data from HTTP request to an object.
        Note note = Form.form(Note.class).bindFromRequest().get();
        // save it to database.
        note.save();
        // redirect to index
        return index();
    }


}
