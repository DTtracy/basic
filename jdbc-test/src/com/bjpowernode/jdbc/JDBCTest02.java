package com.bjpowernode.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest02 {
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2，获取连接
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root",
                    "root");
            //3.获取数据库操作对象
            stmt = conn.createStatement();
            //4.执行sql语句
            String sql = "insert into t_student values (1,'lisi','男','1','1998-05-11') ";
            int count = stmt.executeUpdate(sql);
            System.out.println(count==1?"添加成功":"删除失败");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //释放资源
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
