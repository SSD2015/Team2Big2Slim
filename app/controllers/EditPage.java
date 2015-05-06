package controllers;

import models.Project;
import models.User;
import play.data.Form;
import play.mvc.Controller;
import views.html.adminMain;
import views.html.edit;
import play.mvc.*;
/**
 * Created by Punpikorn on 5/6/15 AD.
 */
public class EditPage extends Controller{

    @Security.Authenticated(Secured.class)
    public static Result typeCheck(Integer userType) {
        if (userType == 88) {
            return redirect("/");
        }
        else if (userType == 99) {
            return redirect("/admin");
        }
        else {
            return ok(edit.render(userType));
        }
    }

    public static Result editProject(int projectId) {
        Project bindProject = Form.form(Project.class).bindFromRequest().get();
        Project thisProject = Project.getProjectByID(projectId);

        System.out.println("From... ");
        System.out.println("ProjectName = " + thisProject.projectName);
        System.out.println("Description = " + thisProject.description);

        thisProject.projectName = bindProject.projectName;
        thisProject.description = bindProject.description;

        System.out.println("To... ");
        System.out.println("ProjectName = " + thisProject.projectName);
        System.out.println("Description = " + thisProject.projectName);
        System.out.println("=============================");
        
        thisProject.save();
        return redirect( routes.EditPage.typeCheck(thisProject.getID()) );
    }
}
