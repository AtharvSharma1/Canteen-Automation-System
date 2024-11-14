package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import db.dbConnector;
import java.sql.Statement;
import java.sql.ResultSet;

public final class UpdateItem_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");

    String id = request.getParameter("id");
    ResultSet rs = null;
    System.out.println(id);
    try{

        Statement st=dbConnector.getStatement();
        String query = "SELECT * FROM menu WHERE ItemId='"+id+"';";

        rs = st.executeQuery(query);

        
      out.write("\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/addemployeestyle.css\">\n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("   </head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"title\">Update Item</div>\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <form action=\"UpdateItemChecler\" method=\"post\">\n");
      out.write("        <div class=\"user-details\">\n");
      out.write("            ");

                if(rs.next())
          {
          
      out.write("\n");
      out.write("          <div class=\"input-box\">\n");
      out.write("            <span class=\"details\">Food Item</span>\n");
      out.write("            <input style=\"pointer-events: none;\" type=\"text\" value=\"");
      out.print(rs.getString("Name"));
      out.write("\" name=\"name\" placeholder=\"Enter Food Item\" required>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"input-box\">\n");
      out.write("            <span class=\"details\">Quantity</span>\n");
      out.write("            <input  type=\"text\" value=\"");
      out.print(rs.getString("Quantity"));
      out.write("\" name=\"quantity\" placeholder=\"Quantity\" required>\n");
      out.write("          </div>\n");
      out.write("\t\t  <div class=\"input-box\">\n");
      out.write("            <span class=\"details\">Price</span>\n");
      out.write("            <input type=\"text\" value=\"");
      out.print(rs.getString("Price"));
      out.write("\" name=\"price\" placeholder=\"Enter item Price\" required>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"input-box\">\n");
      out.write("            <span class=\"details\">category</span>\n");
      out.write("            <input style=\"pointer-events: none;\" type=\"text\" value=\"");
      out.print(rs.getString("Category"));
      out.write("\" name=\"category\" placeholder=\"category\" required>\n");
      out.write("          </div>\n");
      out.write("            <input type=\"hidden\" name=\"id\" value=\"");
      out.print(rs.getString("ItemId"));
      out.write("\">\n");
      out.write("        <div class=\"button\">\n");
      out.write("          <input type=\"submit\" value=\"Update Item\">\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("          \n");

            }
                }
            catch(SQLException e)
            {
                System.out.println(e);
            }

      out.write("\n");
      out.write("</body>\n");
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
