class Car
{
public void cost()
{
System.out.println("no cost");
}
public void milage()
{
System.out.println("no milage");
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
class Methodoverriding
{
public static void main(String[]args)
{
Audi a=new Audi();
a.cost();
a.milage();
}
}