class University
{
static class Department
{
void announcement()
{
System.out.println("ECE results are been declared");
}
static void result()
{
System.out.println("please check in the website");
}
}
}
class Nestedclass2
{
public static void main(String args[])
{
University.Department ece=new University.Department();
ece.announcement();
University.Department.result();
}
}