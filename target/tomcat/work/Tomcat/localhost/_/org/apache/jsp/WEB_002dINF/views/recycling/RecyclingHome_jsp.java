/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-02-02 18:41:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.recycling;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RecyclingHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1706781071209L));
    _jspx_dependants.put("/WEB-INF/views/common/userSideBar.jsp", Long.valueOf(1706897663420L));
    _jspx_dependants.put("/WEB-INF/views/common/include-first.jsp", Long.valueOf(1706897663419L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write("        <!DOCTYPE html>\r\n");
      out.write("        <html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("        <head>\r\n");
      out.write("            <meta charset=\"UTF-8\">\r\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("            <title>Recycling Page</title>\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"/static/common/css/materialize.min.css\">\r\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"/static/css/recycling.css\">\r\n");
      out.write("            <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        </head>\r\n");
      out.write("\r\n");
      out.write("        <body>\r\n");
      out.write("            ");
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
      out.write("            ");
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
      out.write("          <a href=\"/updateprofile?fullname=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.getFullname()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("          &nickname=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.getNickname()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&email=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.getEmail()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("          &phonenum=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.getPhoneNum()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&language=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.getPreferredLanguage()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("          &category=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.getCategory()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&poscode=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.getPoscode()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("          &address=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.getAddress()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">Profile</a>\r\n");
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
      out.write("                <div class=\"page-wrapper\" id=\"main-wrapper\" data-layout=\"vertical\" data-navbarbg=\"skin6\"\r\n");
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
      out.write("            <a href=\"/timeline\" class=\"menu-button\"><i class=\"fas fa-calendar-alt\" style=\"font-size: 2rem;\"></i>&nbsp;&nbsp;Timeline</a>\r\n");
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
      out.write("                                            <h1>Recycling bill</h1>\r\n");
      out.write("                                            <div class=\"container right-align\">\r\n");
      out.write("                                                <a class=\"btn waves-effect waves-light\"\r\n");
      out.write("                                                    href=\"/recycling/viewAddRecyclingDataForm\">Add Recycle Data</a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <br><br>\r\n");
      out.write("                                            <table>\r\n");
      out.write("                                                <thead>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <th>User Name</th>\r\n");
      out.write("                                                        <th>Weight</th>\r\n");
      out.write("                                                        <th>Month</th>\r\n");
      out.write("                                                        <th>Recycling Carbon Factor</th>\r\n");
      out.write("                                                        <th>File Name</th>\r\n");
      out.write("                                                        <th>Download bill</th>\r\n");
      out.write("                                                        <th>Action</th>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                </thead>\r\n");
      out.write("                                                <tbody>\r\n");
      out.write("                                                    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                </tbody>\r\n");
      out.write("                                            </table>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </main>\r\n");
      out.write("                </div>\r\n");
      out.write("        </body>\r\n");
      out.write("\r\n");
      out.write("        </html>");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/recycling/RecyclingHome.jsp(48,52) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("recycling");
    // /WEB-INF/views/recycling/RecyclingHome.jsp(48,52) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/recycling/RecyclingHome.jsp(48,52) '${userrecycling}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${userrecycling}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                        <tr>\r\n");
          out.write("                                                            <td class=\"Username\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${recycling.getUserName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                                            <td class=\"weight\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${recycling.getWeight()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                                            <td class=\"month\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${recycling.getMonth()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                                            <td class=\"recycling_carbon_factor\">\r\n");
          out.write("                                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${recycling.getRecycling_carbon_factor()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                                            <td class=\"getImageName\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${recycling.getImageName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                                            <td>\r\n");
          out.write("                                                                <a href=\"/recycling/displayFile?username=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${recycling.getUserName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&month=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${recycling.getMonth()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&image_name=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${recycling.getImageName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("                                                                    target=\"_blank\">Download File</a>\r\n");
          out.write("                                                            </td>\r\n");
          out.write("                                                            <td>\r\n");
          out.write("                                                                <a class=\"btn-floating waves-effect waves-light btn-small\"\r\n");
          out.write("                                                                    href=\"/recycling/viewEditRecyclingDataForm?userName=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${recycling.getUserName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&weight=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${recycling.getWeight()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&month=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${recycling.getMonth()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("                                                                    <i class=\"material-icons\">create</i>\r\n");
          out.write("                                                                </a>\r\n");
          out.write("                                                                <a class=\"btn-floating waves-effect waves-light btn-small\"\r\n");
          out.write("                                                                    href=\"/recycling/deleteRecyclingData?month=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${recycling.getMonth()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("                                                                    <i class=\"material-icons\">delete</i>\r\n");
          out.write("                                                                </a>\r\n");
          out.write("                                                            </td>\r\n");
          out.write("                                                        </tr>\r\n");
          out.write("                                                    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
