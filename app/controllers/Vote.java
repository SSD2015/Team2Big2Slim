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

public class Vote extends Controller {

    public static class VoteInfo {
        public String projectID;
		public int criteriaID;
    }

    public static Result vote() {
        return ok(vote.render());
    }

    public static Result submitVote() {
		//VotingRecord record = Form.form(VotingRecord.class).bindFromRequest().get();
        Form<VoteInfo> voteForm = Form.form(VoteInfo.class).bindFromRequest();
        VoteInfo info = voteForm.get();
//        System.out.println("ID: "+info.projectID);
        //VotingRecord oldRecord = VotingRecord.find.where().eq("userID", record.getUserID()).eq("projectID", record.getProjectID()).eq("criteriaID", record.getCriteriaID()).findUnique();
        Project existProject = Project.find.where().eq("ID", info.projectID).findUnique();

		/*if( oldRecord != null ) {
            oldRecord.updateScore();
            oldRecord.save();
        }
		else
		{
			record.save();
		}*/
        if( existProject != null ) {
            existProject.updateVote();
            existProject.save();
        }
		
        return redirect("/");
    }

    public static Result showVoteResult() {
        return ok(voteResult.render( Project.find.all()) );
        //return ok("hello");
    }
}