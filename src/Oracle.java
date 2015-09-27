import java.sql.Connection;
import java.sql.DriverManager;
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
        //stmt.executeUpdate("insert into person (no,name,email,age,sex) values (1, '김동혁', 'donghyuk@nate.com', 2, 'M') ");
        stmt.execute("select 1+1 from dual");
        // 5. 리소스 반환
        stmt.close();
        conn.close();

    }
}
