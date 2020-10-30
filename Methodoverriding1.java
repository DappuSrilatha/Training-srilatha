class Gmailv1
{
public void composeMessage()
{
System.out.println("full screen implementation");
}
}
class Gmailv2 extends Gmailv1
{
public void composeMessage()
{
System.out.println("popup screen implementation");
}
}
class Methodoverriding1
{
public static void main(String[]args)
{
Gmailv2 ref=new Gmailv2();
ref.composeMessage();
}
}
