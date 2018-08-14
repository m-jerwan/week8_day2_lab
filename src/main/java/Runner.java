import db.DBHelper;
import models.Director;
import models.Film;

public class Runner {

    public static void main(String[] args) {

        Director director1 = new Director("Marcin Jerwan");
        DBHelper.save(director1);

        Film film1 = new Film("Beautiful Mind", 15, director1);
        DBHelper.save(film1);
    }
}