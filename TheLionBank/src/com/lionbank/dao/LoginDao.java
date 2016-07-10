package com.lionbank.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lionbank.model.User;
import com.lionbank.util.ConnectionManager;
import com.lionbank.util.DbUtil;


public class LoginDao {
	private Connection connection;
	private Statement statement;

	public User validateUserNameAndPassword(User user) throws SQLException{
		String query = "";
		ResultSet resultSet = null;
		User user2 = null;
		try {
            connection = ConnectionManager.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String userName = resultSet.getString("USERNAME");
                //String password = resultSet.getInt("PASSWORD");
                Long accountNumber = resultSet.getLong("ACCOUNT_NUMBER");
                
                user2 = new User();
                user2.setUserName(userName);
                user2.setAccountNumber(accountNumber);
               
            }
           
        } finally {
            DbUtil.close(resultSet);
            DbUtil.close(statement);
            DbUtil.close(connection);
        }
 
		return user2;
		
	}
}
