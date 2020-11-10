import java.io.CharArrayReader;  
public class CharArrayExample
{  
public static void main(String[] args) throws Exception 
{  
char[] a = {'j', 'a', 'v', 'a'};  
CharArrayReader reader = new CharArrayReader(a);  
int k = 0;  
while ((k = reader.read()) != -1) 
{  
char ch = (char) k;  
System.out.print(ch);  
System.out.println(k);  
}  
}  
}  