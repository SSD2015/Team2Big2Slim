package controllers;

import models.*;
import play.data.Form;
import play.mvc.Result;
import views.html.creater;
import views.html.profile;
import views.html.vote;

/**
 * Created by nicole on 3/25/15 AD.
 */

import static play.libs.Json.toJson;
import static play.mvc.Results.ok;
import static play.mvc.Results.redirect;

public class Profile {
    public static Result profile()  {
        return ok(profile.render());
    }

    public static Result createProject() {
        Project project = Form.form(Project.class).bindFromRequest().get();
        project.save();
        return ok(vote.render());
    }
    public static Result addProject(){
        return ok(creater.render("create project"));
    }

    public static Result testProfile(){
        return redirect(routes.Profile.getProfile("pp"));
    }
    public static Result getProfile(String name){
        for(Project p : Project.find.all()) {
            if(p.getName() == name) {
                 return ok(toJson(p));
            }
        }
        return ok(toJson(new Project()));

    }
}
