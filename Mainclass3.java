class Instagramlogin
{
public void login(String emailid,String password)
{
System.out.println("emailid="+emailid);
System.out.println("password="+password);
}
public void login(long phoneno,String password)
{
System.out.println("phoneno="+phoneno);
System.out.println("password="+password);
}
}
class Mainclass3
{
public static void main (String[]args)
{
Instagramlogin insta=new Instagramlogin();
insta.login("srilathadappu@gmail.com","sri123456");
insta.login(9000456716L,"sri123456");
}
}

