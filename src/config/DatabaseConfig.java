package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

    private static DatabaseConfig instance;

    private Connection connection;

    private static String URL = "jdbc:postgresql://joao-database-15395.7tt.aws-us-east-1.cockroachlabs.cloud:26257/defaultdb";

    private static String USER = "jvteixeiramelo";

    private static String PASSWORD = "rd5V_Ij_Q36DZycgYxG7iA";

    private DatabaseConfig() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");

            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException(e);
        }
    }

    public static DatabaseConfig getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseConfig();
        } else if (instance.getConnection().isClosed()) {
            instance = new DatabaseConfig();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

}
