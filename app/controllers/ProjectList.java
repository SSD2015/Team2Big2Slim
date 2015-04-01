package controllers;
/**  * Created by nathakorn on 3/26/15 AD.  */
import play.mvc.*;
import models.*;
import views.html.*;

import java.util.List;

public class ProjectList extends Controller {
    public static Result index(Long id){
        Project project = Project.find.byId(id);
        List member = Member.find.where().eq("projectId", id).findList();
        return ok(profile.render(project,member));
    }
    public static Result sc1(Long id){
        Project project = Project.find.byId(id);
        List member = Member.find.where().eq("projectId",id).findList();
        return ok(screenshot1.render(project, member));
    }
    public static Result sc2(Long id){
        Project project = Project.find.byId(id);
        List member = Member.find.where().eq("projectId",id).findList();
        return ok(screenshot2.render(project,member));
    }
    public static Result sc3(Long id){
        Project project = Project.find.byId(id);
        List member = Member.find.where().eq("projectId",id).findList();
        return ok(screenshot3.render(project,member));
    }
}