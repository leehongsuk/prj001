package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySql
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("core.log.jdbc.driver.MysqlDriver");

            Connection con = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost", "root", "l2619097");

            java.sql.Statement st = null;
            ResultSet rs = null;
            st = con.createStatement();
            rs = st.executeQuery("SHOW DATABASES");

            if (st.execute("SHOW DATABASES"))
            {
                rs = st.getResultSet();
            }

            while (rs.next())
            {
                String str = rs.getString(1);
                System.out.println(str);
            }
        }
        catch ( ClassNotFoundException e )
        {
            e.printStackTrace();
        }
        catch ( SQLException sqex )
        {
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        }
    }
}
