package com.lionbank.manager;

import java.sql.SQLException;

import com.lionbank.dao.RegistrationDao;
import com.lionbank.exception.RegistrationFailureException;
import com.lionbank.model.User;

public class RegistrationManager {
	public String registerUser(User user) throws RegistrationFailureException, SQLException{
		RegistrationDao registrationDao = new RegistrationDao();
		String message = registrationDao.registerUser(user);
		if(null == message){
			throw new RegistrationFailureException();
		}
		else{
			return message;
		}
		
	}

}
