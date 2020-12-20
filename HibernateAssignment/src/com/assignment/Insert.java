package com.assignment;

import java.io.Serializable;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Insert 
{
	
	public static void insert() throws Exception
	{
		Session se=Config.config();
		Scanner sc=new Scanner(System.in);
		String choice="";
		do
		{
			Transaction tx=se.beginTransaction();
Employee e=new Employee();
System.out.println("enter employee name: ");
e.setName(sc.next());
System.out.println("enter employee dateofbirth: ");
e.setDateofbirth(sc.next());
System.out.println("enter employee department: ");
e.setDepartment(sc.next());
System.out.println("enter employee designation: ");
e.setDesignation(sc.next());
System.out.println("enter employee salary: ");
e.setSalary(sc.nextDouble());
Serializable s=se.save(e);
tx.commit();
if(s.hashCode()>0)
{
	System.out.println("Record inserted");
}
System.out.println("Do you want to continue(y/n): ");
	choice=sc.next();
		}
		while(choice.equalsIgnoreCase("y"));
	se.close();
		}
}
