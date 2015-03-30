package server;

import java.sql.*;

public class ConnectBase {

    static Connection connection;

    ConnectBase() {
        setConnection();
    }

    private void setConnection() {
        try {
            String serverName = "localhost";
            String port = "3306";
            String mydatabase = "leadtime";
            String username_db = "root";
            String password_db = "root";

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://" + serverName + ":" + port + "/" + mydatabase + "?characterEncoding=utf8";

            try {
                connection = DriverManager.getConnection(url, username_db, password_db);
                System.out.println("Соединение установленно!");

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
