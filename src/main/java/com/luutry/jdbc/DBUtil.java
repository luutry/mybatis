package com.luutry.jdbc;

import java.sql.*;

/**
 * Is life always this hard,or is it just when you are a kid?
 * I am already grown up, I just get older.
 * Always like this.
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 *
 * @Author Luutry wei
 * @Date 2019-04-23 21:32
 * Desc:
 */

public class DBUtil {

    private static final String URL="jdbc:mysql://127.0.0.1:3306/luutry";
    private static final String USER="root";
    private static final String PASSWORD="root";


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1,加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2,获得数据库链接
        Connection connection= DriverManager.getConnection(URL,USER,PASSWORD);

        //3,操作数据库
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("Select user_name from imooc_goddess");

        while (resultSet.next()){
            System.out.println(resultSet.getString("user_name"));
        }
    }
}
