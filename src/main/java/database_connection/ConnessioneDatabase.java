package database_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnessioneDatabase {
public static Connection getconnessione() throws SQLException {
    return DriverManager.getConnection("jdbc:postgresql://localhost:5432/sedute_laurea" ,
            "postgres" ,
            System.getenv("DB_PASSWORD")
        );
    }
}