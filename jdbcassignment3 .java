import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcassignment3 
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
int x=st.executeUpdate("Delete from customer where name="sri");
if(x!=0)
{
System.out.println("Record inserted");
}
}
}
