interface Kitebird
{
void fly();
}
interface Ostrichbird
{
void walk();
}
class Peacockbird implements Kitebird,Ostrichbird
{
public void fly()
{
System.out.println("can fly");
}
public void walk()
{
System.out.println("can walk");
}
}
class Mainclass15
{
public static void main(String[]args)
{
Peacockbird pb=new Peacockbird();
pb.fly();
pb.walk();
}
}