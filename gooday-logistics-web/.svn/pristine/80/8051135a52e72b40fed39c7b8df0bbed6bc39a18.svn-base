package cn.gooday.logistics.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebFilter(filterName="LoginFilter",urlPatterns={"/sec/*"})
public class LoginFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,	FilterChain arg2) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpSession session = request.getSession(false);
		if(null == session){
			request.getSession().setAttribute("user","user");
		}
		arg2.doFilter(request, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
