/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-01-20 09:07:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class competitionUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"/static/css/competitionUser.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css\">\r\n");
      out.write("        <title>Competition User</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"main-container\">\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "userSideBar.jsp", out, false);
      out.write("\r\n");
      out.write("    \r\n");
      out.write("            <!-- Main Content Section -->\r\n");
      out.write("            <div class='main-content-container'>\r\n");
      out.write("                <!-- Your main content goes here -->\r\n");
      out.write("                <div class=\"title\">\r\n");
      out.write("                    <h3 style=\"margin-left:0px;\"><b>Pertandingan Kalendar Rendah Karbon Iskandar Puteri</b></h3>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"overview-container\">\r\n");
      out.write("                    <h4>Overview</h4>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li>Pertandingan ini bertujuan bagi memberikan galakan dan juga motivasi kepada penduduk Majlis Bandaraya Iskandar Puteri, MBIP untuk membudayakan gaya hidup rendah karbon. Melalui pertandingan pengurangan penggunaan air (m3), elektrik (kWh) dan juga jumlah kitar semula (kg), ianya dapat membantu dunia, khususnya MBIP dalam usaha mengurangkan penghasilan karbon.</li>\r\n");
      out.write("                        <li>Tempoh daftar maklumat di bit.ly/mbiprendahkarbon bermula :Sekarang sehingga 31 Ogos 2022</li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"winner-container\">\r\n");
      out.write("                    <div class=\"second-winner\">\r\n");
      out.write("                        <img src=\"/static/asset/competitionUserIMG/2nd.png\" alt=\"2nd winner\" style=\"margin-bottom: 10px;\">\r\n");
      out.write("                        <img src=\"/static/asset/headerIMG/userIcon.png\" alt=\"1st winner\">\r\n");
      out.write("                        <p>Winner 1's Username</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"first-winner\">\r\n");
      out.write("                        <img src=\"/static/asset/competitionUserIMG/1st.png\" alt=\"1st winner\" style=\"margin-bottom: 10px;\">\r\n");
      out.write("                        <img src=\"/static/asset/headerIMG/userIcon.png\" alt=\"1st winner\">\r\n");
      out.write("                        <p>Winner 2's Username</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"third-winner\">\r\n");
      out.write("                        <img src=\"/static/asset/competitionUserIMG/3rd.png\" alt=\"3rd winner\" style=\"margin-bottom: 10px;\">\r\n");
      out.write("                        <img src=\"/static/asset/headerIMG/userIcon.png\" alt=\"1st winner\">\r\n");
      out.write("                        <p>Winner 3's Username</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"winner-details-container\">\r\n");
      out.write("                    <table class=\"winner-details-table\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>Residents</th>\r\n");
      out.write("                                <th>Locations</th>\r\n");
      out.write("                                <th>Water Consumption</th>\r\n");
      out.write("                                <th>Electricity Consumption</th>\r\n");
      out.write("                                <th>Amount Recycling</th>\r\n");
      out.write("                                <th>Carbon Reduction Rate</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <!-- Add dynamic table rows and data here -->\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td><img src=\"/static/asset/headerIMG/userIcon.png\" alt=\"1st winner\">John Doe</td>\r\n");
      out.write("                                <td>City A</td>\r\n");
      out.write("                                <td>100 gallons</td>\r\n");
      out.write("                                <td>200 kWh</td>\r\n");
      out.write("                                <td>5 tons</td>\r\n");
      out.write("                                <td>20%</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td><img src=\"/static/asset/headerIMG/userIcon.png\" alt=\"2nd winner\">John Doe</td>\r\n");
      out.write("                                <td>City A</td>\r\n");
      out.write("                                <td>100 gallons</td>\r\n");
      out.write("                                <td>200 kWh</td>\r\n");
      out.write("                                <td>5 tons</td>\r\n");
      out.write("                                <td>20%</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td><img src=\"/static/asset/headerIMG/userIcon.png\" alt=\"3rd winner\">John Doe</td>\r\n");
      out.write("                                <td>City A</td>\r\n");
      out.write("                                <td>100 gallons</td>\r\n");
      out.write("                                <td>200 kWh</td>\r\n");
      out.write("                                <td>5 tons</td>\r\n");
      out.write("                                <td>20%</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <!-- Add more rows as needed -->\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    \r\n");
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