import java.io.FileInputStream;
import java.io.IOException;

public class FileInputExample
{
public static void main(String[] args)throws IOException
{
FileInputStream f=new FileInputStream("d:\\training.txt");
int i=f.read();
System.out.println(i);
System.out.println((char)i);
}
}   