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
        Project.create(1,"Grand Theft Auto V","http://static.sportskeeda.com/wp-content/uploads/2014/08/gta-v-1409058623.jpg","Game");
        Project.create(2,"Line","http://screenshots.en.sftcdn.net/en/scrn/6651000/6651755/image-05-700x525.png","Social network app");
        return redirect(routes.Application.index());
    }
}
