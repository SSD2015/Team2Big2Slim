package controllers;

import models.User;

import play.*;
import play.mvc.*;
import views.html.addUser;
import views.html.adminMain;
import views.html.index;

public class Admin extends Controller {

    @Security.Authenticated(Secured.class)
    public static Result adminIndex() {
        int currentUserID = Integer.parseInt(session().get("userID"));
        User currentUser = User.find.byId( currentUserID );

        if( currentUser.projectId == 99) {
            return ok(adminMain.render());
        }
        else {
            return redirect(routes.Application.index() );
        }
    }

    @Security.Authenticated(Secured.class)
    public static Result addUser() {
        return ok(addUser.render());
    }
}
