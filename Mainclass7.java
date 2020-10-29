class Employee
{
String employeename;
int employeeid;
int salary;
Employee(String employeename,int employeeid,int salary)
{
this.employeename=employeename;
this.employeeid=employeeid;
this.salary=salary;
}
}
class Mainclass7
{
public static void main(String[]args)
{
Employee e1=new Employee("latha",2020,50000);
System.out.println("employeename="+e1.employeename);
System.out.println("employeeid="+e1.employeeid);
System.out.println("salary="+e1.salary);
Employee e2=new Employee("pushpa",2021,55000);
System.out.println("employeename="+e2.employeename);
System.out.println("employeeid="+e2.employeeid);
System.out.println("salary="+e2.salary);
}
}

