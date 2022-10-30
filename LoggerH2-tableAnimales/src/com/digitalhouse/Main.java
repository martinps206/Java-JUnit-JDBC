package com.digitalhouse;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    
    private final static Logger LOGGER = Logger.getLogger(String.valueOf(Main.class));

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS ANIMALES; CREATE TABLE ANIMALES "
            + "("
            + " ID INT PRIMARY KEY,"
            + " NOMBRE varchar(100) NOT NULL, "
            + " TIPO varchar(100) NOT NULL "
            + " )";

    private static final String SQL_INSERT =  "INSERT INTO ANIMALES (ID, NOMBRE, TIPO) VALUES (1, 'Pancho', 'Perro')";
    private static final String SQL_INSERT2 =  "INSERT INTO ANIMALES (ID, NOMBRE, TIPO) VALUES (2, 'Pillo', 'Gato')";
    private static final String SQL_INSERT3 =  "INSERT INTO ANIMALES (ID, NOMBRE, TIPO) VALUES (3, 'Cepillo', 'Elefante')";
    private static final String SQL_INSERT4 =  "INSERT INTO ANIMALES (ID, NOMBRE, TIPO) VALUES (4, 'Pepe', 'Perro')";
    private static final String SQL_INSERT5 =  "INSERT INTO ANIMALES (ID, NOMBRE, TIPO) VALUES (5, 'Rolo', 'Caballo')";

    private static final String SQL_DELETE =  "DELETE FROM ANIMALES WHERE ID=2";

    public static void main(String[] args) throws SQLException {

        Connection connection = null;

        try {
            connection= getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            Statement statementIns = connection.createStatement();
            statementIns.execute(SQL_INSERT);

            Statement statementIns2 = connection.createStatement();
            statementIns2.execute(SQL_INSERT2);

            Statement statementIns3 = connection.createStatement();
            statementIns3.execute(SQL_INSERT3);

            Statement statementIns4 = connection.createStatement();
            statementIns4.execute(SQL_INSERT4);

            Statement statementIns5 = connection.createStatement();
            statementIns5.execute(SQL_INSERT5);

            LOGGER.info("Se ejecutaron todos los inserts");

            verAnimales(connection);

            //Statement statementDEl = connection.createStatement();
            //statementDEl.execute(SQL_DELETE);

            //verAnimales(connection);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }

    }

    public static Connection getConnection() {
        
        DriverManager driverManager = null;
        Connection conn = null;
        
        try{
            Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
            conn = driverManager.getConnection("jdbc:h2:~/h2-database", "root", "");
        } catch (Exception e) {
            LOGGER.error("Hubo un problema al conectar a la BD", e);
        }
        return conn;
    }

    private static void verAnimales(Connection connection) throws SQLException {
        String sql = "SELECT * FROM ANIMALES";
        Statement sqlSmt = connection.createStatement();
        ResultSet rs = sqlSmt.executeQuery(sql);
        while (rs.next()) {

            System.out.println(rs.getInt(1) + " - "
                    + rs.getString(2) + " - " + rs.getString(3));
        }
    }
}
