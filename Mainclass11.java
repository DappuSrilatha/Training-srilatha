class Restuarant
{
void menu()
{
System.out.println("1.Idly,2.Dosa,3.Poori,4.Wada");
}
void takeOrder(String order)
{
System.out.println("order given is "+order);
}
String serveFood()
{
return "Dosa";
}
int giveBill()
{
return 500;
}
String payBill(int amount)
{
System.out.println("Amount given is"+amount);
return "paid";
}
}
class Mainclass11
{
public static void main(String args[])
{
Restuarant res=new Restuarant();
res.menu();
res.takeOrder("Dosa");
System.out.println("Food served is"+res.serveFood());
System.out.println("Bill is"+res.giveBill());
System.out.println("Bill"+res.payBill(500));
}
}
