/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-01-23 15:10:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"/static/css/home.css\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Home</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            body{\r\n");
      out.write("                background-image: url(\"/static/asset/background2.jpg\");\r\n");
      out.write("                background-repeat: no-repeat;\r\n");
      out.write("                background-size: 100%;\r\n");
      out.write("            }  \r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"body-container\">\r\n");
      out.write("            <div class=\"login-container\">\r\n");
      out.write("                <div class=\"logintitle\">Login</div>\r\n");
      out.write("                <form action=\"#\" method=\"post\"><hr>\r\n");
      out.write("                    <div class=\"input-container\">\r\n");
      out.write("                    \r\n");
      out.write("                  <input type=\"text\" id=\"username\" name=\"username\" placeholder=\"Username\">\r\n");
      out.write("                  <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"Password\">\r\n");
      out.write("                  <div class=\"forgotpassword\">\r\n");
      out.write("                    <a>Forget password?</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <button id=\"loginbutton\" type=\"submit\">Login</button>\r\n");
      out.write("                  <a href=\"register\" id=\"registerbut\">Register</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                </form>\r\n");
      out.write("              </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        Hello <p>${name}</p>. Welcome to the system!\r\n");
      out.write("\r\n");
      out.write("        <!-- Href links -->\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"/electricitybill\">Electricity Bill</a></li>\r\n");
      out.write("            <li><a href=\"/recyclingbill\">Recycling Bill</a></li>\r\n");
      out.write("            <li><a href=\"/waterbill\">Water Bill</a></li>\r\n");
      out.write("            <li><a href=\"/electricity\">Electricity form</a></li>\r\n");
      out.write("            <li><a href=\"/recycling/viewAddRecyclingDataForm\">Recycling form</a></li>\r\n");
      out.write("            <li><a href=\"/water\">Water form</a></li>\r\n");
      out.write("            <li><a href=\"/pertandinganadmin\">Adminview pertandingan</a></li>\r\n");
      out.write("            <li><a href=\"/timeline\">Timeline</a></li>\r\n");
      out.write("            <li><a href=\"/timelineAdmin\">TimelineAdmin</a></li>\r\n");
      out.write("            <li><a href=\"/reportviewanalysis\">Adminview report analysis</a></li>\r\n");
      out.write("            <li><a href=\"/reportcalculation\">Adminview report calculation</a></li>\r\n");
      out.write("            <li><a href=\"/winner/listAllWinner\">userview pertandingan</a></li>\r\n");
      out.write("            <li><a href=\"/certificate\">certificate</a></li>\r\n");
      out.write("            <li><a href=\"/BillPage\">BillPage</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
