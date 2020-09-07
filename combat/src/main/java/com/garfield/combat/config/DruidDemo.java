package com.garfield.combat.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * @author jingliyuan
 * @date 2020/9/4
 */
public class DruidDemo {
    public static void main(String[] args) throws Exception {
        InputStream resourceAsStream = DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");
        FileReader fileReader = new FileReader("H:\\workspace\\demo_project\\combat\\src\\druid.properties");
        Properties properties = new Properties();
//        properties.load(resourceAsStream);
        properties.load(fileReader);

        String sql = "SELECT * FROM T_C_CATALOGUE WHERE CATALOGUE_CODE = ?";
        Connection connection;
        PreparedStatement preparedStatement;
        //1.
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        connection = dataSource.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,"01101100");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String catalogueName = resultSet.getString("CATALOGUE_NAME");
            System.out.println(catalogueName);
        }
        if(!preparedStatement.isClosed()){
            preparedStatement.close();
        }
        if(!connection.isClosed()){
            connection.close();
        }
        fileReader.close();

    }
}
