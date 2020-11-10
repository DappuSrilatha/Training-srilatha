import java.io.*;
public class Pro1
{  
public static void main(String args[])throws Exception
{    
CharArrayWriter out=new CharArrayWriter();    
out.write("Welcome");    
FileWriter f1=new FileWriter("d:\\training.txt");   
out.writeTo(f1);       
f1.close();       
}
}