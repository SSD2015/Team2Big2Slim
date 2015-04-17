package controllers;

import play.*;
import play.mvc.*;
import play.data.Form;
import play.db.*;
import play.db.ebean.Model;
import models.*;

import views.html.*;

import java.util.List;

import static play.libs.Json.toJson;

public class Application extends Controller {

    @Security.Authenticated(Secured.class)
    public static Result index() {
        int currentUserID = Integer.parseInt(session().get("userID"));
        User currentUser = User.find.byId( currentUserID );

        System.out.println("This user = " + currentUser.username);

        return ok(index.render( VotingCriteria.find.all(), currentUser ));
    }


    public static Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect(
                routes.Login.login()
        );
    }


    public static Result mockDatabase() {

        //project
        Project.create(1,"Saint4","http://1.bp.blogspot.com/-kopuh2DtFoM/UcAFJnywwQI/AAAAAAAAAGQ/eKCXZQc9KhA/s1600/Line.png","App",
                "http://www.cubrid.org/files/attach/images/220547/690/355/line_app_android.jpeg" ,
                "http://www.trutower.com/wp-content/uploads/2013/08/Line-app-for-smartphones.jpg",
                "http://k-popped.com/kpopped2012/wp-content/uploads/2014/06/stickers-600x303.jpg", "project2 description");
        Project.create(2,"Manat","http://1.bp.blogspot.com/-kopuh2DtFoM/UcAFJnywwQI/AAAAAAAAAGQ/eKCXZQc9KhA/s1600/Line.png","App",
                "http://www.cubrid.org/files/attach/images/220547/690/355/line_app_android.jpeg" ,
                "http://www.trutower.com/wp-content/uploads/2013/08/Line-app-for-smartphones.jpg",
                "http://k-popped.com/kpopped2012/wp-content/uploads/2014/06/stickers-600x303.jpg", "project3 description");
        Project.create(3,"2Big2Slim","http://static.sportskeeda.com/wp-content/uploads/2014/08/gta-v-1409058623.jpg","App",
                "http://i.ytimg.com/vi/1gnbUusxRks/maxresdefault.jpg","http://i.ytimg.com/vi/0YEY4PVbg0E/maxresdefault.jpg",
                "http://i.ytimg.com/vi/lAdBJQXoCpc/maxresdefault.jpg", "project1 description");
        Project.create(4,"Fatcat","http://1.bp.blogspot.com/-kopuh2DtFoM/UcAFJnywwQI/AAAAAAAAAGQ/eKCXZQc9KhA/s1600/Line.png","App",
                "http://www.cubrid.org/files/attach/images/220547/690/355/line_app_android.jpeg" ,
                "http://www.trutower.com/wp-content/uploads/2013/08/Line-app-for-smartphones.jpg",
                "http://k-popped.com/kpopped2012/wp-content/uploads/2014/06/stickers-600x303.jpg", "project4 description");

        //Users
        //admin projectId=99
        User.create(1, "admin", "admin", "admin", 99, "9999999999");
        //project 3
        User.create(2, "b5610545722", "punpikorn.r", "Punpikorn", 3, "5610545722");
        User.create(3, "b5610545668", "nathakorn.s", "Nathakorn", 3, "5610545668");
        User.create(4, "b5610545731", "piyaphat.t", "Piyaphat", 3, "5610545731");
        User.create(5, "b5610546711", "nabhat.y", "Nabhat", 3, "5610546711");
        User.create(6, "b5610545676", "nut.k", "Nut", 3, "5610545676");
        //project 1
        User.create(7, "b5610545765", "muninthorn.t", "Muninthorn", 1, "5610545765");
        User.create(8, "b5610545781", "runyasak.c", "Runyasak", 1, "5610545781");
        User.create(9, "b5610545706", "nara.s", "Nara", 1, "5610545706");
        User.create(10, "b5610546788", "vasupol.c", "Vasupol", 1, "5610546788");
        User.create(11, "b5610545803", "wuttipong.k", "Wuttipong", 1, "5610545803");
        //project 2
        User.create(12, "b5610546231", "chinnaporn.s", "Chinnaporn", 2, "5610546231");
        User.create(13, "b5610545811", "sorrawit.c", "Sorrawit", 2, "5610545811");
        User.create(14, "b5610546290", "worapon.o", "Worapon", 2, "5610546290");
        User.create(15, "b5610545013", "niti.p", "Niti", 2, "5610545013");
        User.create(16, "b5610546800", "supason.k", "Supason", 2, "5610546800");
        //project 4
        User.create(17, "b5610546702", "jiratchaya.i", "Jiratchaya", 4, "5610546702");
        User.create(18, "b5610545684", "nichamon.h", "Nichamon", 4, "5610545684");
        User.create(19, "b5610546222", "chonnipa.k", "Chonnipa", 4, "5610546222");
        User.create(20, "b5610546257", "natchanon.c", "Natchanon", 4, "5610546257");
        User.create(21, "b5610546699", "kittipat.p", "Kittipat", 4, "5610546699");
        //guess projectId=88
        User.create(22, "b5610545757", "manatsawin.h", "Manatsawin", 88, "5610545757");
        User.create(23, "b5610546770", "varis.k", "Varis", 88, "5610546770");
        User.create(24, "b5610545749", "pongsachon.p", "Pongsachon", 88, "5610545749");
        User.create(25, "b5610546681", "kittinan.n", "Kittinan", 88, "5610546681");
        User.create(26, "b5610546281", "perawith.j", "Perawith", 88, "5610546281");
        User.create(27, "b5610546753", "nathas.y", "Nathas", 88, "5610546753");
        User.create(28, "b5610545692", "thanachote.v", "Thanachote", 88, "5610545692");
        User.create(29, "b5610546729", "thanaphon.k", "Thanaphon", 88, "5610546729");
        User.create(30, "b5610545048", "tanatorn.a", "Tanatorn", 88, "5610545048");
        User.create(31, "b5610545714", "patawat.j", "Patawat", 88, "5610545714");
        User.create(32, "b5610546745", "thanyaboon.t", "Thanyaboon", 88, "5610546745");
        User.create(33, "b5610546761", "mintra.t", "Mintra", 88, "5610546761");
        User.create(34, "b5410545044", "waranyu.r", "Waranyu", 88, "5410545044");
        User.create(35, "b5410545052", "supayut.r", "Supayut", 88, "5410545052");
        User.create(36, "b5410546334", "wasin.h", "Wasin", 88, "5410546334");
        User.create(37, "b5410546393", "akkarawit.p", "Akkarawit", 88, "5410546393");
        User.create(38, "b5410547594", "nachanok.s", "Nachanok", 88, "5410547594");
        //TA and Teacher
        User.create(39, "b5510546166", "sarun.wo", "Sarun", 88, "5510546166");
        User.create(40, "b5410545036", "thai.p", "Thai", 88, "5410545036");
        User.create(41, "fengjeb", "james.b", "Jim", 88, "staff");
        User.create(42, "geedev", "keeratipong.u", "Keeratipong", 88, "staff");

        //rate criteria
        RatingCriteria.create(5, "Ease of use");
        RatingCriteria.create(4, "Reliability");
        RatingCriteria.create(3, "Completeness");
        RatingCriteria.create(2, "Security");
        RatingCriteria.create(1, "Quality of UI");
        //vote criteria
		VotingCriteria.create(1, "Best of Exceed Camp");

        return redirect(routes.Application.index());
    }
}

