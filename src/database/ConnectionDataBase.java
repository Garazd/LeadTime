package database;

import java.sql.*;

public class ConnectionDataBase
{

    public static String serverName = "localhost";  // Имя или IP-адрес сервера баз данных
    public static String port = "3306";             // Порт сервера баз данных
    public static String mydatabase = "test";       // Имя базы данных
    public static String username_db = "root";      // Логин для подключения к базе данных
    public static String password_db = "";          // Пароль для подключния к базе данных

    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://" + serverName + ":"+ port + "/" + mydatabase + "?characterEncoding=utf8";   // URL подключения
            try
            {
                Connection connection = DriverManager.getConnection(url, username_db, password_db);
                System.out.println("Connection Susses");

                Statement st = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

                ResultSet rs = st.executeQuery("SELECT id, name FROM tab_1 WHERE ID = 1");

                if(rs.next()) {
                    System.out.println(rs.getString("name"));

                    rs.updateString("name", "test2");
                    rs.updateRow();

                    System.out.println(rs.getString("name"));
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