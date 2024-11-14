package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import db.dbConnector;
import java.sql.Statement;
import java.sql.ResultSet;

public final class Menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
//        if(session.equals(true))
//        {
            try{

                Statement st=dbConnector.getStatement();
                String query = "SELECT * FROM menu;";

                rs = st.executeQuery(query);
                
                
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Menu</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"https://netdna.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/menu.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"\n");
      out.write("      integrity=\"sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("      referrerpolicy=\"no-referrer\"\n");
      out.write("    />\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/IOTDM.css\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <section class=\"showcase-area\" id=\"showcase\">\n");
      out.write("      <div class=\"showcase-container\">\n");
      out.write("          \n");
      out.write("            <h1 class=\"main-title\" id=\"home\">Canteen Management System</h1>\n");
      out.write("            <table style=\"width: 100%\">\n");
      out.write("            <tr>\n");
      out.write("                <td><a href=\"AddItem.html\"><button>Add Item</button></a></td>\n");
      out.write("                <td><a href=\"AdminHome.jsp\" style=\"float: right;\"><button>Admin Home</button></a></td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        \n");
      out.write("            <h1>Menu</h1>\n");
      out.write("        <table style=\"margin-top: 5vh;\" class=\"table user-list\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        <span><b>Item Id</b></span>\n");
      out.write("                    </th>\n");
      out.write("                    \n");
      out.write("                    <th>\n");
      out.write("                        <span><b>Name</b></span>\n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                        <span><b>Type</b></span>\n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                        <span><b>Category</b></span>\n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                        <span><b>Quantity</b></span>\n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                        <span><b>Price</b></span>\n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                        <span><b>Delete Item</b></span>\n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                        <span><b>Update Item</b></span>\n");
      out.write("                    </th>\n");
      out.write("                    \n");
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
      out.print(rs.getString("ItemId"));
      out.write("</span>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <span class=\"user-link\">");
      out.print(rs.getString("Name"));
      out.write("</span>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <span class=\"user-link\">");
      out.print(rs.getString("Type"));
      out.write("</span>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <span class=\"user-link\">");
      out.print(rs.getString("Category"));
      out.write("</span>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <span class=\"user-link\">");
      out.print(rs.getString("Quantity"));
      out.write("</span>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <span class=\"user-link\">");
      out.print(rs.getString("Price"));
      out.write("</span>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <form action=\"DeleteItemChecker\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print(rs.getString("ItemId"));
      out.write("\">\n");
      out.write("                        <input style=\"width: 9vh;border-radius: 2vh;color: aliceblue;height: 3.5vh; border: none;background-color: rgb(0, 201, 97);\" value=\"Delete\" type=\"submit\">\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                    <td style=\"width: 20%;\">\n");
      out.write("                        <form action=\"UpdateItem.jsp\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print(rs.getString("ItemId"));
      out.write("\">\n");
      out.write("                        <input style=\"width: 9vh;margin-right: 1vh;border-radius: 2vh;color: aliceblue;height: 3.5vh; border: none;background-color: rgb(0, 201, 97);\" value=\"Update\" type=\"submit\">\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        ");

                }
            catch(SQLException e)
            {
                System.out.println(e);
            }

      out.write("\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("        <script data-cfasync=\"false\" src=\"/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js\"></script><script src=\"https://code.jquery.com/jquery-1.10.2.min.js\"></script>\n");
      out.write("        <script src=\"https://netdna.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
