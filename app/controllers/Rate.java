package controllers;

import models.RatingRecord;
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
		public int score;
	}

    public static Result rate() {
        return ok(rate.render());
    }
	
	public static Result submitRate() {

        //Form<RatingRecord> ratingForm = Form.form(RatingRecord.class).bindFromRequest();
        //System.out.println("RateForm: " + ratingForm.get());
        //System.out.println("ID: " + ratingForm.get().getID());
        //System.out.println("projectID: " + ratingForm.get().getProjectID());
        //System.out.println("criteriaID: " + ratingForm.get().getCriteriaID());
        //System.out.println("score: " + ratingForm.get().getScore());

        RatingRecord record = Form.form(RatingRecord.class).bindFromRequest().get();
        record.save();
		return ok(rate.render());
	}
	
	public static Result showRateResult()
	{
	//RatingRecord.find.all()
		return ok(rateResult.render(RatingRecord.find.all()));
	}

}
