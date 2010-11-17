package models.util;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
/**
 * Hibernate Utility class with a convenient method to get Session Factory object.
 *
 * @author Administrator
 */
public class HibernateUtil {
    public static final ThreadLocal session = new ThreadLocal();
    private static final SessionFactory sessionFactory;

    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
     public static Session currentSession() throws HibernateException {
        Session sess = (Session) session.get();
        // Open a new Session, if this thread has none yet
        if(sess == null){
          sess = sessionFactory.openSession();
          // Store it in the ThreadLocal variable
          session.set(sess);
        }
        return sess;
  }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void SessionClose() throws Exception {
        Session s = (Session) session.get();
        if (s != null)
          s.close();
        session.set(null);
  }
}
