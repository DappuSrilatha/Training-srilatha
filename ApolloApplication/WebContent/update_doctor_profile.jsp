<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO DOCTOR HOME</h1></center>
<br><br><br>
<a href="doctor_home.html">Home</a>
<a href="doctor_profile.jsp">Profile</a>
<a href="index.html">Logout</a>
<br><br><br>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/Apollo";
String username="root";
String password="root";
con=DriverManager.getConnection(url,username,password);
int id=Integer.parseInt(request.getParameter("id"));
ps=con.prepareStatement("select * from doctor where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
if(rs.next()){
%>
<form action="./doctor_profile_update.jsp" align="center">
<input type="hidden"name=id" value=<%=rs.getId("id")%>">
<input type="text"name="name" value=<%=rs.getString("name")%>">
<input type="email"name="email" value=<%=rs.getString("email")%>">
<input type="number"name="phone" value=<%=rs.getString("phone")%>">
<select name="specialization">
<option value="<%=rs.getString("specialization")%>"><%=rs.getString("specialization") %></option>
<option value="DENSTIST">DENSTIST</option>
<option value="ENT">ENT</option>
<option value="CARDIOLOGIST">CARDIOLOGIST</option>
</select>
<input type="submit" value="update">
</form>