package main.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;

public class Database {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Database.class));

    public static Connection getConnection(){

        Connection connection = null;
        DriverManager driverManager = null;

        try {
            Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
            connection = driverManager.getConnection("jdbc:h2:~/h2-database2", "sa", "");

        } catch (Exception e){
            //LOGGER.error("Error1", e);
            System.out.println("ERROR");
        }

        return connection;
    }



}
