<%@ page import="de.phwt.tvshows.web.ShowRepository"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Shows</title>
</head>
<body>
<h3>List of all Shows:</h3>
	<%
	ShowRepository show = new ShowRepository();
	for (int i = 0; i < show.getShows().size(); i++) 
	{
 		out.println("<P>" + i + ". " + show.getShows().get(i).getName() + "</p>");
 	}
	
	%>
	<p> <a href='/phwt-tvshows-web/'>zur&uuml;ck</a> </p>
</body>
</html>