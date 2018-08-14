import db.DBDirector;
import db.DBHelper;
import models.Director;
import models.Film;
import models.Genre;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Director director1 = new Director("Marcin Jerwan");
        DBHelper.save(director1);

        Calendar date = new GregorianCalendar(2018, 4,5);
        Film film1 = new Film("Beautiful Mind", 15, director1, Genre.ROMANCE, date);
        DBHelper.save(film1);

        Film film2 = new Film ("Famous Film", 12, director1, Genre.ROMANCE, date);
        DBHelper.save(film2);

        List<Film> films = DBDirector.getFilmsByDir(director1);


    }
}
