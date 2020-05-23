package stepProject6;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FilterServletAnybodyLogged implements Filter {
  @Override
  public void init(FilterConfig filterConfig) { }

  public boolean okayConditions() {
    // check cookie,

    // check parameters
    //
    return true;
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    if (okayConditions()) chain.doFilter(request, response);
    else ((HttpServletResponse)response).sendRedirect("/login");
  }

  @Override
  public void destroy() { }
}
