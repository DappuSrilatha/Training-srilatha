package com.assignment;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Display 
{
public static void display() throws Exception
{
	Session se=Config.config();
	Transaction tx=se.beginTransaction();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your choice 1.Retrieve all the details 2.Retrieve single row");
int choice=sc.nextInt();
if(choice==1)
{
	Query q=se.createQuery("from Employee e");
	List<Employee> l=q.list();
	Iterator<Employee> i=l.iterator();
	while(i.hasNext()) {
		Employee e=i.next();
		System.out.println("Employee[name="+e.getName()+",dateofbirth="+e.getDateofbirth()+",department="+e.getDepartment()+",designation="+e.getDesignation()+",salary="+e.getSalary()+"]");
	}
}
	else if(choice==2)
	{
		Query q=se.createQuery("from Employee e where e.name=:x");
		String option="";
		do
		{
			System.out.println("enter name of employee to be retrieved");
			q.setParameter("x", sc.nextInt());
			List<Employee> l=q.list();
			Iterator<Employee> i=l.iterator();
			while(i.hasNext()) {
				Employee e=i.next();
				System.out.println("Employee[name="+e.getName()+",dateofbirth="+e.getDateofbirth()+",department="+e.getDepartment()+",designation="+e.getDesignation()+",salary="+e.getSalary()+"]");
			}
System.out.println("Do you want to continue(y/n:)");
option=sc.next();
		}
		while(option.equalsIgnoreCase("y"));
	}
tx.commit();
se.close();
}
}
