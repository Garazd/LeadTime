package server;

import java.sql.*;

public class ConnectBase {

    public static String serverName = "localhost";
    public static String port = "3306";
    public static String mydatabase = "leadtime";
    public static String username_db = "root";
    public static String password_db = "root";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://" + serverName + ":" + port + "/" + mydatabase + "?characterEncoding=utf8";

            try {
                Connection connection = DriverManager.getConnection(url, username_db, password_db);
                System.out.println("Connection Susses");

                Statement st = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

                ResultSet rs = st.executeQuery("SELECT login, pass FROM admins WHERE id=3");

                if (rs.next()) {

                    System.out.println(rs.getString("login"));
                    System.out.println(rs.getString("pass"));

                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
