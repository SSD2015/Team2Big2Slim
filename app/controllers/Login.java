package controllers;

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

    public String username;
    public String password;
    @Entity
    public static class LoginInfo {

        public String username;
        public String password;

    }

    public static Result login() {
       return ok( login.render( Form.form(LoginInfo.class)));
        //return ok( login.render( Form.form() ) );
    }


    public static Result authenticate() {
        Form<Login> loginForm = form(Login.class).bindFromRequest();
        //System.out.print(loginForm.get().username);
        if( loginForm.get().username.equals("admin") && loginForm.get().password.equals("admin") )  {
            System.out.println("I'm in");
            return redirect(routes.Application.index());
        }

        return ok( login.render( Form.form(LoginInfo.class)));
    }

}

