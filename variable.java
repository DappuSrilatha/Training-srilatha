class Student
{
String studentname;
String fathername;
String address;
String emailid;
long mobilenumber;
String branch;
float percentage;
String college;
}
class Employee
{
String employeename;
String address;
String emailid;
long mobilenumber;
int salary;
String companyname;
}
class variable
{
public static void main(String[] args) 
{
Student ref=new Student();
ref.studentname="mamatha";
ref.fathername="srinivas";
ref.address="h.no.667,bharathi nagar,hyd-32";
ref.emailid="mamatha123@gmail.com";
ref.mobilenumber=9987000124L;
ref.branch="ECE";
ref.percentage=89.1f;
ref.college="BVRIT HYDERABAD";
System.out.println("========Student Details========");
System.out.println("studentname="+ref.studentname);
System.out.println("fathername="+ref.fathername);
System.out.println("address="+ref.address);
System.out.println("emailid="+ref.emailid);
System.out.println("mobilenumber="+ref.mobilenumber);
System.out.println("branch="+ref.branch);
System.out.println("percentage="+ref.percentage);
System.out.println("college="+ref.college);
Employee res=new Employee();
res.employeename="latha";
res.address="h.no.990,srinivas nagar,hyd-30";
res.emailid="latha345@gmail.com";
res.mobilenumber=9845678098L;
res.salary=25000;
res.companyname="tcs";
System.out.println("========Employee Details========");
System.out.println("employeename="+res.employeename);
System.out.println("address="+res.address);
System.out.println("emailid="+res.emailid);
System.out.println("mobilenumber="+res.mobilenumber);
System.out.println("salary="+res.salary);
System.out.println("companyname="+res.companyname);
}
}