package repository;

import repository.customer_repo.CustomerImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    private String jdbcURL="jdbc:mysql://localhost:3306/furama_data";
    private String jdbcUsername="root";
    private String jdbcPassword="000000";

    private Connection connection;



    public ConnectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection(){return connection;}
}
