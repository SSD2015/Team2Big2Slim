package controllers;

import models.User;
import play.*;
import play.mvc.*;
import play.data.Form;
import play.db.*;
import play.db.ebean.Model;
import models.Project;

import views.html.*;

import javax.persistence.Entity;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;

import static play.data.Form.*;
import static play.libs.Json.toJson;

public class Login extends Controller {

    public static class LoginInfo {
        public String username;
        public String password;
        public String validate() {
            if (User.authenticate(username, password) == null) {
                Logger.warn("username: "+username+" has entered wrong password");
                return "Invalid user or password";
            }
            return null;
        }
    }

    public static Result login() {
        return ok( login.render(Form.form(LoginInfo.class)));
    }

    public static Result authenticate() {
        Form<LoginInfo> loginForm = Form.form(LoginInfo.class).bindFromRequest();

        //wrong username or password
        if (loginForm.hasErrors()) {
            return badRequest(login.render(loginForm));
        }

        //correct
        else {
            LoginInfo info = loginForm.get();
            User user = User.find.where().eq("username", info.username).findUnique();

            session().clear();
            session("userID", ""+user.getID());

            Logger.info("username : "+ info.username+" has logged in to the system at "+ LocalDateTime.now());

            return redirect(routes.Application.index());
        }

    }

}
