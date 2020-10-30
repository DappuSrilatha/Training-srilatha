abstract class Interview
{
public abstract void corejava();
public abstract void testing();
}
abstract class Attempt1 extends Interview
{
public void testing()
{
System.out.println("providing implementation for testing");
}
}
class Attempt2 extends Attempt1
{
public void corejava()
{
System.out.println("providing implementation for corejava");
}
}
class Mainclass18
{
public static void main(String[]args)
{
Attempt2 a2=new Attempt2();
a2.testing();
a2.corejava();
}
}