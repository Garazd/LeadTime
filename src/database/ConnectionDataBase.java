package database;

import java.sql.*;

public class ConnectionDataBase {

    static final String serverName = "localhost";
    static final String port = "3306";
    static final String database = "database";
    static final String username = "root";
    static final String password = "8021987";
    static final String connectionUrl = "jdbc:mysql://" + serverName + ":" + port + "/" + database + "?characterEncoding=utf8";

    public ConnectionDataBase() {

        Connection connectionDataBase = null;
        Statement statement = null;
        ResultSet resultSet;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connectionDataBase = DriverManager.getConnection(connectionUrl, username, password);
            System.out.println("Connect successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            statement = connectionDataBase.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            resultSet = statement.executeQuery("SELECT * FROM admins");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String login = resultSet.getString("login");
                String password = resultSet.getString("password");
                System.out.format("%d %s %s\n", id, login, password);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
