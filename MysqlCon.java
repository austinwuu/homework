package com.example.mysqltest;

import android.util.Log;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MysqlCon {// 資料庫定義
        String mysql_ip = "kolmaker.com.tw";
        int mysql_port = 3306; // Port 預設為 3306
        String db_name = "kolmaker_web";
        String url = "jdbc:mysql://"+mysql_ip+":"+mysql_port+"/"+db_name;
        String db_user = "kolmaker_test";
        String db_password = "Derrickting&2ljidrgl";
        public void run() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Log.v("DB","加載驅動成功");
            }catch( ClassNotFoundException e) {
                Log.e("DB","加載驅動失敗");
                return;
            }
            // 連接資料庫
            try {
                Connection con = DriverManager.getConnection(url,db_user,db_password);
                Log.v("DB","遠端連接成功");
            }catch(SQLException e) {
                Log.e("DB","遠端連接失敗");
                Log.e("DB", e.toString());
            }
        }

        public String getData() {
            String data = "";
            try {
                Connection con = DriverManager.getConnection(url, db_user, db_password);
                String sql = "SELECT * FROM test";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next())
                {
                    String id = rs.getString("name");
                    String name = rs.getString("address");
                    data += id + ", " + name + "\n";
                }
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return data;
        }
}