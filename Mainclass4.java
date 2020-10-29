class Mobilephone
{
public void screenlock(String password)
{
System.out.println("password="+password);
}
public void screenlock(int pin)
{
System.out.println("pin="+pin);
}
}
class Mainclass4
{
public static void main (String[]args)
{
Mobilephone mob=new Mobilephone();
mob.screenlock("devilatha123");
mob.screenlock(1234);
}
}

