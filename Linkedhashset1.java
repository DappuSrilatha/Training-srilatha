import java.util.LinkedHashSet;

public class Linkedhashset1 
{
	public static void main(String[] args)
	{
	LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
	{
	lh.add(12);
	lh.add(11);
	lh.add(78);
	lh.add(90);
	System.out.println(lh);
	LinkedHashSet<Integer> lh1=new LinkedHashSet<Integer>();
	lh1.addAll(lh);
	lh1.add(70);
	lh1.add(23);
	lh1.add(56);
	lh1.add(80);
	System.out.println(lh1);
	}
	}
}
