import java.util.Scanner;
class Student
{
String studentname;
String emailid;
long mobilenumber;
float percentage;
}
class Employee
{
String employeename;
String emailid;
long mobilenumber;
int salary;
}
class Mainclass10
{
public static void main(String[] args) 
{
Student ref=new Student();
Scanner sc=new Scanner(System.in);
ref.studentname=sc.next();
ref.emailid=sc.next();
ref.mobilenumber=sc.nextLong();
ref.percentage=sc.nextFloat();
System.out.println("========Student Details========");
System.out.println("studentname="+ref.studentname);
System.out.println("emailid="+ref.emailid);
System.out.println("mobilenumber="+ref.mobilenumber);
System.out.println("percentage="+ref.percentage);
Employee res=new Employee();
res.employeename=sc.next();
res.emailid=sc.next();
res.mobilenumber=sc.nextLong();
res.salary=sc.nextInt();
System.out.println("========Employee Details========");
System.out.println("employeename="+res.employeename);
System.out.println("emailid="+res.emailid);
System.out.println("mobilenumber="+res.mobilenumber);
System.out.println("salary="+res.salary);
}
}