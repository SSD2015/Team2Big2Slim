package controllers;

/**
 * Created by nathakorn on 5/6/15 AD.
 */
import models.*;
import play.*;
import play.mvc.*;
import play.data.Form;
import play.db.*;
import play.db.ebean.Model;

import views.html.*;

import javax.persistence.Entity;
import java.awt.*;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static play.data.Form.form;
import static play.libs.Json.toJson;
public class Upload extends Controller{

    public static boolean canEditProject(User user, int projectId){
        if(user.getProjectId() == projectId)
            return true;
        if(user.getProjectId() == 99)
            return true;
        return true;
    }
    public static Result submitUpload() {
        Http.MultipartFormData body = request().body().asMultipartFormData();
        File file = body.getFile("pic").getFile();
        String pId = body.asFormUrlEncoded().get("projectID")[0];
        String type = body.asFormUrlEncoded().get("type")[0];
        System.out.println(pId);
        System.out.println(file);
        int projectId = Integer.parseInt(pId);
        int currentUserID = Integer.parseInt(session().get("userID"));
        User currentUser = User.find.byId(currentUserID);
        if(!canEditProject( currentUser, projectId)) {
            flash("error", "access denied.");
            return redirect(routes.Application.index());
        }
        else{

            UploadRecord oldRecord =  UploadRecord.find.where().eq("projectID", projectId).eq("type", type).findUnique();
            if( oldRecord != null ) {
                oldRecord.changeData(new byte[(int) file.length()]);
                //Logger.info("username: " + User.find.byId(record.userID).username + " change the rate of " + record.projectID + " criteria: " + record.criteriaID + " score: " + record.score + " at " + LocalDateTime.now());
                oldRecord.save();
            }
            else {
                UploadRecord uploadRecord = new UploadRecord(projectId, file, type);
                //Logger.info(Project.findById(projectId).getProjectName()+" upload new picture["+project.getId()+"]");
            }

            return ok("success!");
        }
    }
    public static Result getImage(int imgId){
        UploadRecord image = UploadRecord.find.byId(imgId);
        return ok(image.getData()).as("image");
    }
}
