package com.mvc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class PatientLoginBean 
{
private String email,password;

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
public boolean patientloginVaildate(String email,String password) throws ClassNotFoundException, SQLException
{
	Connection con=(Connection) ConnectionExample.Connectivity();
	PreparedStatement ps=con.prepareStatement("select * patient where email=? and password=?");
	ps.setString(1,email);
	ps.setString(2,password);
	ResultSet rs=ps.executeQuery();
    if(rs.next()) {
    	return true;
    }
    else
    {
    	return false;
    }  
}
}
