package controllers;

import play.*;
import play.mvc.*;
import play.data.Form;
import play.db.*;
import play.db.ebean.Model;
import models.*;

import views.html.*;

import java.util.List;

import static play.libs.Json.toJson;

public class Application extends Controller {

    @Security.Authenticated(Secured.class)
    public static Result index() {
		//VotingCriteria vc = VotingCriteria.find.where().findUnique();
        return ok(index.render(VotingCriteria.find.all()));
    }



    public static Result createProject() {
        Project project = Form.form(Project.class).bindFromRequest().get();
		if(project != null)
		{
			project.save();
		}
        return ok(vote.render());
    }

    public static Result voting(){
        return ok(vote.render());
    }

    /*public static Result vote(String id){
        Project projects = Project.find.byId(id);
        projects.score++;
        projects.save();
        return redirect(routes.Application.getVoteResult());
    }*/

    public static Result addProject(){
        return ok(creater.render("create project"));
    }

    public static Result getVoteResult(){
        List<Project> projects = new Model.Finder<String, Project>(String.class, Project.class).all();
        return ok(toJson(projects));
    }

	public static Result group1() {
		return ok(group1.render( Math.random()*5) );
	}

    public static Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect(
                routes.Login.login()
        );
    }
    public static Result mockDatabase() {
        Project.create(1,"Grand Theft Auto V","http://static.sportskeeda.com/wp-content/uploads/2014/08/gta-v-1409058623.jpg","Game",
                "http://i.ytimg.com/vi/1gnbUusxRks/maxresdefault.jpg","http://i.ytimg.com/vi/0YEY4PVbg0E/maxresdefault.jpg",
                "http://i.ytimg.com/vi/lAdBJQXoCpc/maxresdefault.jpg");
        Project.create(2,"Line","http://1.bp.blogspot.com/-kopuh2DtFoM/UcAFJnywwQI/AAAAAAAAAGQ/eKCXZQc9KhA/s1600/Line.png","Social network app",
                "http://www.cubrid.org/files/attach/images/220547/690/355/line_app_android.jpeg" ,
                "http://www.trutower.com/wp-content/uploads/2013/08/Line-app-for-smartphones.jpg",
                "http://k-popped.com/kpopped2012/wp-content/uploads/2014/06/stickers-600x303.jpg");
        Member.create(1,"Nathakorn","Sukumsirichart","5610545668",(long)1);
        Member.create(2,"Punpikorn","Rattanawirojkul","5610545722",(long)1);
        Member.create(3,"Nabhat","Yuktadatta","5610546711",(long)1);
        Member.create(4,"Piyaphat","Tulakoop","5610545731",(long)2);
        Member.create(5,"Nut","Kaewnak","5610545676",(long)2);
        User.create(1, "admin", "admin");
        RatingCriteria.create(1, "Ease of use");
        RatingCriteria.create(2, "Reliability");
        RatingCriteria.create(3, "Completeness");
        RatingCriteria.create(4, "Security");
        RatingCriteria.create(5, "Quality of UI");
		VotingCriteria.create(1, "Best of Exceed Camp");
        RatingCriteriaList.create();
        return redirect(routes.Application.index());
    }
}

