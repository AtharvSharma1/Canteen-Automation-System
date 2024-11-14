package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import db.dbConnector;
import java.sql.Statement;
import java.sql.ResultSet;

public final class EmpIOTD_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");

    String id = (String)session.getAttribute("username");
//    System.out.println("id iotd "+id);
       ResultSet rs = null;
       
        int p1=0,p2=0,p3=0,p4=0,total=0,q1=0,q2=0,q3=0,q4=0;
            try{

                Statement st=dbConnector.getStatement();
                String query = "SELECT * FROM iotd;";
                

                rs = st.executeQuery(query);
                

      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("      <style>\n");
      out.write("          #inp_1\n");
      out.write("{\n");
      out.write("  text-decoration:none;\n");
      out.write("  border-radius: 3vh;\n");
      out.write("  border: none;\n");
      out.write("  margin: 2vh;\n");
      out.write("  width:150px;\n");
      out.write("  height: 51px;\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  cursor: pointer;\n");
      out.write("  display: flex;\n");
      out.write("  align-items: center;\n");
      out.write("  justify-content: center;\n");
      out.write("  padding: 0;\n");
      out.write("  background: #333;\n");
      out.write("  font-size: 15px;\n");
      out.write("  color: #fff;}\n");
      out.write("      </style>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Item of the Day</title>\n");
      out.write("    <link\n");
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
      out.write("    <nav class=\"navbar\">\n");
      out.write("      <div class=\"navbar-container container\">\n");
      out.write("          <input type=\"checkbox\" name=\"\" id=\"\">\n");
      out.write("          <div class=\"hamburger-lines\">\n");
      out.write("              <span class=\"line line1\"></span>\n");
      out.write("              <span class=\"line line2\"></span>\n");
      out.write("              <span class=\"line line3\"></span>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("  </nav>\n");
      out.write("    <section class=\"showcase-area\" id=\"showcase\">\n");
      out.write("      <div class=\"showcase-container\">\n");
      out.write("        <h1 class=\"main-title\" id=\"home\">Canteen Management System</h1>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("    <table style=\"width: 100%\">\n");
      out.write("        <tr>\n");
      out.write("            <td><a href=\"EmployeeHome.jsp\" style=\"float: right;\"><button>Employee Home</button></a></td>\n");
      out.write("        </tr>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    <section id=\"food-menu\">\n");
      out.write("      <h2 class=\"food-menu-heading\">Item of the Day</h2>\n");
      out.write("      ");

          if(rs.next())
          {

      out.write("\n");
      out.write("      <div class=\"food-menu-container container\">\n");
      out.write("\n");
      out.write("        <div class=\"food-menu-item\">\n");
      out.write("          <div class=\"food-img\">\n");
      out.write("              <img src=\"images/menu-1.jpg\" alt=\"\" />\n");
      out.write("          </div>\n");
      out.write("          <div class=\"food-description\">\n");
      out.write("            <h2 class=\"food-titile\">");
      out.print(rs.getString("name1"));
      out.write("</h2>\n");
      out.write("            <p class=\"food-price\">Price: &#8377; ");
      out.print(rs.getString("price1"));
      out.write("</p>\n");
      out.write("            <form action=\"PurchaseCombo\" method=\"post\">\n");
      out.write("                <table style=\"width: 100%\">            \n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"hidden\" name=\"id\" value=\"");
      out.print(id);
      out.write("\"></td>\n");
      out.write("                    <td><input type=\"hidden\" name=\"name\" value=\"");
      out.print(rs.getString("name1"));
      out.write("\" ></td>\n");
      out.write("                    <td><input type=\"hidden\" name=\"quantity\" value=\"");
      out.print(rs.getString("quantity1"));
      out.write("\" ></td>\n");
      out.write("                    <td><input type=\"hidden\" name=\"price\" value=\"");
      out.print(rs.getString("price1"));
      out.write("\" ></td>                    \n");
      out.write("                    <td><input type=\"submit\" id=\"inp_1\" value=\"Purchase\"/></td>\n");
      out.write("                </tr>        \n");
      out.write("                </table>        \n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("              \n");
      out.write("      </div>\n");
      out.write("          <div class=\"food-menu-container container\">\n");
      out.write("\n");
      out.write("        <div class=\"food-menu-item\">\n");
      out.write("          <div class=\"food-img\">\n");
      out.write("              <img src=\"images/hero.png\" alt=\"\" />\n");
      out.write("          </div>\n");
      out.write("          <div class=\"food-description\">\n");
      out.write("            <h2 class=\"food-titile\">");
      out.print(rs.getString("name2"));
      out.write("</h2>\n");
      out.write("            <p class=\"food-price\">Price: &#8377; ");
      out.print(rs.getString("price2"));
      out.write("</p>\n");
      out.write("            <form action=\"PurchaseCombo\" method=\"post\">\n");
      out.write("                <table style=\"width: 100%\">            \n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"hidden\" name=\"id\" value=\"");
      out.print(id);
      out.write("\"></td>                    \n");
      out.write("                    <td><input type=\"hidden\" name=\"name\" value=\"");
      out.print(rs.getString("name2"));
      out.write("\" ></td>\n");
      out.write("                    <td><input type=\"hidden\" name=\"quantity\" value=\"");
      out.print(rs.getString("quantity2"));
      out.write("\" ></td>\n");
      out.write("                    <td><input type=\"hidden\" name=\"price\" value=\"");
      out.print(rs.getString("price2"));
      out.write("\" ></td>                    \n");
      out.write("                    <td><input type=\"submit\" id=\"inp_1\" value=\"Purchase\"/></td>\n");
      out.write("                </tr>        \n");
      out.write("                </table>        \n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("              \n");
      out.write("      </div>\n");
      out.write("          <div class=\"food-menu-container container\">\n");
      out.write("\n");
      out.write("        <div class=\"food-menu-item\">\n");
      out.write("          <div class=\"food-img\">\n");
      out.write("              <img src=\"images/peakpx.jpg\" alt=\"\" />\n");
      out.write("          </div>\n");
      out.write("          <div class=\"food-description\">\n");
      out.write("            <h2 class=\"food-titile\">");
      out.print(rs.getString("name3"));
      out.write("</h2>\n");
      out.write("            <p class=\"food-price\">Price: &#8377; ");
      out.print(rs.getString("price3"));
      out.write("</p>\n");
      out.write("            <form action=\"PurchaseCombo\" method=\"post\">\n");
      out.write("                <table style=\"width: 100%\">            \n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"hidden\" name=\"id\" value=\"");
      out.print(id);
      out.write("\"></td>\n");
      out.write("                    <td><input type=\"hidden\" name=\"name\" value=\"");
      out.print(rs.getString("name3"));
      out.write("\" ></td>\n");
      out.write("                    <td><input type=\"hidden\" name=\"quantity\" value=\"");
      out.print(rs.getString("quantity3"));
      out.write("\" ></td>\n");
      out.write("                    <td><input type=\"hidden\" name=\"price\" value=\"");
      out.print(rs.getString("price3"));
      out.write("\" ></td>                    \n");
      out.write("                    <td><input type=\"submit\" id=\"inp_1\" value=\"Purchase\"/></td>\n");
      out.write("                </tr>        \n");
      out.write("                </table>        \n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("              \n");
      out.write("      </div>\n");
      out.write("          <div class=\"food-menu-container container\">\n");
      out.write("\n");
      out.write("        <div class=\"food-menu-item\">\n");
      out.write("          <div class=\"food-img\">\n");
      out.write("              <img src=\"images/VegPaora.jpg\" alt=\"\" />\n");
      out.write("          </div>\n");
      out.write("          <div class=\"food-description\">\n");
      out.write("            <h2 class=\"food-titile\">");
      out.print(rs.getString("name4"));
      out.write("</h2>\n");
      out.write("            <p class=\"food-price\">Price: &#8377; ");
      out.print(rs.getString("price4"));
      out.write("</p>            \n");
      out.write("            <form action=\"PurchaseCombo\" method=\"post\">\n");
      out.write("                <table style=\"width: 100%\">            \n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"hidden\" name=\"id\" value=\"");
      out.print(id);
      out.write("\"></td>\n");
      out.write("                    <td><input type=\"hidden\" name=\"name\" value=\"");
      out.print(rs.getString("name4"));
      out.write("\" ></td>\n");
      out.write("                    <td><input type=\"hidden\" name=\"quantity\" value=\"");
      out.print(rs.getString("quantity4"));
      out.write("\" ></td>\n");
      out.write("                    <td><input type=\"hidden\" name=\"price\" value=\"");
      out.print(rs.getString("price4"));
      out.write("\" ></td>                    \n");
      out.write("                    <td><input type=\"submit\" id=\"inp_1\" value=\"Purchase\"/></td>\n");
      out.write("                </tr>        \n");
      out.write("                </table>        \n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        ");

           
        
      out.write("      \n");
      out.write("      </div>\n");
      out.write("          ");
}
      out.write("\n");
      out.write("    </section>\n");
      out.write("  </body>\n");
      out.write("  ");
  
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }


      out.write("\n");
      out.write("  <!-- \n");
      out.write("    .................../ JS Code for smooth scrolling /...................... -->\n");
      out.write("\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("      // Add smooth scrolling to all links\n");
      out.write("      $(\"a\").on(\"click\", function (event) {\n");
      out.write("        // Make sure this.hash has a value before overriding default behavior\n");
      out.write("        if (this.hash !== \"\") {\n");
      out.write("          // Prevent default anchor click behavior\n");
      out.write("          event.preventDefault();\n");
      out.write("\n");
      out.write("          // Store hash\n");
      out.write("          var hash = this.hash;\n");
      out.write("\n");
      out.write("          // Using jQuery's animate() method to add smooth page scroll\n");
      out.write("          // The optional number (800) specifies the number of milliseconds it takes to scroll to the specified area\n");
      out.write("          $(\"html, body\").animate(\n");
      out.write("            {\n");
      out.write("              scrollTop: $(hash).offset().top,\n");
      out.write("            },\n");
      out.write("            800,\n");
      out.write("            function () {\n");
      out.write("              // Add hash (#) to URL when done scrolling (default click behavior)\n");
      out.write("              window.location.hash = hash;\n");
      out.write("            }\n");
      out.write("          );\n");
      out.write("        } // End if\n");
      out.write("      });\n");
      out.write("    });\n");
      out.write("  </script>\n");
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
