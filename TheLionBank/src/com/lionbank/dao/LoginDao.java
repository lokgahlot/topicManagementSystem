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
		String query = "select * from TLB_USER_DETAILS where TLB_USER_NAME = '"+user.getUserName()+"' and TLB_USER_PASSWORD = '"+user.getPassword()+"';";
		ResultSet resultSet = null;
		
		User user2 = null;
		try {
			
            connection = ConnectionManager.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String userName = resultSet.getString("TLB_USER_NAME");
                Long accountNumber = resultSet.getLong("TLB_USER_ACCOUNT_NUMBER");
                user2 = new User();
                user2.setUserName(userName);
                user2.setAccountNumber(accountNumber);
                user2.setIfValid(true);
               
            }
           
        } finally {
            DbUtil.close(resultSet);
            DbUtil.close(statement);
            DbUtil.close(connection);
        }
 
		return user2;
		
	}
}
