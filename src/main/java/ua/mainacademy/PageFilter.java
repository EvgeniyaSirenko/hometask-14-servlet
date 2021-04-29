package ua.mainacademy;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class PageFilter implements Filter {
	public PageFilter() {
		System.out.println("Filter PageFilter()");
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Filter init()");
	}

	public void doFilter(ServletRequest request, ServletResponse responce, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Filter --->>> before doFilter()");
		chain.doFilter(request, responce);
		System.out.println("Filter <<<--- after doFilter()");

	}
}
