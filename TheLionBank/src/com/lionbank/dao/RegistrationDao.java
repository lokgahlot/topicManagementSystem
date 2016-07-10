package com.lionbank.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lionbank.model.User;
import com.lionbank.util.ConnectionManager;
import com.lionbank.util.DbUtil;

public class RegistrationDao {

	private Connection connection;
	private Statement statement;
	
	public String registerUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		String query = "INSERT INTO TLB_USER_DETAILS ( TLB_USER_NAME, TLB_USER_EMAIL, TLB_USER_PHONE, TLB_USER_AGE, TLB_USER_ACCOUNT_NUMBER, TLB_USER_PASSWORD) VALUES ('"+user.getUserName()+"', '"+user.getEmailId()+"', '"+user.getPhoneNumber()+"', '"+user.getAge()+"', '"+user.getAccountNumber()+"', '"+user.getPassword()+"');";
		int result = 0;
		String message = "";
		try {
            connection = ConnectionManager.getConnection();
            statement = connection.createStatement();
            result = statement.executeUpdate(query);
            if(result != 0){
            	message = "Registration Successful! Please log-in.";
            }
            else if(result == 0){
            	message = "Registration unsuccessful! Please try again in some time.";
            }
            
           
        } finally {
            DbUtil.close(statement);
            DbUtil.close(connection);
        }
		return message;
 
		
	}

}
