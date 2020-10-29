import java.util.Scanner;
class Mobilephone
{
String company;
String model;
int ram;
int storage;
String os;
int price;
float screensize;
String colour;
}
class Mainclass9
{
public static void main(String[] args) 
{
Mobilephone mp=new Mobilephone();
Scanner sc=new Scanner(System.in);
mp.company=sc.next();
mp.model=sc.next();
mp.ram=sc.nextInt();
mp.storage=sc.nextInt();
mp.os=sc.next();
mp.price=sc.nextInt();
mp.screensize=sc.nextFloat();
mp.colour=sc.next();
System.out.println("========Mobile Features========");
System.out.println("company="+mp.company);
System.out.println("model="+mp.model);
System.out.println("ram="+mp.ram);
System.out.println("storage="+mp.storage);
System.out.println("os="+mp.os);
System.out.println("price="+mp.price);
System.out.println("screensize="+mp.screensize);
System.out.println("colour="+mp.colour);
}
}