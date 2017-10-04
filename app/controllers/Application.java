package controllers;


        import com.restfb.DefaultFacebookClient;
        import com.restfb.FacebookClient;
        import com.restfb.types.User;
        import models.Student;
        import play.mvc.Controller;
        import play.mvc.Result;
        import services.MatchEngine;
        import utils.Config;
        import views.html.*;
        import com.restfb.types.User.Picture;
        import play.db.ebean.Model;
        import gui.ava.html.image.generator.HtmlImageGenerator;


        import java.util.ArrayList;
        import java.util.List;
        import java.util.logging.Logger;

    public class Application extends Controller {
    public static Result index1() {
        //return ok(unity.tst2.html.index.render());
        String appId1 = "1031181330271666";
        return ok(index1.render(appId1,"authUser"));
    }

    public static Result index2() {
        String appId2 = "428786480640278";
        //return ok(unity.tst2.html.index.render());
        return ok(index2.render(appId2,"authUser"));
    }

    public static Result authUser(String accessToken) {
        FacebookClient facebookClient = new DefaultFacebookClient(accessToken);
        User user = facebookClient.fetchObject("me", User.class);
        return ok(authUser.render(user.getFirstName() + " " + user.getLastName(), user.getEmail()));
    }


    //game 1
    public static Result game1index() {
        String game1Url = "game1";
        return ok(index1.render(Config.game1_appid, game1Url));
    }

        //game2
    public static Result game2index() {
        String game2Url = "game2";
        return ok(index2.render(Config.game2_appid,game2Url));
    }

    public static Result game2(String accessToken) {
        try {
            FacebookClient facebookClient = new DefaultFacebookClient(accessToken);
            User user = facebookClient.fetchObject("me", User.class);
            String usermovieid = user.getId();
            String usermoviename = user.getName();


            UserMovie usermovie = UserMovie.find.where().like("name", "%"+ usermoviename+"%").findUnique();
            if(costumer==null)
            {
                String movie="Ranjhana";
                UserMovie usermovie1 = new UserMovie(usermoviename,usermovieid,movie);
                usermovie1.save();
            }
            UserMovie usermovief = UserMovie.find.where().like("name", "%"+ usermoviename+"%").findUnique();

            return ok(game2.render(user,usermovief,Config.game2_appid));


        } catch (Exception e) {
            return ok("Some Error Occured"+e.toString());
        }
    }
    public static Result game1(String accessToken) {
        try {
            FacebookClient facebookClient = new DefaultFacebookClient(accessToken);
            User user = facebookClient.fetchObject("me", User.class);
            String studentId = user.getId();
            String studentname = user.getName();


            Student student = Student.find.where().like("name", "%"+ studentname+"%").findUnique();
            if(student==null)
            {
                float cglast=9.8f;
                float cgnext = MatchEngine.getInstance().getrandomcg();
                Student student1 = new Student(studentname,studentId,cglast,cgnext );
                student1.save();
            }
////
            Student studentf = Student.find.where().like("name", "%"+ studentname+"%").findUnique();

            return ok(game1.render(user,studentf,Config.game1_appid));


        } catch (Exception e) {
            return ok("Some Error Occured"+e.toString());
        }
    }

    public static Result addstudent () {
        List<Student> studentlist = new Model.Finder(Long.class, Student.class).all();
        return ok(addstudent.render("shubham34934@gmail.com",studentlist) );

    }

}
