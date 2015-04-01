package controllers;

import play.*;
import play.mvc.*;
import play.data.Form;
import play.db.*;
import play.db.ebean.Model;
import models.Project;

import views.html.*;

import java.util.List;

import static play.libs.Json.toJson;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result profile()  {
        return ok(profile.render());
    }

    public static Result createProject() {
        Project project = Form.form(Project.class).bindFromRequest().get();
        project.save();
        return ok(vote.render());
    }

    public static Result voting(){
        return ok(vote.render());
    }

    /*public static Result vote(String id){
        Project projects = Project.find.byId(id);
        projects.score++;
        projects.save();
        return redirect(routes.Application.getVoteResult());
    }*/

    public static Result addProject(){
        return ok(creater.render("create project"));
    }

    public static Result getVoteResult(){
        List<Project> projects = new Model.Finder<String, Project>(String.class, Project.class).all();
        return ok(toJson(projects));
    }

	public static Result group1() {
		return ok(group1.render( Math.random()*5) );
	}
}

