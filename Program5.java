class Program5
{
public static void main(String[]args)
{
try
{
System.out.println("entering the try block");
int a=1/0;
System.out.println("exiting the try block");
}
catch(ArithmeticException ref)
{
System.out.println("entering the catch block");
System.out.println("exception handling");
System.out.println("exiting the catch block");
}
}
}
