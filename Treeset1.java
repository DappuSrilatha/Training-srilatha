import java.util.TreeSet;
public class Treeset1 
{
	public static void main(String[] args)
	{
	TreeSet<String> t1=new TreeSet<String>();
	{
	t1.add("F");
	t1.add("H");
	t1.add("W");
	t1.add("Q");
	t1.add("P");
	t1.add("M");
	t1.add("");
	t1.add("F");
	t1.add("N");
	t1.add("S");
	t1.add("Y");
	t1.add("R");
	t1.add("C");
	System.out.println(t1);
	System.out.println(t1.headSet("P",true));
	System.out.println(t1.tailSet("P",false));
	System.out.println(t1.subSet("H",false,"S",true));
	}
	}
	}
