abstract class Car
{
abstract void cost();
abstract void milage();
}
class Nestedclass
{
public static void main(String[]args)
{
Car x=new Car(){
void cost()
{
System.out.println("audi cost is 50lakhs");
}
void milage()
{
System.out.println("audi milage is 15km");
}
};
x.cost();
x.milage();
}
}
