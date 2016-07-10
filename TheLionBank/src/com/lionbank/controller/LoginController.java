package com.lionbank.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lionbank.exception.LoginFailureException;
import com.lionbank.exception.RegistrationFailureException;
import com.lionbank.manager.LoginManager;
import com.lionbank.model.User;
import com.lionbank.util.PasswordSecurity;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public LoginController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

			if (("loginPost").equals(request.getParameter("name"))) {
				String userName = request.getParameter("userName");
				String password = request.getParameter("password");
				// Password Security

				PasswordSecurity passwordSecurity = new PasswordSecurity();
				String shaPassword = null;
				try {

					shaPassword = passwordSecurity.shaEncrpytPassword(password);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					String message = "Please enter correct username and password!";
					request.setAttribute("message", message);
					RequestDispatcher rd = request.getRequestDispatcher("jsp/login.jsp");
					rd.forward(request, response);
				}

				User user = new User();
				user.setUserName(userName);
				user.setPassword(shaPassword);
				LoginManager loginManager = new LoginManager();
				try {
					User validatedUser = loginManager.validateUserNameAndPassword(user);
					if(validatedUser.isIfValid()==true){
						request.setAttribute("user", validatedUser);
						RequestDispatcher rd = request.getRequestDispatcher("jsp/userProfile.jsp");
						rd.forward(request, response);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					String message = e.getMessage();
					request.setAttribute("message", message);
					RequestDispatcher rd = request.getRequestDispatcher("jsp/login.jsp");
					rd.forward(request, response);
				} catch (LoginFailureException e) {
					// TODO Auto-generated catch block
					String message = e.getMessage();
					request.setAttribute("message", message);
					RequestDispatcher rd = request.getRequestDispatcher("jsp/login.jsp");
					rd.forward(request, response);
				}
				

			}
			
			


		
	}

}
