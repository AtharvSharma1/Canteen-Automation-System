package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import db.dbConnector;
import java.sql.Statement;
import java.sql.ResultSet;

public final class EmpAdminTransaction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

        ResultSet rs = null;
        
            try
            {
                Statement st=dbConnector.getStatement();
                
                String query1 = "SELECT * FROM `debittrans`";
                    
                rs = st.executeQuery(query1);
               
                
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Employee Transaction</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"https://netdna.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/employeelist.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("        \n");
      out.write("            <h1>Employee Transaction</h1>\n");
      out.write("            \n");
      out.write("            <table style=\"width: 100%\">\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("                \n");
      out.write("                <td><a href=\"AdminHome.jsp\" style=\"float: right;\"><button>Admin Home</button></a></td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("        <table style=\"margin-top: 5vh;\" class=\"table user-list\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        <span>Type</span>\n");
      out.write("                    </th>\n");
      out.write("                   <th>\n");
      out.write("                        <span>From</span>\n");
      out.write("                    </th>\n");
      out.write("                   \n");
      out.write("                    <th>\n");
      out.write("                        <span>Amount</span>\n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                        <span>to</span>\n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                        <span>Purchased</span>\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    while(rs.next())
                    {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <span class=\"user-link\">");
      out.print(rs.getString("type"));
      out.write("</span>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <span class=\"user-link\">");
      out.print(rs.getString("from"));
      out.write("</span>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <span class=\"user-link\">");
      out.print(rs.getString("Amount"));
      out.write("</span>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <span class=\"user-link\">");
      out.print(rs.getString("to"));
      out.write("</span>\n");
      out.write("                    </td>    \n");
      out.write("                    <td>\n");
      out.write("                        <span class=\"user-link\">");
      out.print(rs.getString("purchased"));
      out.write("</span>\n");
      out.write("                    </td>   \n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("            ");
  
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }


      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script data-cfasync=\"false\" src=\"/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js\"></script><script src=\"https://code.jquery.com/jquery-1.10.2.min.js\"></script>\n");
      out.write("        <script src=\"https://netdna.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
