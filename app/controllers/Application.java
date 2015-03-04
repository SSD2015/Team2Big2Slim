package controllers;

import models.dummyProject;
import play.*;
import play.mvc.*;
import play.data.Form;
import play.db.ebean.Model;
import views.html.*;

import java.util.List;

import static play.libs.Json.toJson;

public class Application extends Controller {
    public Application() {
    }

    public static Result index() {
        return ok(index.render() );
    }

    public static Result profile()  {
        return ok(profile.render());
    }

    public static Result createProject() {
        dummyProject project = Form.form(dummyProject.class).bindFromRequest().get();
        Logger.trace("project ", project);
        project.save();
        return redirect(routes.Application.getVoteResult());
    }

    public static Result voting(){
        return ok(vote.render());
    }

    public static Result addProject(){
        return ok(creater.render("create project"));
    }

    public static Result getVoteResult(){
        List<dummyProject> projects = new Model.Finder<String,dummyProject>(String.class,dummyProject.class).all();
        return ok(toJson(projects));
    }
	
	public static Result group1() {
		return ok(group1.render( Math.random()*5) );
	}
}
