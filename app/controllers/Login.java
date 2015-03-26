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

import static play.data.Form.form;
import static play.libs.Json.toJson;

public class Login extends Controller {

    public static class LoginInfo {
        public String username;
        public String password;
    }

    public static Result login() {
        return ok( login.render());
        //return ok( login.render( Form.form() ) );
    }


    public static Result authenticate() {
        Form<LoginInfo> loginForm = Form.form(LoginInfo.class).bindFromRequest();
        //System.out.println("LoginForm: " + loginForm.get());
        //System.out.println("username: " + loginForm.get().username);
        //System.out.println("password: " + loginForm.get().password);
        LoginInfo info = loginForm.get();
        User user = User.find.where().eq("username", info.username).eq("password", info.password).findUnique();

        if( user != null ) {
            session().clear();
            session("connected", ""+user.getID());
            //String userId = session("connected");
            return redirect(routes.Application.index());
        }
       // if( loginForm.get().username.equals("admin") && loginForm.get().password.equals("admin") )  {
            //System.out.println("\nI'm in");
            //return redirect(routes.Application.index());
        //}

      return ok( login.render( ));
    }

}
