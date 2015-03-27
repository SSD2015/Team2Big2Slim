package controllers;

import play.*;
import play.mvc.*;
import models.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result hello() {
        return ok("<h1>Hello World!</h1>");
    }

    public static Result screenshot1() {
        return ok(screenshot1.render());
    }

    public static Result screenshot2() {
        return ok(screenshot2.render());
    }

    public static Result screenshot3() {
        return ok(screenshot3.render());
    }

    public static Result test() {
        return ok(test.render());
    }
    public static Result mockDatabase() {
        Project.create(1,"Grand Theft Auto V s");
        Project.create(2,"GTA");
        return redirect(routes.Application.index());
    }
}
