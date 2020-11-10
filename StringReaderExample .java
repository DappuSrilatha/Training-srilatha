import java.io.StringReader;  
public class StringReaderExample 
{  
public static void main(String[] args) throws Exception 
{  
String s = "Hearty Welcome"; 
StringReader reader = new StringReader(s);  
int k=0;  
while((k=reader.read())!=-1)
{  
System.out.print((char)k);             
}
}
} 
