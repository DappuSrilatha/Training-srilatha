package com.assignment;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Update 
{
	public static void update() throws Exception
	{
		Session se=Config.config();
		Scanner sc=new Scanner(System.in);
		int choice=0,a=0;
		String option ="";
		do
		{
			Transaction tx=se.beginTransaction();
System.out.println("select your option 1.update name 2.update dateofbirth 3.update department 4.update designation 5.salary");
choice=sc.nextInt();
if(choice==1)
{
	Query q=se.createQuery("update Employee e set e.name=:x where e.name=:y");
System.out.println("enter new name");
q.setParameter("x",sc.next());
System.out.println("enter the name to which name to be updated:");
q.setParameter("y",sc.next());
a=q.executeUpdate();
if(a==1)
System.out.println("Record updated");
}
else if(choice==2)
{
	Query q=se.createQuery("update Employee e set e.dateofbirth=:x where e.name=:y");
	System.out.println("enter new dateofbirth");
	q.setParameter("x",sc.next());
	System.out.println("enter the name to which dateofbirth to be updated:");
	q.setParameter("y",sc.next());	
	a=q.executeUpdate();
	if(a==1)
	System.out.println("Record updated");
	}
else if(choice==3)
{
	Query q=se.createQuery("update Employee e set e.department=:x where e.name=:y");
	System.out.println("enter new department");
	q.setParameter("x",sc.next());
	System.out.println("enter the name to which department to be updated:");
	q.setParameter("y",sc.next());	
	a=q.executeUpdate();
	if(a==1)
	System.out.println("Record updated");
	}
else if(choice==4)
{
	Query q=se.createQuery("update Employee e set e.designation=:x where e.name=:y");
	System.out.println("enter new designation");
	q.setParameter("x",sc.next());
	System.out.println("enter the name to which designation to be updated:");
	q.setParameter("y",sc.next());	
	a=q.executeUpdate();
	if(a==1)
	System.out.println("Record updated");
	}
else if(choice==5)
{
	Query q=se.createQuery("update Employee e set e.salary=:x where e.name=:y");
	System.out.println("enter new salary");
	q.setParameter("x",sc.nextDouble());
	System.out.println("enter the name to which dateofbirth to be updated:");
	q.setParameter("y",sc.next());	
	a=q.executeUpdate();
	if(a==1)
	System.out.println("Record updated");
	}
tx.commit();
System.out.println("Do you want to continue(y/n:)");
option=sc.next();
		}
		while(option.equalsIgnoreCase("y"));
	se.close();
	}
}
