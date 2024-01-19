package com.yunus.springDemo.DataAccess;

import com.yunus.springDemo.DataAccess.DataBaseConnection.PostgreConnection;

import java.sql.*;

public class JDBCUserInfoDAL{
    PostgreConnection postgreConnection = new PostgreConnection();

    public void insert(String tableAndCollumns, String values) throws Exception{
        postgreConnection.prepareConnection("insert into"+tableAndCollumns+"VALUES"+values);

    }

    public String readTable() throws Exception{
        ResultSet resultSet = postgreConnection.prepareConnection("select * from user_info");
        String[] query ={"id", "isim", "tc"};
        int i = 0;
        String data = " ";
        while (resultSet.next()) {
            while (i < query.length) {
                data += resultSet.getString(query[i]);
                data += " ";
                i++;
            }
            data+="\n";
            System.out.println(data);
            i = 0;
        }
        return data;
    }
}
