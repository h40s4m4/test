package com.example.demo.configuration;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration
public class MyBatisConnection {

    private static final Logger LOG = LogManager.getLogger(MyBatisConnection.class);
    private static final String MY_BATIS_CONFIG_FILE = "mybatis-config.xml";
    private static SqlSessionFactory sqlSessionFactory = null;


    public MyBatisConnection() { //NOSONAR
    }

    static {
        Reader reader;
        try {
            reader            = Resources.getResourceAsReader(MY_BATIS_CONFIG_FILE);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException exception) {
            LOG.error(String.format("Error al crear el conector MyBatis: %s", exception.getMessage()));
        }
    }

    public static SqlSession openSession() throws SQLException {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        Environment enviroment = sqlSession.getConfiguration().getEnvironment();
        Connection  connection = enviroment.getDataSource().getConnection();


        LOG.info(String.format("Abriendo la conexión MyBatis %s", connection.getClientInfo().stringPropertyNames()));

        return sqlSession;
    }


//    public static SqlSessionFactory getSqlSessionFactory() {
//        return sqlSessionFactory;
//    }
}
