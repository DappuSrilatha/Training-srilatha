import java.util.LinkedList;

public class Array
{
public static void main(String[] args)
{
LinkedList<Integer> l=new LinkedList<Integer>();
{
l.add(2);
l.add(6);
l.add(8);
l.add(10);
l.add(12);
l.add(14);
l.add(10);
System.out.println(l);
for(int i=0;i<l.size();i++)
{
for(int j=i+1;j<l.size();j++)
{
if(l.get(i)==l.get(j))
{
System.out.println(l.get(i));
}
}
}
}
}
}