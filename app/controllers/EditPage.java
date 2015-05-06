package controllers;

import models.User;
import play.mvc.Controller;
import views.html.adminMain;
import views.html.edit;
import play.mvc.*;
/**
 * Created by Punpikorn on 5/6/15 AD.
 */
public class EditPage extends Controller{

    public static Result typeCheck(Integer userType) {
        if (userType == 88) {
            return redirect("/");
        }
        else if (userType == 99) {
            return redirect("/admin");
        }
        else {
            return ok(edit.render(userType));
        }
    }
}
