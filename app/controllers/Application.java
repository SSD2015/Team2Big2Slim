package controllers;

import models.Project;
import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.creater;
import views.html.group1;
import views.html.index;
import views.html.vote;

import java.util.List;

import static play.libs.Json.toJson;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result voting(){
        return ok(vote.render());
    }

    public static Result vote(String id){
        Project projects = Project.find.byId(id);
        projects.Vote();
        projects.save();
        return redirect(routes.Application.getVoteResult());
    }

    public static Result getVoteResult(){
        List<Project> projects = new Model.Finder<String, Project>(String.class, Project.class).all();
        return ok(toJson(projects));
    }

	public static Result group1() {
		return ok(group1.render( Math.random()*5) );
	}
}

