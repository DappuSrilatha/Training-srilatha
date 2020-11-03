abstract class Person
{
abstract void eat();
}
class Nestedclass1
{
public static void main(String[]args)
{
Person p1=new Person(){
void eat()
{
System.out.println("Eating cake");
}
};
p1.eat();
}
}
