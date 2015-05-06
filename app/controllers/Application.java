package controllers;

import play.*;
import play.mvc.*;
import play.data.Form;
import play.db.*;
import play.db.ebean.Model;
import models.*;

import views.html.*;

import java.time.LocalDateTime;
import java.util.List;

import static play.libs.Json.toJson;

public class Application extends Controller {

    @Security.Authenticated(Secured.class)
    public static Result index() {
        int currentUserID = Integer.parseInt(session().get("userID"));
        User currentUser = User.find.byId( currentUserID );

//        System.out.println("This user = " + currentUser.username);

        return ok(index.render( VotingCriteria.find.all(), currentUser ));
    }


    public static Result logout() {
        String username = User.find.byId(Integer.parseInt(session().get("userID"))).username;
        session().clear();
        flash("success", "You've been logged out");
        Logger.info("username: "+username+" has logged out at "+ LocalDateTime.now());
        return redirect(
                routes.Login.login()
        );
    }


    public static Result mockDatabase() {

        //Temp Banner Pic
        String picProject1 = "assets/project/cat_temp.jpg";
        String picProject2 = "assets/project/cat_temp.jpg";
        String picProject3 = "assets/project/cat_temp.jpg";
        String picProject4 = "assets/project/cat_temp.jpg";

        //Temp ScreenShot
        String ss1 = "assets/ss/screenshot1.jpg";
        String ss2 = "assets/ss/screenshot2.jpg";
        String ss3 = "assets/ss/screenshot3.jpg";


        //Create Temp Project
        Project.create("GG", picProject1, "App", "This is a project1 description. Something is here.");
        Project.create("Manat", picProject2, "App", "This is a project2 description. Something is here.");
        Project.create("Saint4", picProject3, "App", "This is a project3 description. Something is here.");
        Project.create("TheFrank", picProject4, "App", "This is a project4 description. Something is here.");

        //////Users
        //ADMIN -> projectId = 99
        User.create("admin", "admin", "admin", 99, "9999999999");

        //2Big2Slim - GUEST
        User.create("b5610545722", "punpikorn.r", "Punpikorn", 88, "5610545722");
        User.create("b5610545668", "nathakorn.s", "Nathakorn", 88, "5610545668");
        User.create("b5610545731", "piyaphat.t", "Piyaphat", 88, "5610545731");
        User.create("b5610546711", "nabhat.y", "Nabhat", 88, "5610546711");
        User.create("b5610545676", "nut.k", "Nut", 88, "5610545676");

        //Saint4 - Group3
        User.create("b5610545765", "muninthorn.t", "Muninthorn", 3, "5610545765");
        User.create("b5610545781", "runyasak.c", "Runyasak", 3, "5610545781");
        User.create("b5610545706", "nara.s", "Nara", 3, "5610545706");
        User.create("b5610546788", "vasupol.c", "Vasupol", 3, "5610546788");
        User.create("b5610545803", "wuttipong.k", "Wuttipong", 3, "5610545803");

        //Manat - Group2
        User.create("b5610546231", "chinnaporn.s", "Chinnaporn", 2, "5610546231");
        User.create("b5610545811", "sorrawit.c", "Sorrawit", 2, "5610545811");
        User.create("b5610546290", "worapon.o", "Worapon", 2, "5610546290");
        User.create("b5610545013", "niti.p", "Niti", 2, "5610545013");
        User.create("b5610546800", "supason.k", "Supason", 2, "5610546800");

        //FatCat - GUEST
        User.create("b5610546702", "jiratchaya.i", "Jiratchaya", 88, "5610546702");
        User.create("b5610545684", "nichamon.h", "Nichamon", 88, "5610545684");
        User.create("b5610546222", "chonnipa.k", "Chonnipa", 88, "5610546222");
        User.create("b5610546257", "natchanon.c", "Natchanon", 88, "5610546257");
        User.create("b5610546699", "kittipat.p", "Kittipat", 88, "5610546699");

        //GG - Group1
        User.create("b5610545757", "manatsawin.h", "Manatsawin", 1, "5610545757");
        User.create("b5610546770", "varis.k", "Varis", 1, "5610546770");
        User.create("b5610545749", "pongsachon.p", "Pongsachon", 1, "5610545749");

        //TheFrank - Group4
        User.create("b5610546681", "kittinan.n", "Kittinan", 4, "5610546681");
        User.create("b5610546281", "perawith.j", "Perawith", 4, "5610546281");
        User.create("b5610546753", "nathas.y", "Nathas", 4, "5610546753");
        User.create("b5610545692", "thanachote.v", "Thanachote", 4, "5610545692");
        User.create("b5610546729", "thanaphon.k", "Thanaphon", 4, "5610546729");

        //Malee - GUEST
        User.create("b5610545048", "tanatorn.a", "Tanatorn", 88, "5610545048");
        User.create("b5610545714", "patawat.j", "Patawat", 88, "5610545714");
        User.create("b5610546745", "thanyaboon.t", "Thanyaboon", 88, "5610546745");
        User.create("b5610546761", "mintra.t", "Mintra", 88, "5610546761");

        //JDED - GUEST
        User.create("b5410545044", "waranyu.r", "Waranyu", 88, "5410545044");
        User.create("b5410545052", "supayut.r", "Supayut", 88, "5410545052");
        User.create("b5410546334", "wasin.h", "Wasin", 88, "5410546334");
        User.create("b5410546393", "akkarawit.p", "Akkarawit", 88, "5410546393");
        User.create("b5410547594", "nachanok.s", "Nachanok", 88, "5410547594");

        //TA and Teacher
        User.create("b5510546166", "sarun.wo", "Sarun", 88, "5510546166");
        User.create("b5410545036", "thai.p", "Thai", 88, "5410545036");
        User.create("fengjeb", "james.b", "Jim", 88, "staff");
        User.create("geedev", "keeratipong.u", "Keeratipong", 88, "staff");

        //Rate Criteria
        RatingCriteria.create("Ease of use");
        RatingCriteria.create("Reliability");
        RatingCriteria.create("UI/UX Quality");
        RatingCriteria.create("Security");
        RatingCriteria.create("Suitability");

        //Vote Criteria
		VotingCriteria.create("Most beautiful UI");
        VotingCriteria.create("Most feature-complete");
        VotingCriteria.create("Easiest to use");

        return redirect(routes.Application.index());
    }
}

