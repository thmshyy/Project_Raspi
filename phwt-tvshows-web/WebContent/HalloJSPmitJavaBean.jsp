<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="de.phwt.tvshows.web.MeineJavaBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>HalloJSPmitJavaBean</title>
  </head>
  <body>
    <h3> Hallo, meine JSP-Seite mit JavaBean meldet sich. </h3>
    <%
      MeineJavaBean jb = new MeineJavaBean();
      out.println( "<p>" + jb.getDateString() + "</p>" );
    %>
    <p> <a href='/phwt-tvshows-web/'>zur&uuml;ck</a> </p>
  </body>
</html>