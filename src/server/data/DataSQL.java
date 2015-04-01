package server.data;

import server.database.ConnectBase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataSQL
{
    public static void sampleSQLquery() throws SQLException
    {
        try (
            Statement st = ConnectBase.getConnection().createStatement()
        )
        {
            ResultSet rs = st.executeQuery("SELECT * FROM admins");
            while (rs.next())
            {
                System.out.println(rs.getString("login"));
            }
        }
    }
}