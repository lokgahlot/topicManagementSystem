package com.lionbank.manager;

import java.sql.SQLException;

import com.lionbank.dao.LoginDao;
import com.lionbank.exception.LoginFailureException;
import com.lionbank.model.User;

public class LoginManager {
	
	public User validateUserNameAndPassword(User user) throws SQLException, LoginFailureException{
		LoginDao loginDao = new LoginDao();
		User validatedUser = loginDao.validateUserNameAndPassword(user);
		if(null == validatedUser){
			throw new LoginFailureException();
		}
		else{
			return validatedUser;
		}
	}

}
