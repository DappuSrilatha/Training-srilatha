package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PatientRegisterController extends HttpServlet {
public void dopost(HttpServletRequest request,HttpServletResponse resonse) throws IOException
{
	String name=request.getParameter("name");
	String password=request.getParameter("password");
	String email=request.getParameter("email");
	String specialization=request.getParameter("specialization");
    long phone=Long.parseLong(request.getParameter("phone"));
PatientRegisterBean pb1=new PatientRegisterBean();
pb1.setName(name);
pb1.setPassword(password);
pb1.setEmail(email);
pb1.setSpecialization(specialization);
pb1.setPhone(phone);
HttpSession hs=request.getSession();
hs.setAttribute("bean", pb1);
boolean status=false;
try {
	status=pb1.patientregisterVaildate(name, password,email,specialization,phone);
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
	response.sendRedirect("./patient_login.html");
}
else
{
	response.sendRedirect("./patient_register.html");
	}
	
}
}
