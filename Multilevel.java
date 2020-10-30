class Exam1
{
public void firstYearExam()
{
System.out.println("passed firstyear");
}
}
class Exam2 extends Exam1
{
public void secondYearExam()
{
System.out.println("passed secondyear");
}
}
class Exam3 extends Exam2
{
public void thirdYearExam()
{
System.out.println("passed thirdyear");
}
}
class Exam4 extends Exam3
{
public void finalYearExam()
{
System.out.println("passed finalyear");
}
}
class Finalresult extends Exam4
{
public void result()
{
System.out.println("first class with destinction");
}
}
class Multilevel
{
public static void main(String[]args)
{
Finalresult fr=new Finalresult();
fr.firstYearExam();
fr.secondYearExam();
fr.thirdYearExam();
fr.finalYearExam();
fr.result();
}
}
