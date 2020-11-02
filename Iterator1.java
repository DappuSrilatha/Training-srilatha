import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 
{
public static void main(String[] args)
{
ArrayList<Integer> a=new ArrayList<>();
{
a.add(12);
a.add(98);
a.add(67);
a.add(90);
a.add(70);
a.add(85);
a.add(56);
a.add(44);
System.out.println(a);
Iterator i=a.iterator();
while(i.hasNext()) 
{
int j=(Integer)i.next();
System.out.println(j);
}
}
}
}

