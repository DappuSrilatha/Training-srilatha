package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class logic 
{
public static void main(String[] args) 
{
Configuration cf=new Configuration();
cf.configure("configuration.xml");
SessionFactory sf=cf.buildSessionFactory();
Session se=sf.openSession();
Student mamatha=new Student();
mamatha.setId(1021);
mamatha.setMarks(500);
mamatha.setName("mamatha reddy");
Transaction tx=se.beginTransaction();
se.save(mamatha);
tx.commit();
se.close();
sf.close();
}
}
