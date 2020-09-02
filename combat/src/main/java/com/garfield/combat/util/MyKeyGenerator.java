package com.garfield.combat.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author jingliyuan
 * @date 2020/9/2
 */
public class MyKeyGenerator {
    static Connection conn = null;
    static PreparedStatement pstm = null;
    static ResultSet rs = null;

    public static void main(String[] args) {
        String sql = "select * from all_tables where owner = ?";
        ArrayList<String> tableNameList = new ArrayList<>();
        ArrayList<String> entityList = new ArrayList<>();
        try {
            //1)获取连接对象
            getConnection();
            //2)预编译sql
            pstm = conn.prepareStatement(sql);
            //3)设置参数
            pstm.setString(1, "KNOWLEDGE");
            //4)发送参数
            rs = pstm.executeQuery();
            //5)操作结果集，数据封装成 一个实体对象
            while (rs.next()) {
                //说明存在对应用户名的用户
                tableNameList.add(rs.getString("TABLE_NAME"));
//                System.out.println(rs.getString("TABLE_NAME"));
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            close(conn, pstm, rs);

        }

        for (String tableName : tableNameList) {
            StringBuilder stringBuilder = new StringBuilder();
            if (tableName.startsWith("T_C_")) {
                //CUSTOMIZE_TIME
                String s1 = tableName.substring(4);
                //customize_time
                String s2 = s1.toLowerCase();
                //customize,time
                String[] split = s2.split("_");
                for (String temp : split) {
                    String s3 = upperCase(temp);
                    stringBuilder.append(s3);
                }
                entityList.add(stringBuilder.toString());

            }else if (tableName.startsWith("T_D_")) {
                //CUSTOMIZE_TIME
                String s1 = tableName.substring(4);
                //customize_time
                String s2 = s1.toLowerCase();
                //customize,time
                String[] split = s2.split("_");
                for (String temp : split) {
                    String s3 = upperCase(temp);
                    stringBuilder.append(s3);
                }
                entityList.add(stringBuilder.toString());

            }else{
                String[] split = tableName.split("_");
                for (String temp : split) {
                    String s3 = upperCase(temp);
                    stringBuilder.append(s3);
                }
                entityList.add(stringBuilder.toString());
            }


        }
        System.out.println("==============entity 的名称==============");
        System.out.println(entityList.size());
        System.out.println(tableNameList.size());

        for (int i = 0; i < entityList.size(); i++) {
//            System.out.println(String.format("%s  %s",tableNameList.get(i),entityList.get(i) ));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<table tableName=\"");
            stringBuilder.append(tableNameList.get(i));
            stringBuilder.append("\" domainObjectName=\"");
            stringBuilder.append(entityList.get(i));
            stringBuilder.append("\" enableCountByExample=\"true\" enableUpdateByExample=\"true\"\n" +
                    "            enableDeleteByExample=\"true\" enableSelectByExample=\"true\" selectByExampleQueryId=\"true\">\n" +
                    "        </table>");
            System.out.println(stringBuilder.toString());
        }


    }



    public static Connection getConnection() {
        try {
            String url = "jdbc:oracle:thin:@192.168.10.185:1521:ewell";
            String user = "knowledge";
            String password = "ewell";

            Class.forName("oracle.jdbc.driver.OracleDriver");//加载数据驱动
            conn = DriverManager.getConnection(url, user, password);// 连接数据库

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("加载数据库驱动失败");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("连接数据库失败");
        }
        return conn;
    }

    public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static String upperCase(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 32);
        }
        return new String(ch);
    }

}