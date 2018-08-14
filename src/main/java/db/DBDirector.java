package db;

import models.Director;
import models.Film;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBDirector {

    private static Session session;


    public static List<Film> getFilmsByDir(Director director){
        session = HibernateUtil.getSessionFactory().openSession();

        List<Film> result = null;

        try {
            Criteria cr = session.createCriteria(Film.class);
            cr.add(Restrictions.eq("director", director));
            result = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }
}
