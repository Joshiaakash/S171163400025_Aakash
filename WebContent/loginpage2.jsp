<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello!!! You have successfully logged in...!!!</h1>


<TABLE class="table">
<tr>
	<th>Category ID</th>
	<th>Name </th>
	<th>Description</th>
	<th>Price</th>
</tr>
<%@ page import="java.util.ArrayList" %>
<%@ page import="MYCarsservlet.model.*"%>
<%@ page import="MYCars.*" %>
<%
			MYCarsdb objdb=new MYCarsdb();
			ArrayList<MYCars> getlist=objdb.getAll();
%>
<center>
	<h1>Car Details</h1>
	<table border=1><thead><tr>
		<th colspan=5 rowspan=5>Company</th>
		<th colspan=5 rowspan=5>Category ID</th>
		<th colspan=5 rowspan=5>Type</th>
		<th colspan=5 rowspan=5>Price</th>
		<th colspan=5 rowspan=5>Discount in %</th>
		</tr></thread>
<% 
		for( int i=0; i<getlist.size();i++)
			{
				out.println("<tbody><tr><td colspan=5 rowspan=5>" + getlist.get(i).getCompany()+"</td>");
				out.println("<td colspan=5 rowspan=5>" + getlist.get(i).getCategory_id()+"</td>");
				out.println("<td colspan=5 rowspan=5>" + getlist.get(i).getDesc1()+"</td>");
				out.println("<td colspan=5 rowspan=5>" + getlist.get(i).getPrice()+"</td>");
				out.println("<td colspan=5 rowspan=5>" + getlist.get(i).getDiscount()+"</td>");
				
				out.println("</tr><br>");
				
			}
%>
</table>
<form method="post" action="editservlet">

  Company : <input type="text" name="Company"/>
  CategoryID : <input type="text" name="CategoryID"/>
  Description : <input type="text" name="Description"/>
  Price : <input type="text" name="Price"/>
  Discount : <input type="text" name="Discount"/><br>
  What action you want to take?<br>
  <input type="radio" name="choice" value="add" id="Add">Add<br>
  <input type="radio" name="choice" value="update" id="Update">Update<br>
  <input type="radio" name="choice" value="delete" id="Delete">Delete<br>
  <input type="submit" name="submit"> 
</form>



</body>
</html>