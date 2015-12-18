<%@ page import="de.phwt.tvshows.webClient.RESTClient"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to TV-Show Database</title>
</head>
<style type="text/css">	
</style>
<body background="podcast_tv_show_1400.jpg">
<h3>List of all Shows:</h3>
<%
 	RESTClient show = new RESTClient();
	out.println("<P>" + show.getList() + "</p>");
 	
%>
</body>
</html>