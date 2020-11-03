class University
{
void announcement()
{
System.out.println("Semester exams are from december");
Department ece=new Department();
ece.examPapers();
}
class Department
{
void examPapers()
{
System.out.println("exam papers are being prepared");
}
}
}
class Nestedclass3
{
public static void main(String args[])
{
University jntu=new University();
jntu.announcement();
}
}