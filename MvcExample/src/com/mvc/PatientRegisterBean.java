package com.mvc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class PatientRegisterBean 
{
private String name,password,email,specialization;
private long phone;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSpecialization() {
	return email;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone=phone;
}
public boolean patientregisterVaildate(String name,String password,String email,String specialization,long phone) throws ClassNotFoundException, SQLException
{
	Connection con=(Connection) ConnectionExample.Connectivity();
	PreparedStatement ps=con.prepareStatement("insert into patient (name,password,email,specialization,phone)values(?,?,?,?,?)");
	ps.setString(1,name);
	ps.setString(2,password);
	ps.setString(3,email);
	ps.setString(4,specialization);
	ps.setLong(5,phone);
    int x=ps.executeUpdate();
    if(x!=0) {
    	return true;
    }
    else
    {
    	return false;
    }  
}
}
