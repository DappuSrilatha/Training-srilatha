class Skypev1
{
public void audioCall()
{
System.out.println("Executing audiocall");
}
}
class Skypev2 extends Skypev1
{
public void videoCall()
{
System.out.println("Executing videocall");
}
}
class Singleinheritance
{
public static void main(String[]args)
{
Skypev2 s2=new Skypev2();
s2.audioCall();
s2.videoCall();
}
}