package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserMovie extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public static Finder<Integer, UserMovie> find
            = new Model.Finder<Integer, UserMovie>(Integer.class, UserMovie.class);

    public String fbId;
    public String name;

    public String movie;

    public UserMovie(String name, String fbId , String movie) {
        this.name = name;
        this.fbId = fbId;
        this.movie = movie;
    }

}
