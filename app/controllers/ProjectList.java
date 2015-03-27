package controllers;
/**  * Created by nathakorn on 3/26/15 AD.  */
import play.mvc.*;
import models.*;
import views.html.*;

public class ProjectList extends Controller {

    public static Result index(Long id){
        Project project = Project.find.byId(id);

        return ok(profile.render(project));
    }
}