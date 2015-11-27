package de.phwt.tvshows.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class ShowList extends HttpServlet
{
	//private ShowRepository ShowRepo;

	@Override
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response)
			throws ServletException, IOException
	{
		request.setAttribute("shows", new ShowRepository().getShows());
		getServletContext().getRequestDispatcher("/phwt-tvshows-web/WebContent/index.jsp").forward(request, response);
	}
}