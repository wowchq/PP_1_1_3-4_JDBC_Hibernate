package jm.task.core.jdbc.util;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.*;


public class Util {

    private static final Logger logger = Logger.getLogger(Util.class.getName());
    static {
        logger.setLevel(Level.ALL);
    }



    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/Kata-1.1.3";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "17082002";

    public static Connection getConnection() {
        Connection connection = null;
        logger.info("Connecting to database...");
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            logger.info("Connection OK");
        } catch (ClassNotFoundException e) {
            logger.log(Level.SEVERE, "JDBC Driver not found: ", e);
        } catch (SQLException e) {
            logger.log(Level.SEVERE,"Connection error: ", e);
        }
        return connection;
    }

}

