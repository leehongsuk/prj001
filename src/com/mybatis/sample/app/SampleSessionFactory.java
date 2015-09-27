package com.mybatis.sample.app;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SampleSessionFactory
{
    public void demo()
    {
        // 앞서 정의했던 xml 설정 파일의 위치와 파일명.
        String resource = "com/mybatis/sample/sql/mybatis-config.xml";

        // 따로 properties 파일에 정의해도 되지만 귀찮아서 객체로 직접 생성.
        Properties props = new Properties();

        
        //props.put("driver", "com.mysql.jdbc.Driver");
        props.put("driver", "core.log.jdbc.driver.MysqlDriver");
        props.put("url", "jdbc:mysql://localhost/mysql");
        props.put("username", "root");
        props.put("password", "l2619097");
        /*
        //props.put("driver", "oracle.jdbc.OracleDriver");
        props.put("driver", "core.log.jdbc.driver.OracleDriver");
        props.put("url", "jdbc:oracle:thin:@localhost:1521:orcl");
        props.put("username", "scott");
        props.put("password", "tiger");
        */

        SqlSession session = null;

        try
        {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream, props);

            // false 는 autoCommit 하지 않겠다는 의미.
            session = sqlSessionFactory.openSession(false);

        } catch (IOException e)
        {
            e.printStackTrace();
            return; // 에러나면 메소드 종료
        }

        // 쿼리에 필요한 입력값을 셋팅한다.
        HashMap<String, String> input = new HashMap<String, String>();
        //input.put("empno", "7369");
        input.put("User", "root");

        //List<HashMap<String, String>> outputs = session.selectList("SqlSampleMapper.selectSample_ora", input);
        List<HashMap<String, String>> outputs = session.selectList("SqlSampleMapper.selectSample_my", input);

        System.out.println(outputs.get(0));

        session.commit();
        session.close();
    }
    
    public  static void main(String args[])
    {
         SampleSessionFactory a = new SampleSessionFactory();
        a.demo();
    }
}