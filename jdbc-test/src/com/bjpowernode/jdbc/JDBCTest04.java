package com.bjpowernode.jdbc;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * 处理查询结果集
 */
public class JDBCTest04 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        //使用资源绑定器绑定属性文件
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");
        try {
            //1.注册驱动
            Class.forName(driver);
            //2.获取连接
            conn = DriverManager.getConnection(url, user, password);
            //3.获取数据库操作对象
            stmt = conn.createStatement();
            //4.执行sql
            String sql = "select empno,ename,sal from emp";
            rs = stmt.executeQuery(sql);
            //5.处理查询结果集
            while (rs.next()){
                String empno = rs.getString("empno");
                String ename = rs.getString("ename");
                String sal = rs.getString("sal");
                System.out.println(empno+","+ename+","+sal);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }//6.释放资源
        finally {
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
            if(stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
