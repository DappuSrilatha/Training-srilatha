import java.io.*;  
public class StringWriterExample
{  
public static void main(String[] args) throws IOException 
{  
char[] ar = new char[500];  
StringWriter writer = new StringWriter();  
FileInputStream input = new FileInputStream("d:\\training.txt"); 
BufferedReader buffer = new BufferedReader(new InputStreamReader(input, "UTF-8")); 
int x;  
while ((x = buffer.read(ar)) != -1) 
{  
writer.write(ar, 0, x);  
}  
System.out.println(writer.toString());        
writer.close();  
buffer.close();  
}  
}