class Carbooking
{
public void cars()
{
System.out.println("mini","prime","share");
}
public void bookCar(String order)
{
System.out.println("order given="+order);
}
public void payBill(int amount)
{
System.out.println("Amount given is"+amount);
}
}
class Person
{
public static void main (String args[])
{
Carbooking ref=new Carbooking();
ref.cars();
ref.bookCar("share");
ref.payBill(100);
}
}
