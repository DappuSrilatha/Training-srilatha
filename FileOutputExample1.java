import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample1
{
public static void main(String[] args)throws FileNotFoundException
{
	try
	{
	FileOutputStream f1=new FileOutputStream("d:\\training.txt");
	String name="files";
	f1.write(name.getBytes());
	f1.close();
	}
	catch(IOException ref)
	{
	ref.printStackTrace();
	}
	}
	}