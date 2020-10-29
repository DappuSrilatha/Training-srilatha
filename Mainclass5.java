class Pen
{
String type;
String colour;
int price;
Pen()
{
type="Ballpen";
colour="Blue";
price=25;
}
}
class Mainclass5
{
public static void main(String[]args)
{
Pen p1=new Pen();
System.out.println("type="+p1.type);
System.out.println("colour="+p1.colour);
System.out.println("price="+p1.price);
Pen p2=new Pen();
System.out.println("type="+p2.type);
System.out.println("colour="+p2.colour);
System.out.println("price="+p2.price);
}
}