package com.assignment;

import java.util.Scanner;

public class outcome 
{
public static void main(String[] args) throws Exception
{
Scanner sc=new Scanner(System.in);
int choice=0;
System.out.println("select your option 1.Insert 2.Display 3.Update");
choice=sc.nextInt();
if(choice==1)
{
	Insert.insert();
}
else if(choice==2)
{
	Display.display();
}
else if(choice==3)
{
	Update.update();
}
}
}
