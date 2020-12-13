package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DoctorRegisterController extends HttpServlet {
public void dopost(HttpServletRequest request,HttpServletResponse resonse) throws IOException
{
	String name=request.getParameter("name");
	String password=request.getParameter("password");
	String email=request.getParameter("email");
	String specialization=request.getParameter("specialization");
    long phone=Long.parseLong(request.getParameter("phone"));
DoctorRegisterBean rb=new DoctorRegisterBean();
rb.setName(name);
rb.setPassword(password);
rb.setEmail(email);
rb.setSpecialization(specialization);
rb.setPhone(phone);
HttpSession hs=request.getSession();
hs.setAttribute("bean", rb);
boolean status=false;
try {
	status=rb.registerVaildate(name, password,email,specialization,phone);
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
HttpServletResponse response = null;
if(status)
{
	response.sendRedirect("./doctor_login.html");
}
else
{
	response.sendRedirect("./doctor_register.html");
	}
	
}
}
