package Common;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by Tarek Monjur on 11/27/2017.
 */
public class JspFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void  doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
    {
        HttpServletRequest req= (HttpServletRequest) request;
        req.getRequestDispatcher("errors/404.jsp").forward(request, response);
    }

    @Override
    public void destroy() {

    }
}
