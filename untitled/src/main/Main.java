package main;

import main.connection.Database;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Main.class));

    private static final String SQL_CREATE_TABLE_DENTIST = "DROP TABLE IF EXISTS DENTIST; CREATE TABLE DENTIST "
            + "("
            + " ID INT PRIMARY KEY,"
            + " SURNAME varchar(100) NOT NULL, "
            + " NAME varchar(100) NOT NULL, "
            + " MEDICALLICENSE varchar(100) NOT NULL "
            + " )";

    private static final String SQL_INSERT1 =  "INSERT INTO DENTIST (ID, SURNAME, NAME, MEDICALLICENSE) VALUES (1, 'Perez', 'Pancho', '12345abc')";

    private static final String SQL_INSERT2 =  "INSERT INTO DENTIST (ID, SURNAME, NAME, MEDICALLICENSE) VALUES (2, 'Gonzalez', 'Panchito', '12346abc')";


    public static void main(String[] args) {

        Connection connection = Database.getConnection();

        try {
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE_DENTIST);

            Statement statement1 = connection.createStatement();
            statement1.execute(SQL_INSERT1);

            Statement statement2 = connection.createStatement();
            statement2.execute(SQL_INSERT2);

            verDentist(connection);

        } catch (Exception e){
            //LOGGER.error("An error has occurred");
            System.out.println("ERROR");
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private static void verDentist(Connection connection) throws SQLException {
        String sql = "SELECT * FROM DENTIST";
        Statement sqlSmt = connection.createStatement();
        ResultSet rs = sqlSmt.executeQuery(sql);
        while (rs.next()) {

            System.out.println(rs.getInt(1) + " - "
                    + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4) );
        }
    }

}
