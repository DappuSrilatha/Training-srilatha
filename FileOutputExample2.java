import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample2
{
public static void main(String[] args)throws FileNotFoundException
{
	try
	{
	FileOutputStream f1=new FileOutputStream("d:\\training.txt");
	f1.write(65);
	f1.close();
	}
	catch(IOException ref)
	{
	ref.printStackTrace();
	}
	}
	}