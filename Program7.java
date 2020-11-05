class Program7
{
public static void main(String[]args)
{
int a=10,b=0;
try
{
System.out.println("statement 1");
System.out.println("statement 2 and div="+(a/b));
}
catch(ArithmeticException ref)
{
ref.printStackTrace();
}
System.out.println("statement 2");
System.out.println("statement 3");
}
}