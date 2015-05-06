package controllers;
/**  * Created by nathakorn on 3/26/15 AD.  */
import play.mvc.*;
import models.*;
import views.html.*;

import java.util.List;

public class ProjectList extends Controller {

    @Security.Authenticated(Secured.class)
    public static Result index(Integer id){
        Project project = Project.find.byId(id);

        List<User> userList = User.find.where().eq("projectId", id).findList();
        List<RatingCriteria> rcList = RatingCriteria.getAllRatingCriteria();
        List<UploadRecord> screenShot = UploadRecord.find.where().eq("projectID", id).findList();
        int currentUserID = Integer.parseInt(session().get("userID"));
        System.out.println("Current User ID: " + currentUserID);
        User currentUser = User.find.byId( currentUserID );

        return ok(profile.render(project,userList,rcList, currentUserID, currentUser, screenShot));
    }

    public static Result sc1(Integer idPr, Integer idSc){
        Project project = Project.find.byId(idPr);
        int currentUserID = Integer.parseInt(session().get("userID"));
        User currentUser = User.find.byId( currentUserID );

        return ok(screenshot1.render(project, currentUser, idSc));
    }




}