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
<%@page import="com.mvc.DoctorLoginBean" %>
<%
	DoctorLoginBean lb=(DoctorLoginBean)session.getAttribute("bean");
%>
<%=lb.getEmail()%>
</body>
</html>