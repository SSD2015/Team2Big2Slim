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
import java.util.List;

import static play.data.Form.*;
import static play.libs.Json.toJson;

public class Login extends Controller {

    public static class LoginInfo {
        public String shit;
        public String username;
        public String password;

        public String validate() {
            if (User.authenticate(username, password) == null) {
                return "Invalid user or password";
            }
            return null;
        }
    }

    public static Result login() {
        return ok( login.render(Form.form(LoginInfo.class)));
        //return ok( login.render( Form.form() ) );
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
            User user = User.find.where().eq("username", info.username).eq("password", info.password).findUnique();

            session().clear();
            session("userID", ""+user.getID());
            //String userId = session("connected");
            return redirect(routes.Application.index());
        }
       // if( loginForm.get().username.equals("admin") && loginForm.get().password.equals("admin") )  {
            //System.out.println("\nI'm in");
            //return redirect(routes.Application.index());
        //}
    }

}
