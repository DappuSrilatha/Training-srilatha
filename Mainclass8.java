import java.util.Scanner;
class Notebook
{
String subject;
String colour;
int price;
int noofpages;
}
class Mainclass8
{
public static void main(String[] args) 
{
Notebook nb=new Notebook();
Scanner sc=new Scanner(System.in);
nb.subject=sc.next();
nb.colour=sc.next();
nb.price=sc.nextInt();
nb.noofpages=sc.nextInt();
System.out.println("subject="+nb.subject);
System.out.println("colour="+nb.colour);
System.out.println("price="+nb.price);
System.out.println("noofpages="+nb.noofpages);
}
}