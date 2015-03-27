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

public class Rate extends Controller {

    public static Result rate() {
        return ok(rate.render());
        //return ok( login.render( Form.form() ) );
    }
	
	public static Result submitRate()
	{
		
		return ok(rate.render());
	}

}
