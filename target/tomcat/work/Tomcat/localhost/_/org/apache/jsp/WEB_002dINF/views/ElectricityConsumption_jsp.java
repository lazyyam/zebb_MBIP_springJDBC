/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-01-21 16:44:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ElectricityConsumption_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Electricity Consumption Page</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/static/css/electricity.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("   \r\n");
      out.write("    <main>\r\n");
      out.write("        <div class=\"main-content\">\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "userSideBar.jsp", out, false);
      out.write("\r\n");
      out.write("            <div class=\"left-container\">\r\n");
      out.write("                <div class=\"logo-container\">\r\n");
      out.write("                    <img src=\"/static/asset/back.png\" alt=\"Back Logo\" class=\"logo\">\r\n");
      out.write("                </div>    \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"right-container\">\r\n");
      out.write("                <div class=\"title\">\r\n");
      out.write("                    <h1>Electricity bill</h1>\r\n");
      out.write("                    <p>Please enter the electricity bill data values</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form\">\r\n");
      out.write("                    <form>\r\n");
      out.write("                        <label for=\"usage\">Usage (mÂ³):</label>\r\n");
      out.write("                        <input type=\"text\" id=\"usage\" name=\"usage\" required>\r\n");
      out.write("                        \r\n");
      out.write("                        <label for=\"days\">Days:</label>\r\n");
      out.write("                        <input type=\"text\" id=\"days\" name=\"days\" required>\r\n");
      out.write("                        \r\n");
      out.write("                        <label for=\"proportion\">Proportion Factor (day):</label>\r\n");
      out.write("                        <input type=\"text\" id=\"proportion\" name=\"proportion\" required>\r\n");
      out.write("                        \r\n");
      out.write("                        <label for=\"amount\">Amount (RM):</label>\r\n");
      out.write("                        <input type=\"text\" id=\"amount\" name=\"amount\" required>\r\n");
      out.write("                        \r\n");
      out.write("                        <label for=\"charge\">Current Charge (RM):</label>\r\n");
      out.write("                        <input type=\"text\" id=\"charge\" name=\"charge\" required>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"button\">\r\n");
      out.write("                    <button class=\"next-button\">Next</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </main>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
