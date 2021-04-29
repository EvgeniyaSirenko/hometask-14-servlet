package ua.mainacademy;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "run")
public class AppRunner extends HttpServlet {

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
		System.out.println("Servlet doGet()");
		resp.getWriter().append("Hello, ").append(req.getParameter("name"));
	}
}
