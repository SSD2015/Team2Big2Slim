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

public class Rate extends Controller {

	public static class RateScore {
        public String category;
		public int score;
	}

    public static Result rate() {
        return ok(rate.render());
    }
	
	public static Result submitRate()
	{
		Form<RateScore> rateForm = Form.form(RateScore.class).bindFromRequest();
		System.out.println("RateForm: " + rateForm.get());
        System.out.println("Score: " + rateForm.get().score);
		return ok(rate.render());
	}

}