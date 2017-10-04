package controllers;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;
import com.restfb.*;
import com.restfb.Connection;

import models.Student;
import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Result;
import services.MatchEngine;
import utils.Config;
import views.html.*;
import java.util.List;

public class PuzzleGame extends Controller {

    //game 1
    public static Result puzzleGame1index() {
        String game1Url = "puzzleGame1";
        return ok(index1.render(Config.puzzleGame_appid,game1Url));
        String game1Url = "puzzlegame1";
        return ok(index.render(Config.puzzleGame1_appid,game1Url));
    }

    public static Result puzzleGame1(String accessToken) {
        try {
            return ok(puzzlegame1.render(null,null,Config.puzzleGame1_appid));

        } catch (Exception e) {
            return ok("Some Error Occured"+e.toString());
        }
    }


    public static Result puzzleGame2index() {
        String game1Url = "puzzlegame2";
        return ok(index.render(Config.puzzleGame2_appid,game1Url));
    }

    public static Result puzzleGame2(String accessToken) {
        try {
            FacebookClient facebookClient = new DefaultFacebookClient(accessToken);
            User user = facebookClient.fetchObject("me", User.class);
            Connection<User> myFriends = facebookClient.fetchConnection("me/friends", User.class);
            List<User> connections = myFriends.getData();
            String studentId = user.getId();
            String studentname = user.getName();



            return ok(puzzlegame2.render(user,connections ,Config.puzzleGame2_appid));

        } catch (Exception e) {
            return ok("Some Error Occured"+e.toString());
        }
    }


}
