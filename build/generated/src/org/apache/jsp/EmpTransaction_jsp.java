package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import db.dbConnector;
import java.sql.Statement;
import java.sql.ResultSet;

public final class EmpTransaction_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String empUser = (String)session.getAttribute("username");
        ResultSet rs = null;
        ResultSet rs1 = null;
        
        String empName="";
        String empAmt="";
            try
            {
                Statement st=dbConnector.getStatement();
                
                String query = "SELECT `name`,`amount` FROM emp WHERE `id`='"+empUser+"'";
                rs1 = st.executeQuery(query);
                
                if(rs1.next())
                {
                    empName = rs1.getString("name");
                    empAmt = rs1.getString("amount");
                }
                System.out.println("name "+empName);
                String query1 = "SELECT * FROM `debittrans` WHERE `from`='"+empName+"'";
                    
                rs = st.executeQuery(query1);
               
                
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>My Transaction</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"https://netdna.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/employeelist.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("        \n");
      out.write("            <h1>Transaction</h1>\n");
      out.write("            \n");
      out.write("            <table style=\"width: 100%\">\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("                <td>\n");
      out.write("                    <input style=\"pointer-events: none; max-width: 80vh;width: 40vh; border-radius: 2vh;border: none; height: 5vh;margin-right:1vh ;padding-left: 1vh;\" type=\"text\" value=\"Your Account balance : ");
      out.print(empAmt);
      out.write("\" placeholder=\"Employee Balance\" maxlength=\"15\">   \n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <form action=\"EmpAddMoneyChecker\" method=\"post\">\n");
      out.write("                        <input style=\"font-weight: bold;padding-left: 1vh; width: 35vh;margin-right: 1vh;border-radius: 2vh;box-shadow:silver ;\" placeholder=\"Add Money to your Account\" maxlength=\"5\" minlength=\"1\" type=\"text\" name=\"amt\">\n");
      out.write("                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print(empUser);
      out.write("\">\n");
      out.write("                        <input type=\"hidden\" name=\"name\" value=\"");
      out.print(empName);
      out.write("\">\n");
      out.write("                        <input style=\"width: 9vh;margin-right: 1vh;border-radius: 2vh;color: aliceblue;height: 3.5vh; border: none;background-color: rgb(0, 201, 97);\" type=\"submit\" value=\"Add\">\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("                <td><a href=\"EmployeeHome.jsp\" style=\"float: right;\"><button>Employee Home</button></a></td>\n");
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
