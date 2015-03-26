package controllers;

import models.ProjectAccount;
import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Result;
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
        ProjectAccount projects = ProjectAccount.find.byId(id);
        projects.Vote();
        projects.save();
        return redirect(routes.Application.getVoteResult());
    }

    public static Result getVoteResult(){
        List<ProjectAccount> projectAccounts = new Model.Finder<String, ProjectAccount>(String.class, ProjectAccount.class).all();
        return ok(toJson(projectAccounts));
    }

	public static Result group1() {
		return ok(group1.render( Math.random()*5) );
	}
}

