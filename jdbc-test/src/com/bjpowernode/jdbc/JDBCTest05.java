package com.bjpowernode.jdbc;

import java.sql.*;
import java.util.Scanner;

public class JDBCTest05 {
    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        System.out.println("请输入desc/asc");
        String keywords = s.nextLine();

        //执行SQL
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        //1.注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2，获取连接
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root",
                    "root");
            //3.获取预编译的数据库操作对象
            String sql = "select ename from emp oder by ename ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,keywords);
            //执行sql
            rs = ps.executeQuery();
            //遍历结果集
            while (rs.next()){
                System.out.println(rs.getString("ename"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }*/
        Scanner s = new Scanner(System.in);
        System.out.println("请输入desc/asc");
        String keywords = s.nextLine();

        //执行SQL
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        //1.注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2，获取连接
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root",
                    "root");
            //3.获取数据库操作对象
            stmt = conn.createStatement();
            //执行sql
            String sql = "select ename from emp order by ename "+keywords;
            rs = stmt.executeQuery(sql);
            //遍历结果集
            while (rs.next()){
                System.out.println(rs.getString("ename"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
