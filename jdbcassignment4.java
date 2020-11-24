import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcassignment4
{
public static void main(String[]args) throws ClassNotFoundException, SQLException
{
Class.forName("com.mysql.jdbc.Driver");
String url="Jdbc:mysql://localhost:3306/motivity";
String username="root";
String password="root";
Connection con=DriverManager.getConnection(url, username, password);
if(con!=null)
{
System.out.println("connection established");
}
Statement st=con.createStatement();
int x=st.executeUpdate("update customer set customerid=104 where customerid=4");
if(x!=0)
{
System.out.println("Record inserted");
}
}
}
