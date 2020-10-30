interface Vehicle
{
void cost();
void milage();
}
abstract class Car implements Vehicle
{
public void viper()
{
System.out.println("vipes");
}
}
class Audi extends Car
{
public void cost()
{
System.out.println("50lakhs");
}
public void milage()
{
System.out.println("10km");
}
}
class BMW extends Car
{
public void cost()
{
System.out.println("40lakhs");
}
public void milage()
{
System.out.println("15km");
}
}
abstract class Bike implements Vehicle
{
public void stand()
{
System.out.println("stand");
}
}
class FZ extends Bike
{
public void cost()
{
System.out.println("1 lakh");
}
public void milage()
{
System.out.println("6km");
}
}
class Apache extends Bike
{
public void cost()
{
System.out.println("1.5 lakhs");
}
public void milage()
{
System.out.println("8km");
}
}
class Mainclass17
{
public static void main(String[]args)
{
Apache a=new Apache();
a.cost();
a.milage();
}
}