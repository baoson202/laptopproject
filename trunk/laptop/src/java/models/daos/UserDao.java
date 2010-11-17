/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package models.daos;

import java.util.List;
import models.pojos.*;
import models.util.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Administrator
 */
public class UserDao {
    public static boolean KiemTraDangNhap(String username, String password){
         Session sessionObj = null;
         List<User> so;
         try {

             sessionObj = HibernateUtil.currentSession();

             so = sessionObj.createSQLQuery("call sp_KiemTraDangNhap(?,?)")
                            .setString("username", username)
                            .setString("password",password)
                         .list();
             if(so.size()==0)
                 return false;




         } catch (Exception ex) {
            System.out.println(ex.getMessage());
         }finally{
         //    sessionObj.close();
         }
         return true;

    }
    public static void InsertUser(User us){

        Session session = null;
        session =HibernateUtil.currentSession();
         Transaction tx = session.beginTransaction();
        session.save(us);
            tx.commit();
    }
}
