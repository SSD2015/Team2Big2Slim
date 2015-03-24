package controllers;

import play.*;
import play.mvc.*;
import play.data.Form;
import play.db.*;
import play.db.ebean.Model;
import models.Project;

import views.html.*;

import java.util.List;

import static play.libs.Json.toJson;

public class Login extends Controller {

    public static Result loginPage() {
        return ok(login.render());
    }

    pu
}

