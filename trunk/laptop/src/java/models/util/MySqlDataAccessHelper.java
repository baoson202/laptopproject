/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package models.util;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.io.File;
import java.sql.DriverManager;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

/**
 *
 * @author NHAnh
 */
public class MySqlDataAccessHelper {
     protected static String connectionString;
     public static Connection getConnection() {
        Connection connect = null;
        try {
            DriverManager.registerDriver(new Driver());
            String connectionString="jdbc:mysql://localhost:3306/laptopdb";
            Properties pros=new Properties();
            pros.setProperty("characterEncoding", "utf8");
            pros.setProperty("user", "root");
            connect = DriverManager.getConnection(connectionString, pros);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return connect;
    }

}
