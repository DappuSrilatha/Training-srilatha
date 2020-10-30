interface Motivitylabs
{
void testing();
}
interface Qapitolqa
{
void testing();
}
class Student implements Motivitylabs,Qapitolqa
{
public void testing()
{
System.out.println("testing....");
}
}
class Mainclass16
{
public static void main(String[]args)
{
Student st=new Student();
st.testing();
}
}