/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
<<<<<<< HEAD
 * Generated at: 2024-02-05 18:56:41 UTC
=======
 * Generated at: 2024-02-05 18:54:57 UTC
>>>>>>> 9b3d69e21486588a7b5faa0c06a14455d99dacd9
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BillPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
<<<<<<< HEAD
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1707159121403L));
    _jspx_dependants.put("/WEB-INF/views/common/userSideBar.jsp", Long.valueOf(1707159121407L));
    _jspx_dependants.put("/WEB-INF/views/common/include-first.jsp", Long.valueOf(1707159121404L));
=======
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1707150642862L));
    _jspx_dependants.put("/WEB-INF/views/common/userSideBar.jsp", Long.valueOf(1707156303767L));
    _jspx_dependants.put("/WEB-INF/views/common/include-first.jsp", Long.valueOf(1706959889956L));
    _jspx_dependants.put("/WEB-INF/views/common/auth.jsp", Long.valueOf(1707157516880L));
>>>>>>> 9b3d69e21486588a7b5faa0c06a14455d99dacd9
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Recycling Page</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/static/css/BillPage.css\">  <!--no affect dk why-->\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("header {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    height: 100px;\r\n");
      out.write("    background-color: #d0edc7;\r\n");
      out.write("    border-bottom: 1px solid black;\r\n");
      out.write("    padding: 0 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("main {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    height: 100vh;\r\n");
      out.write("    margin: 0 auto; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("aside {\r\n");
      out.write("    width: 200px;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    background-color: white;\r\n");
      out.write("    border-right: 2px solid rgb(25, 25, 49);\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo-container {\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    width: 40px;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("    justify-content: flex-end;\r\n");
      out.write("    align-items: flex-end;\r\n");
      out.write("    margin-top: 37px;\r\n");
      out.write("    margin-bottom: 100px;\r\n");
      out.write("    margin-left: 120px;\r\n");
      out.write("    text-align: right;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main-content {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex: 1;\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".left-container {\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    width: 13%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".right-container {\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    width: 87%;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form {\r\n");
      out.write("    flex: 1;\r\n");
      out.write("    border: 1px solid black;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    padding-top: 40px;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("    max-height:45%;\r\n");
      out.write("    margin:20px;\r\n");
      out.write("    border-radius: 25px;\r\n");
      out.write("    background-color: #d0edc7 ;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form {\r\n");
      out.write("    display: grid;\r\n");
      out.write("    grid-gap: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("label {\r\n");
      out.write("    font-size: 0.9em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bill-container {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-wrap: wrap;\r\n");
      out.write("    justify-content: space-around;\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("    padding-right: 60px; /* adjust the button container padding */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bill-card {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    color: inherit;\r\n");
      out.write("    margin: 10px;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    transition: transform 0.3s ease-in-out;\r\n");
      out.write("    position: relative; /* Make the container position relative */\r\n");
      out.write("    display: flex; /* Enable flex container for centering */\r\n");
      out.write("    flex-direction: column; /* Stack child elements vertically */\r\n");
      out.write("    align-items: center; /* Center children horizontally */\r\n");
      out.write("    justify-content: center; /* Center children vertically */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bill-card p {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 50%; /* Position at the vertical center */\r\n");
      out.write("    left: 50%; /* Center horizontally */\r\n");
      out.write("    transform: translate(-50%, -50%); /* Center both horizontally and vertically */\r\n");
      out.write("    margin: 0; /* Remove default margin */\r\n");
      out.write("    background-color: rgba(255, 255, 255, 0.7); /* Add a semi-transparent background */\r\n");
      out.write("    padding: 5px;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bill-card:hover {\r\n");
      out.write("    transform: scale(1.05);\r\n");
      out.write("}\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      out.write("<link rel=\"stylesheet\" href=\"static/common/css/general.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"static/common/css/sideBarCss.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"static/common/css/headerCss.css\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"/static/common/css/styles.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    button{\r\n");
      out.write("    background-color: #DDEBE6;\r\n");
      out.write("    /* Green background color */\r\n");
      out.write("    color: #183D3D;\r\n");
      out.write("    /* White text color */\r\n");
      out.write("    padding: 8px 30px;\r\n");
      out.write("    /* Padding for the button */\r\n");
      out.write("    border: none;\r\n");
      out.write("    /* No border */\r\n");
      out.write("    border-radius: 8px;\r\n");
      out.write("    /* Border radius for rounded corners */\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    /* Font size */\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    /* Cursor style on hover */\r\n");
      out.write("}\r\n");
      out.write("</style>");
      out.write(" \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/static/common/css/headerCss.css\">\r\n");
      out.write(" \r\n");
      out.write("  <style>\r\n");
      out.write("    .dropdown {\r\n");
      out.write("      position: relative;\r\n");
      out.write("      display: inline-block;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .dropdown-content {\r\n");
      out.write("      display: none;\r\n");
      out.write("      position: absolute;\r\n");
      out.write("      background-color: #f9f9f9;\r\n");
      out.write("      min-width: 160px;\r\n");
      out.write("      box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\r\n");
      out.write("      z-index: 1;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .dropdown-content a {\r\n");
      out.write("      color: black;\r\n");
      out.write("      padding: 12px 16px;\r\n");
      out.write("      text-decoration: none;\r\n");
      out.write("      display: block;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .dropdown-content a:hover {\r\n");
      out.write("      background-color: #f1f1f1;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("  <title>Header</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <div class='header-container'>\r\n");
      out.write("    <img class=\"header-background-image\" src=\"/static/asset/headerIMG/upper bar image.png\" alt=\"upper bar image\">\r\n");
      out.write("    <img class=\"overlay-image\" src=\"/static/asset/headerIMG/image MBIP.png\" alt=\"image MBIP\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"login\">\r\n");
      out.write("      <div style=\"grid-column: 1/2; grid-row: 1/2;\">\r\n");
      out.write("        <h4><b>Account</b></h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div style=\"grid-column: 2/3; grid-row: 1/2;\" class=\"dropdown\">\r\n");
      out.write("        <img class=\"user-image\" src=\"/static/asset/headerIMG/userIcon.png\" alt=\"User Icon\" onclick=\"toggleDropdown()\">\r\n");
      out.write("        <div id=\"dropdown-menu\" class=\"dropdown-content\">\r\n");
      out.write("          <a href=\"/editprofile\">Profile</a>\r\n");
      out.write("          <a href=\"/logout\">Logout</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div style=\"grid-column: 3/4; grid-row: 1/2;\" class=\"dropdown\">\r\n");
      out.write("        <h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.getUsername()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("      var dropdownVisible = false;\r\n");
      out.write("    \r\n");
      out.write("      function toggleDropdown() {\r\n");
      out.write("        var dropdown = document.getElementById(\"dropdown-menu\");\r\n");
      out.write("        dropdown.style.display = dropdownVisible ? 'none' : 'block';\r\n");
      out.write("        dropdownVisible = !dropdownVisible;\r\n");
      out.write("      }\r\n");
      out.write("    \r\n");
      out.write("      // Close the dropdown if the user clicks outside of it\r\n");
      out.write("      window.onclick = function(event) {\r\n");
      out.write("        if (!event.target.matches('.user-image')) {\r\n");
      out.write("          var dropdowns = document.getElementsByClassName(\"dropdown-content\");\r\n");
      out.write("          for (var i = 0; i < dropdowns.length; i++) {\r\n");
      out.write("            var openDropdown = dropdowns[i];\r\n");
      out.write("            if (openDropdown.style.display === 'block') {\r\n");
      out.write("              openDropdown.style.display = 'none';\r\n");
      out.write("              dropdownVisible = false;\r\n");
      out.write("            }\r\n");
      out.write("          }\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("    <div class=\"page-wrapper\" id=\"main-wrapper\" data-layout=\"vertical\" data-navbarbg=\"skin6\"\r\n");
      out.write("                    data-sidebartype=\"full\" data-sidebar-position=\"fixed\" data-header-position=\"fixed\">\r\n");
      out.write("                    <main>\r\n");
      out.write("                        <div class=\"main-content\">\r\n");
      out.write("                            ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/css/sideBarCss.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css\">\r\n");
      out.write("    <title>Side bar</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class='sideBar-container'>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("         <!-- Sidebar content -->\r\n");
      out.write("        <div class=\"sidebar-content\">\r\n");
      out.write("            <div class=\"menu-tab\">\r\n");
      out.write("                <h4>MENU</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a href=\"/BillPage\" class=\"menu-button\"><i class=\"fas fa-file-invoice\" style=\"font-size: 2rem;\"></i>&nbsp;&nbsp;Bills</a>\r\n");
      out.write("            <a href=\"/winner/finalWinnersUser\" class=\"menu-button\"><i class=\"fas fa-trophy\" style=\"font-size: 2rem;\"></i>&nbsp;&nbsp;Competition</a>\r\n");
      out.write("            <a href=\"/viewTimeLine\" class=\"menu-button\"><i class=\"fas fa-calendar-alt\" style=\"font-size: 2rem;\"></i>&nbsp;&nbsp;Timeline</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("                            <div class=\"right-container\">\r\n");
      out.write("                                <div class=\"container-fluid\">\r\n");
      out.write("                                    <div class=\"card\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <h1>Bill</h1>\r\n");
      out.write("                                            <p>Please select the bill type that you want to upload</p>\r\n");
      out.write("                                            <div class=\"bill-container\">\r\n");
      out.write("                                                <a href=\"/water/listWaterDataByUsername_Month/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.getUsername()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"class=\"bill-card\" id=\"water-activity\"> <!-- the href link need change ltr-->\r\n");
      out.write("                                                    <!-- Icon for Water Bill -->\r\n");
      out.write("                                                    <img src=\"/static/water/asset/Water bill background.png\" alt=\"Water Bill\">\r\n");
      out.write("                                                    <p>Water bill</p>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                                <a href=\"/electrical/listElectricalDataByUsername_Month/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.getUsername()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"class=\"bill-card\" id=\"electrical-activity\">\r\n");
      out.write("                                                    <!-- Icon for Electricity Bill -->\r\n");
      out.write("                                                    <img src=\"/static/electrical/asset/Electricity bill background.png\" alt=\"Electricity Bill\">\r\n");
      out.write("                                                    <p>Electricity bill</p>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                                <a href=\"/recycling/listRecyclingDataByUsername_Month/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.getUsername()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"bill-card\" id=\"recycling-activity\">\r\n");
      out.write("                                                    <!-- Icon for Recycling Activity -->\r\n");
      out.write("                                                    <img src=\"/static/recycling/asset/Recycling bill background.png\" alt=\"Recycling Activity\">\r\n");
      out.write("                                                    <p>Recycling activity</p>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </main>\r\n");
      out.write("                </div>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/common/auth.jsp(1,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.getAuthenticated() != true}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    ");
        if (_jspx_meth_c_005fredirect_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fredirect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_005fredirect_005f0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_005fredirect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fredirect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/views/common/auth.jsp(2,4) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fredirect_005f0.setUrl("/home");
    int _jspx_eval_c_005fredirect_005f0 = _jspx_th_c_005fredirect_005f0.doStartTag();
    if (_jspx_th_c_005fredirect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody.reuse(_jspx_th_c_005fredirect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody.reuse(_jspx_th_c_005fredirect_005f0);
    return false;
  }
}
