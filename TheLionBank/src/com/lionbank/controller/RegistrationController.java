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

import com.lionbank.exception.RegistrationFailureException;
import com.lionbank.manager.RegistrationManager;
import com.lionbank.model.User;
import com.lionbank.util.PasswordSecurity;

/**
 * Servlet implementation class RegistrationController
 */
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationController() {
		super();
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
		if ("registerPost".equals(request.getParameter("name"))) {
			String userName = request.getParameter("userName");
			String emailId = request.getParameter("email");
			Long phoneNumber = Long.parseLong(request.getParameter("phone"));
			Long accountNumber = Long.parseLong(request.getParameter("accountNumber"));
			int age = Integer.parseInt(request.getParameter("age"));
			String password = request.getParameter("password");

			// Password Security

			PasswordSecurity passwordSecurity = new PasswordSecurity();
			String shaPassword = null;
			try {

				shaPassword = passwordSecurity.shaEncrpytPassword(password);
			} catch (RegistrationFailureException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				String message = e.getMessage();
				request.setAttribute("message", message);
				RequestDispatcher rd = request.getRequestDispatcher("jsp/register.jsp");
				rd.forward(request, response);
			}
			User user = new User(userName, shaPassword, accountNumber, emailId, age, phoneNumber);
			RegistrationManager registrationManager = new RegistrationManager();
			try {
				String message = registrationManager.registerUser(user);
				request.setAttribute("message", message);
				RequestDispatcher rd = request.getRequestDispatcher("jsp/login.jsp");
				rd.forward(request, response);

			} catch (RegistrationFailureException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				String message = e.getMessage();
				request.setAttribute("message", message);
				RequestDispatcher rd = request.getRequestDispatcher("jsp/register.jsp");
				rd.forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				String message = e.getMessage();
				request.setAttribute("message", message);
				RequestDispatcher rd = request.getRequestDispatcher("jsp/register.jsp");
				rd.forward(request, response);
			}

		}
	}

}
