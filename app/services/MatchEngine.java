package services;

import models.Student;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;
import com.restfb.types.User.Picture;
import models.StudentData;
import utils.MathUtil;

/**
 * Created by manjeet on 25/12/15.
 */
public class MatchEngine {
    private static MatchEngine ourInstance = new MatchEngine();

    public static MatchEngine getInstance() {
        return ourInstance;
    }

    private MatchEngine() {
    }
    public float getrandomcg()
    {
        int firstint = utils.MathUtil.getRandom(8,10);
        int secondint = utils.MathUtil.getRandom(1 ,9);
        float point= secondint/10f;
        float totalcg= firstint + point ;
        return(totalcg);
    }



}
