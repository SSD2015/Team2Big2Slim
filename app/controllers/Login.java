package controllers;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.login;

import javax.persistence.Entity;

import static play.data.Form.form;

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

