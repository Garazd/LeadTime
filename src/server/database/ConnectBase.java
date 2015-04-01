package server.database;

import server.data.DataSQL;

import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;
import java.sql.*;

public class ConnectBase
{
    static Connection connection;

    ConnectBase()
    {
        setConnection();
    }

    private void setConnection()
    {
        try
        {
            String serverName = "localhost";
            String port = "3306";
            String mydatabase = "leadtime";
            String username_db = "root";
            String password_db = "root";

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://" + serverName + ":" + port + "/" + mydatabase + "?autoReconnect=true&characterEncoding=utf8";

            try
            {
                connection = DriverManager.getConnection(url, username_db, password_db);
                System.out.println("Соединение установленно!");
                DataSQL.sampleSQLquery();
            }
            catch (CommunicationsException ce)
            {
                try
                {
                    DataSQL.sampleSQLquery();
                }
                catch (SQLException ignore){}
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
        catch (InstantiationException | IllegalAccessException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public static Connection getConnection()
    {
        return connection;
    }
}