class Mainclass
{
String company="Realme";
String model="RMX2001";
int ram=4;
int storage=64;
String os="Android 10";
int price=14000;
float screensize=16.5f;
String colour="White";
}
class Mobilephone
{
public static void main(String[] args) 
{
Mainclass ref=new Mainclass();
System.out.println("========Mobile Features========");
System.out.println("company="+ref.company);
System.out.println("model="+ref.model);
System.out.println("ram="+ref.ram);
System.out.println("storage="+ref.storage);
System.out.println("os="+ref.os);
System.out.println("price="+ref.price);
System.out.println("screensize="+ref.screensize);
System.out.println("colour="+ref.colour);
}
}