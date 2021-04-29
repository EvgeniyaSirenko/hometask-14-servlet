package ua.mainacademy;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "run")
public class AppRunner extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AppRunner() {
		System.out.println("Servlet Apprunner()");
	}

	public void init() throws ServletException {
		System.out.println("Servlet init()");

		super.init();
	}

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet service()");
		super.service(req, resp);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("AppRunner#doGet()");
		getServletContext().getRequestDispatcher("/help").include(req, resp);
		// forward instead of include will flash response!
		System.out.println(getServletContext().getAttribute("Attribute"));
		resp.getWriter().append("Hello, ").append(req.getParameter("name"));
		//resp.sendRedirect("help"); redirects to /help
	}
}
