package data;

import client.FrameViewClient;
import client.database.ConnectionDataBase;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class DataSQL
{
    public static void authorizationSQLquery() throws SQLException
    {
        Statement statement = null;
        //Statement statement = ConnectionDataBase.getConnection().createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_SENSITIVE)
        {
            ResultSet resultSet;// =
                    //statement.executeQuery("SELECT login, password FROM "users" " +
                    //"WHERE login='" + FrameViewClient.getLoginField().getText() + "' " +
                    //"AND  pass='" + Arrays.toString(FrameViewClient.getPasswordField()) + "'");

        resultSet = statement.executeQuery("SELECT * FROM admins");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String login = resultSet.getString("login");
            String password = resultSet.getString("password");
            System.out.format("%d %s %s\n", id, login, password);
        }
            if (resultSet.next()) {
                System.out.println("OK");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Вы ввели неверный логин или пароль!", "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}



