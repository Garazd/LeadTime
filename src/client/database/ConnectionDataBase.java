package client.database;

import com.mysql.jdbc.CommunicationsException;
import data.DataSQL;

import javax.swing.*;
import java.sql.*;

public class ConnectionDataBase {

    static Connection connectionDataBase;

    public ConnectionDataBase() {
        setConnectionDataBase();
    }

    static final String serverName = "localhost";
    static final String port = "3306";
    static final String database = "LeadTime";
    static final String username = "root";
    static final String password = "";
    static final String connectionUrl = "jdbc:mysql://" + serverName + ":" + port + "/" + database + "?characterEncoding=utf8";

    private void setConnectionDataBase() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connectionDataBase = DriverManager.getConnection(connectionUrl, username, password);
            System.out.println("Connect successfully");
        }
        catch (CommunicationsException ce) {
            try
            {
                DataSQL.authorizationSQLquery();
            }
            catch (SQLException ignore){}

        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to Database");
            //e.printStackTrace();
        }
        catch(InstantiationError e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection()
    {
        return connectionDataBase;
    }
}