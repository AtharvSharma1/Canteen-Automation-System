package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<title>Canteen Management Portal</title>\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- MATERIAL DESIGN ICONIC FONT -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"fonts/material-design-iconic-font/css/material-design-iconic-font.min.css\">\n");
      out.write("\n");
      out.write("\t\t<!-- STYLE CSS -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/indexstyle.css\">\n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("\t<body>\n");
      out.write("\n");
      out.write("\t\t<div class=\"wrapper\" style=\"background-image: url('images/bg-registration-form-1.jpg');\">\n");
      out.write("\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t<div class=\"image-holder\">\n");
      out.write("\t\t\t\t\t<img src=\"images/registration-form-1.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t<table style=\"width: 100%; margin-left: 1vh;\">\n");
      out.write("\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t<div class=\"login100-form-title p-b-41\">\n");
      out.write("\t\t\t\t\t\t<h3 style=\"margin-bottom: 1vh;\">Canteen Management System</h3>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</th>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td><div class=\"login100-form-title p-b-41\">\n");
      out.write("                                                <a href=\"adminlogin.html\" style=\"text-decoration: none;\"><input type=\"button\" value=\"Admin Login\"></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td><div class=\"login100-form-title p-b-41\">\n");
      out.write("                                                <a href=\"employeelogin.html\" style=\"text-decoration: none;\"><input type=\"button\" value=\"Employee Login\"></a>\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
