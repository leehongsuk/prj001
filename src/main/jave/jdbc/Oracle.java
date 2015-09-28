package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Oracle
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        // 1. JDBC 드라이브 로드...
        //Class.forName("oracle.jdbc.OracleDriver");        
        Class.forName("core.log.jdbc.driver.OracleDriver");
        
        // 2. 접속정보 Connection 객체생성...
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "scott", "tiger");
        
        // 3.Statement 객체 생성...
        Statement stmt = conn.createStatement();
        
        // 4. 쿼리 실행...
        ResultSet rs = stmt.executeQuery("select 1+1 result from dual");        
        while(rs.next())
        {
            System.out.println(rs.getString(1));
        }     
        
        // 5. 리소스 반환
        rs.close();
        stmt.close();
        conn.close();
    }
}
