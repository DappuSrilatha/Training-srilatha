class Multispeciality
{
void appointment()
{
System.out.println("First take the appointment");
}
class Dermatology
{
void checkup()
{
System.out.println("checkup has been done");
}
void bill()
{
System.out.println("pay the bill before leaving the hospital");
}
}
}
class Nestedclass4
{
public static void main(String args[])
{
Multispeciality ms=new Multispeciality();
ms.appointment();
Multispeciality.Dermatology md=new Multispeciality().new Dermatology();
md.checkup();
md.bill();
}
}