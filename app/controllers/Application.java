package controllers;

import play.*;
import play.mvc.*;
import models.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    public static Result mockDatabase() {
        Project.create(1,"Grand Theft Auto V","http://static.sportskeeda.com/wp-content/uploads/2014/08/gta-v-1409058623.jpg","Game",
                "http://i.ytimg.com/vi/1gnbUusxRks/maxresdefault.jpg","http://i.ytimg.com/vi/0YEY4PVbg0E/maxresdefault.jpg",
                "http://i.ytimg.com/vi/lAdBJQXoCpc/maxresdefault.jpg");
        Project.create(2,"Line","http://1.bp.blogspot.com/-kopuh2DtFoM/UcAFJnywwQI/AAAAAAAAAGQ/eKCXZQc9KhA/s1600/Line.png","Social network app",
                "http://www.cubrid.org/files/attach/images/220547/690/355/line_app_android.jpeg" ,
                "http://www.trutower.com/wp-content/uploads/2013/08/Line-app-for-smartphones.jpg",
                "http://k-popped.com/kpopped2012/wp-content/uploads/2014/06/stickers-600x303.jpg");
        Member.create(1,"Nathakorn","Sukumsirichart","5610545668",(long)1);
        Member.create(2,"Punpikorn","Rattanawirojkul","5610545722",(long)1);
        Member.create(3,"Nabhat","Yuktadatta","5610546711",(long)1);
        Member.create(4,"Piyaphat","Tulakoop","5610545731",(long)2);
        Member.create(5,"Nut","Kaewnak","5610545676",(long)2);
        return redirect(routes.Application.index());
    }
}
