<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.lang.reflect.Method"%>
<%@page import="java.lang.reflect.Field"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>index</title>
</head>
<body>
    <table border=1>
        <tr>
            <th>데이터베이스</th>
        </tr>
        <%
        /* mysql ...
        try
        {
        	Class.forName("com.mysql.jdbc.Driver");
            
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
                String str = rs.getNString(1);
                System.out.println(str);
                %><tr><td><%=str%></td></tr><%
            }
        } 
        catch (SQLException sqex)
        {
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        }*/
        %>
    </table>
</body>
</html>