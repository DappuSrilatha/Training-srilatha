abstract class Car
{
abstract void cost();
abstract void milage();
public void start()
{
System.out.println("starts with a key");
}
Car()
{
System.out.println("Executing constructor");
}
}
class Audi extends Car
{
public void cost()
{
System.out.println("Audi cost is 50lakhs");
}
public void milage()
{
System.out.println("Audi milage is 10km");
}
}
class BMW extends Car
{
public void cost()
{
System.out.println("BMW cost is 40lakhs");
}
public void milage()
{
System.out.println("BMW milage is 15km");
}
}
class Mainclass14
{
public static void main(String[]args)
{
BMW b=new BMW();
b.cost();
b.milage();
Audi a=new Audi();
a.cost();
a.milage();
}
}
