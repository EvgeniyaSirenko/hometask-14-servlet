package ua.mainacademy;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(urlPatterns = {"/run"}, initParams = {@WebInitParam(name = "active", value = "true")})
public class PageFilter implements Filter {
	FilterConfig config;
	public PageFilter() {
		System.out.println("Filter PageFilter()");
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Filter init()");
		config = filterConfig;
	}

	public void doFilter(ServletRequest request, ServletResponse responce, FilterChain chain)
			throws IOException, ServletException {
		if (config.getInitParameter("active").equalsIgnoreCase("true")) {
			System.out.println("Filter sets an attribute.");
			config.getServletContext().setAttribute("Attribute", "value");
		}
		System.out.println("Filter --->>> before doFilter()");
		chain.doFilter(request, responce);
		System.out.println("Filter <<<--- after doFilter()");

	}
}
