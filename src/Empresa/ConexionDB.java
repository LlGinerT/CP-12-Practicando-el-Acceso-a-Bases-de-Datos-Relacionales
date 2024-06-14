package Empresa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.InputStream;
import java.util.Properties;

public class ConexionDB {
    private static final String URL;
    private static final String USER;
    private static final String PASSWORD;

    static {
        Properties props = new Properties();
        try (InputStream input = ConexionDB.class.getClassLoader().getResourceAsStream(".env")) {
            props.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        URL = props.getProperty("DB_URL");
        USER = props.getProperty("DB_USER");
        PASSWORD = props.getProperty("DB_PASSWORD");
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}