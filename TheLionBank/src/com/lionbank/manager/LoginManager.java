package com.lionbank.manager;

import java.sql.SQLException;

import com.lionbank.dao.LoginDao;
import com.lionbank.model.User;

public class LoginManager {
	
	public User validateUserNameAndPassword(User user) throws SQLException{
		LoginDao loginDao = new LoginDao();
		return loginDao.validateUserNameAndPassword(user);
	}

}
