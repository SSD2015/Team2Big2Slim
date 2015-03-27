package controllers;

import models.User;
import play.*;
import play.mvc.*;
import play.data.Form;
import play.db.*;
import play.db.ebean.Model;
import models.Project;

import views.html.*;

import javax.persistence.Entity;
import java.util.List;

import static play.data.Form.form;
import static play.libs.Json.toJson;

public class Vote extends Controller {

	public static class VoteScore
	{
		public String projectName;
		public int score = 0;
	}

    public static Result vote() {
        return ok(vote.render());
        //return ok( login.render( Form.form() ) );
    }
	
	public static Result submitVote()
	{
		Form<VoteScore> voteForm = Form.form(VoteScore.class).bindFromRequest();
		VoteScore info = voteForm.get();
		System.out.println("VoteForm: " + voteForm.get());
		System.out.println("Name: " + info.projectName);
        System.out.println("Score: " + info.score);
		return ok(vote.render());
	}

}
