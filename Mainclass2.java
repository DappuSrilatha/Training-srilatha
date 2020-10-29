class Restuarant
{
public void takeOrder(String order1,String order2)
{
System.out.println("order given is "+order1);
System.out.println("order given is "+order2);
}
public void takeOrder(String order3,String order4,String order5)
{
System.out.println("order given is "+order3);
System.out.println("order given is "+order4);
System.out.println("order given is "+order5);
}
}
class Mainclass2
{
public static void main (String[]args)
{
Restuarant res=new Restuarant();
res.takeOrder("Idly","Dosa");
res.takeOrder("Egg rice","Veg rice","Biryani");
}
}

