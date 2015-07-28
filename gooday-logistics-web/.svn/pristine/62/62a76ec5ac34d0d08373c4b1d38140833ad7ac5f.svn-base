package cn.gooday.logistics.web.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class HtmlCharacterFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		Map<String, String[]> params = req.getParameterMap();
		if (params != null && !params.isEmpty()) {
			for (Iterator<String> it = params.keySet().iterator(); it.hasNext();) {
				String[] values = params.get(it.next());
				for (int i = 0; i < values.length; i++) {
					values[i] = values[i].replaceAll("<", "&lt;");
					values[i] = values[i].replaceAll(">", "&gt;");
					values[i] = values[i].replaceAll("&", "&amp;");
					values[i] = values[i].replaceAll("\"", "&quot;");
					values[i] = values[i].replaceAll("'", "&apos;");
				}
			}
		}
		chain.doFilter(new ParameterRequestWrapper(req, params), response);
	}

	@Override
	public void destroy() {
	}

}
