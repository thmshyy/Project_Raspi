package de.phwt.tvshows.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShowListServlet")
public class ShowListServlet extends HttpServlet
{

	static final long serialVersionUID = 1L;

	@Override
	public void doGet(final HttpServletRequest requ, final HttpServletResponse resp)
			throws ServletException, IOException
	{
		resp.setContentType("text/html");
		final PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<h3> Hallo, mein erstes Servlet meldet sich </h3>");
		out.println("<a href='/phwt-tvshows-web/'>zur&uuml;ck</a>");
		out.println("</html>");
		out.close();
	}
}