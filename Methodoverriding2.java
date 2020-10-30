class Whatsappv1
{
public void readMessage()
{
System.out.println("black double ticks");
}
}
class Whatsappv2 extends Whatsappv1
{
public void readMessage()
{
System.out.println("blue double ticks");
}
}
class Methodoverriding2
{
public static void main(String[]args)
{
Whatsappv2 ref=new Whatsappv2();
ref.readMessage();
}
}
