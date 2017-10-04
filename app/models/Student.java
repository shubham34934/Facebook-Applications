package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by manjeet on 25/12/15.
 */

@Entity
public class Student extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public static Finder<Integer, Student> find
            = new Model.Finder<Integer,Student>(Integer.class, Student.class);

    public String fbId;
    public String name;
    public float cgnext;

    public float cglast; //   '@routes.Assets.at("images/modi1.jpg")'

    public Student(String name, float cglast , float cgnext) {
        this.name = name;
        this.fbId = name;
        this.cglast = cglast;
        this.cgnext =cgnext;
    }

    public Student(String name, String fbId, float cglast , float cgnext) {
        this.name = name;
        this.fbId = fbId;
        this.cglast = cglast;
        this.cgnext =cgnext;
    }
}
