package controllers;

import models.RatingCriteria;
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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static play.data.Form.form;
import static play.libs.Json.toJson;

import org.apache.commons.collections.map.MultiKeyMap;

public class Rate extends Controller {
	
	public static Result submitRate() {

        RatingRecord record = Form.form(RatingRecord.class).bindFromRequest().get();

        System.out.println("User ID: " + record.getUserID());
        System.out.println("RateForm: " + record);
        System.out.println("projectID: " + record.getProjectID());
        System.out.println("criteriaID: " + record.getCriteriaID());
        System.out.println("score: " + record.getScore());
        System.out.println("----------------------------");

        RatingRecord oldRecord = RatingRecord.find.where().eq("userID", record.getUserID()).eq("projectID", record.getProjectID()).eq("criteriaID", record.getCriteriaID()).findUnique();
        if( oldRecord != null ) {
            oldRecord.changeScore(record.getScore());
            Logger.info("username: " + User.find.byId(record.userID).username + " change the rate of " + record.projectID + " criteria: " + record.criteriaID + " score: " + record.score + " at " + LocalDateTime.now());
            oldRecord.save();
        }
        else {
            Logger.info("username: " + User.find.byId(record.userID).username + " rate " + record.projectID + " criteria: " + record.criteriaID + " score: " + record.score + "at " + LocalDateTime.now());
            record.save();
        }

		return redirect("/profile/"+record.getProjectID());
	}

    @Security.Authenticated(Secured.class)
	public static Result showRateResult() {
        int currentUserID = Integer.parseInt(session().get("userID"));
        User currentUser = User.find.byId( currentUserID );

        if(currentUser.projectId == 99 ) {
            List<Project> projects = Project.find.all();
            List<RatingCriteria> criteria = RatingCriteria.find.all();

            MultiKeyMap result = RatingRecord.summarize();

            //System.out.println("hello " + result.get(projects.get(1), criteria.get(1)) );

            //return ok(rateResult.render(RatingRecord.find.all()));
            return ok(rateResult.render(projects, criteria, result));
        }
        else {
            return redirect( routes.Application.index() );
        }
	}

}
