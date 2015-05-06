package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Http.*;
import java.time.LocalDateTime;
import models.*;

public class Secured extends Security.Authenticator {
    //system due time
    public static int myHour = 23;
    public static int myMinute = 59;
    public static int mySecond = 59;

    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("userID");
    }

    @Override
    public Result onUnauthorized(Context ctx) {
        return redirect(routes.Login.login());
    }

    public static boolean TimesUp() {
        int hour = LocalDateTime.now().getHour();
        int minute = LocalDateTime.now().getMinute();
        int second = LocalDateTime.now().getSecond();

        if (hour > myHour) {
            return true;
        } else {
            if (minute > myMinute) {
                return true;
            } else {
                if (second > mySecond) {
                    return true;
                }
                else {
                    return false;
                }
            }
        }
    }
}