package controllers;

import play.*;
import play.mvc.*;
import play.data.Form;
import play.db.ebean.Model;
import models.dummyProject;

import views.html.*;

public class Application extends Controller {

    public Application() {
    }

    public static Result index() {
        return ok(index.render() );
    }

    public static Result voting() {
        dummyProject  project = Form.form(dummyProject.class).bindFromRequest().get();
        project.save();
        //return redirect(routes.Application.index());
        return ok(vote.render());
    }
	
	public static Result group1() {
		return ok(group1.render( Math.random()*5) );
	}

}
