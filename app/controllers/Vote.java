package controllers;

import models.*;
import org.apache.commons.collections.map.MultiKeyMap;
import play.*;
import play.mvc.*;
import play.data.Form;
import play.db.*;
import play.db.ebean.Model;

import views.html.*;

import javax.persistence.Entity;
//import java.time.LocalDateTime;
import java.util.List;

import static play.data.Form.form;
import static play.libs.Json.toJson;

public class Vote extends Controller {

    public static class VoteInfo {
        public String projectID;
		public int criteriaID;
    }

    public static Result submitVote() {
        VotingRecord record = Form.form(VotingRecord.class).bindFromRequest().get();
        System.out.println("User ID: " + record.getUserID());
        System.out.println("VoteForm: " + record);
        System.out.println("projectID: " + record.getProjectID());
        System.out.println("criteriaID: " + record.getCriteriaID());
        System.out.println("----------------------------");

        VotingRecord oldRecord = VotingRecord.find.where().eq("userID", record.getUserID()).eq("criteriaID", record.getCriteriaID()).findUnique();

        if( oldRecord != null ) {
            oldRecord.changeProject(record.getProjectID());
            //Logger.info("username: " + User.find.byId(record.userID).username + " change vote of " + record.projectID + " criteria: " + record.criteriaID + " at " + LocalDateTime.now());
            oldRecord.save();
        }
        else {
            //Logger.info("username: " + User.find.byId(record.userID).username + " vote " + record.projectID + " criteria: " + record.criteriaID + " at " + LocalDateTime.now());
            record.save();
        }
		
        return redirect("/");
    }

    @Security.Authenticated(Secured.class)
    public static Result showVoteResult() {
        int currentUserID = Integer.parseInt(session().get("userID"));
        User currentUser = User.find.byId( currentUserID );

        if(currentUser.projectId == 99 ) {
            List<Project> projects = Project.find.all();
            List<VotingCriteria> criteria = VotingCriteria.find.all();

            MultiKeyMap result = VotingRecord.summarize();

            //System.out.println("hello " + result.get(projects.get(1), criteria.get(1)) );

            //return ok(rateResult.render(RatingRecord.find.all()));
            return ok(voteResult.render(criteria, projects, result));
            //return ok(voteResult.render( Project.find.all()) );
        }
        else {
            return redirect( routes.Application.index() );
        }

    }
}