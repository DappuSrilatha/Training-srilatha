import java.util.Vector;
import java.util.Enumeration;

public class Enumeration1
{
public static void main(String[] args)
{
Vector<Integer> v=new Vector<Integer>();
{
v.add(12);
v.add(11);
v.add(78);
v.add(90);
v.add(70);
v.add(23);
v.add(56);
v.add(80);
System.out.println(v);
Enumeration<Integer> e=v.elements();
while(e.hasMoreElements())
{
System.out.println(e.nextElement());
}
}
}	
}
