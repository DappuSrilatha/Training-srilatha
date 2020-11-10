import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample 
{
public static void main(String[] args)throws FileNotFoundException
{
	try
	{
	FileOutputStream f1=new FileOutputStream("d:\\training.txt");
	BufferedOutputStream b1=new BufferedOutputStream(f1);
	String name="files concept";
	b1.write(name.getBytes());
	b1.close();
	}
	catch(IOException ref)
	{
	ref.printStackTrace();
	}
	}
	}
