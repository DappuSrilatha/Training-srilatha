package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PatientLoginController extends HttpServlet {
public void dopost(HttpServletRequest request,HttpServletResponse resonse) throws IOException
{
	String email=request.getParameter("email");
	String password=request.getParameter("password");
PatientLoginBean pb=new PatientLoginBean();
pb.setEmail(email);
pb.setPassword(password);
HttpSession hs=request.getSession();
hs.setAttribute("bean", pb);
boolean status=false;
try {
	status=pb.patientloginVaildate(email, password);
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
	response.sendRedirect("./patient_home.html");
}
else
{
	response.sendRedirect("./patient_login.html");
	}
	
}
}
