import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class Treemap1
{
public static void main(String[] args)
{
TreeMap<Integer,String> tm=new TreeMap<>();
{
tm.put(2020,"latha");
tm.put(2021,"kamala");
tm.put(2022,"harish");
tm.put(2023,"vamsi");
tm.put(2024,"mamatha");
tm.put(2025,"swathi");
System.out.println(tm);
Set<Map.Entry<Integer,String>> s=tm.entrySet();
for(Map.Entry<Integer,String> x:s)
{
System.out.println(x.getKey()+" "+x.getValue()); 
}
}
}
}
