package controllers;

import models.RatingCriteria;
import models.User;

import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.addRateCriteria;
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
    public static Result addUserPage() {
        int currentUserID = Integer.parseInt(session().get("userID"));
        User currentUser = User.find.byId( currentUserID );

        if( currentUser.projectId == 99) {
            return ok(addUser.render());
        }
        else {
            return redirect(routes.Application.index() );
        }
    }


    public static Result addUser() {
        User newUser = Form.form(User.class).bindFromRequest().get();
        System.out.println("Username: " + newUser.username);
        System.out.println("Password: " + newUser.password);
        System.out.println("Name: " + newUser.name);
        System.out.println("ProjectID: " + newUser.projectId);
        System.out.println("KuNo: " + newUser.kuNo);
        System.out.println("----------------------------");

        newUser.save();

        return redirect( routes.Admin.addUserPage() );
    }

    public static Result addRatingCriteriaPage() {
        int currentUserID = Integer.parseInt(session().get("userID"));
        User currentUser = User.find.byId( currentUserID );

        if( currentUser.projectId == 99) {

            return ok(addRateCriteria.render());
        }
        return null;
    }

    public static Result addRatingCriteria() {
        RatingCriteria newRatingCriteria = Form.form(RatingCriteria.class).bindFromRequest().get();
        System.out.println("criteriaName: " + newRatingCriteria.criteriaName);

        newRatingCriteria.save();

        return redirect( routes.Admin.addRatingCriteriaPage() );
    }

}
