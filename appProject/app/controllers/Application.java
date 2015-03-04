package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render() );
    }

    public static Result voting() {
        return ok(vote.render() );
    }
	
	public static Result group1() {
		return ok(group1.render( Math.random()*5) );
	}

}
