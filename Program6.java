import java.util.*;
class Program6
{
public static void main(String[]args)
{
try
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int[] ar=new int[5];
ar[a]=67;
System.out.println(ar[a]);
}
catch(ArrayIndexOutOfBoundsException ref)
{
System.out.println("array index exception");
}
catch(InputMismatchException ref)
{
System.out.println("input mismatch exception");
}
catch(Exception ref)
{
System.out.println("exception");
}
}
}