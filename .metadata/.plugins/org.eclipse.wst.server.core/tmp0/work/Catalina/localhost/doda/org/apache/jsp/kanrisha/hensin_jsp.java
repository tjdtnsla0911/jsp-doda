/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.55
 * Generated at: 2020-07-02 07:51:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.kanrisha;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hensin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/include/nav.jsp", Long.valueOf(1593514269039L));
    _jspx_dependants.put("jar:file:/C:/src/jspwork/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/doda/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1592268596561L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Bootstrap Example</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("ul li {\r\n");
      out.write("\toutline: 1px white;\r\n");
      out.write("\tmargin-left: 50px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-sm bg-danger navbar-dark\">\r\n");
      out.write("\t\t<!-- Brand -->\r\n");
      out.write("\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"/doda/index.jsp\">DODA</a>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Links -->\r\n");
      out.write("\t\t<ul class=\"navbar-nav\">\r\n");
      out.write("\t\t\t<li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\"><b>採用検索</b></a>\r\n");
      out.write("\t\t\t\t<div class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"/doda/doda?cmd=condition\">\r\n");
      out.write("\t\t\t\t\t<b>詳細条件から探す</b></a> <a class=\"dropdown-item\" href=\"#\"><b>新着求人から探す</b></a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\thref=\"#\"><b>求人特集から探す</b></a>\r\n");
      out.write("\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t<li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\"><b>求人を紹介してもらう</b></a>\r\n");
      out.write("\t\t\t\t<div class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"/doda/doda?cmd=ajact\"><b>エージェントサービス</b></a> <a class=\"dropdown-item\" href=\"/doda/doda?cmd=skauto&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prinsipal.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><b>スカウトサービス</b></a>\r\n");
      out.write("\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\"><b>知りたい, 聞きたい</b></b></a>\r\n");
      out.write("\t\t\t\t<div class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"/doda/doda?cmd=QA\"><b>転職Q&A</b></a>\r\n");
      out.write("\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Dropdown -->\r\n");
      out.write("\t\t\t<li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t<b>イベント</b></a>\r\n");
      out.write("\t\t\t\t<div class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"/doda/doda?cmd=event\"><b>イベント一覧</b></a> <a class=\"dropdown-item\" href=\"#\"><b>転職フェア</b></a>\r\n");
      out.write("\t\t\t\t</div></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("import url(https://fonts.googleapis.com/css?family=Sniglet|Raleway:900);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("body, html{\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tfont-family: 'Sniglet', cursive;\r\n");
      out.write("}\r\n");
      out.write("h1{\r\n");
      out.write("\tfont-weight: normal;\r\n");
      out.write("\tfont-size: 4em;\r\n");
      out.write("\tfont-family: 'Raleway', sans-serif;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\tmargin-top: 30px;\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("\tcolor: #F90;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Animation webkit */\r\n");
      out.write("@-webkit-keyframes myfirst\r\n");
      out.write("{\r\n");
      out.write("\t0% {margin-left: -235px}\r\n");
      out.write("\t90% {margin-left: 100%;}\r\n");
      out.write("\t100% {margin-left: 100%;}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Animation */\r\n");
      out.write("@keyframes myfirst\r\n");
      out.write("{\r\n");
      out.write("\t0% {margin-left: -235px}\r\n");
      out.write("\t70% {margin-left: 100%;}\r\n");
      out.write("\t100% {margin-left: 100%;}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fish{\r\n");
      out.write("\tbackground-image: url('http://www.geertjanhendriks.nl/codepen/form/fish.png');\r\n");
      out.write("\twidth: 235px;\r\n");
      out.write("\theight: 104px;\r\n");
      out.write("\tmargin-left: -235px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tanimation: myfirst 24s;\r\n");
      out.write("\t-webkit-animation: myfirst 24s;\r\n");
      out.write("\tanimation-iteration-count: infinite;\r\n");
      out.write("\t-webkit-animation-iteration-count: infinite;\r\n");
      out.write("\tanimation-timing-function: linear;\r\n");
      out.write("\t-webkit-animation-timing-function: linear;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#fish{\r\n");
      out.write("\ttop: 120px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#fish2{\r\n");
      out.write("\ttop: 260px;\r\n");
      out.write("\tanimation-delay: 12s;\r\n");
      out.write("\t-webkit-animation-delay: 12s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("header{\r\n");
      out.write("\theight: 160px;\r\n");
      out.write("\tbackground: url('http://www.geertjanhendriks.nl/codepen/form/golf.png') repeat-x bottom;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#form{\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\tbackground-color: #98d4f3;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("form{\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("\tpadding-top: 40px;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("label, input, textarea{\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("}\r\n");
      out.write("input, textarea{\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tborder-radius: 20px;\r\n");
      out.write("\toutline: none;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\tfont-family: 'Sniglet', cursive;\r\n");
      out.write("\tfont-size: 1em;\r\n");
      out.write("\tcolor: #676767;\r\n");
      out.write("\ttransition: border 0.5s;\r\n");
      out.write("\t-webkit-transition: border 0.5s;\r\n");
      out.write("\t-moz-transition: border 0.5s;\r\n");
      out.write("\t-o-transition: border 0.5s;\r\n");
      out.write("\tborder: solid 3px #98d4f3;\r\n");
      out.write("\t-webkit-box-sizing:border-box;\r\n");
      out.write("\t-moz-box-sizing:border-box;\r\n");
      out.write("\tbox-sizing:border-box;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("input:focus, textarea:focus{\r\n");
      out.write("\tborder: solid 3px #77bde0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("textarea{\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("\tresize: none;\r\n");
      out.write("\toverflow: auto;\r\n");
      out.write("}\r\n");
      out.write("input[type=\"submit\"]{\r\n");
      out.write("\tbackground-color: #F90;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tmargin-top: 30px;\r\n");
      out.write("\tfont-size: 1.29em;\r\n");
      out.write("\tfont-family: 'Sniglet', cursive;\r\n");
      out.write("\t-webkit-transition: background-color 0.5s;\r\n");
      out.write("\t-moz-transition: background-color 0.5s;\r\n");
      out.write("\t-o-transition: background-color 0.5s;\r\n");
      out.write("\ttransition: background-color 0.5s;\r\n");
      out.write("}\r\n");
      out.write("input[type=\"submit\"]:hover{\r\n");
      out.write("\tbackground-color: #e58f0e;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("label{\r\n");
      out.write("\tfont-size: 1.5em;\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write("\tpadding-left: 20px;\r\n");
      out.write("}\r\n");
      out.write(".formgroup, .formgroup-active, .formgroup-error{\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("\tbackground-position: right bottom;\r\n");
      out.write("\tbackground-size: 10.5%;\r\n");
      out.write("\ttransition: background-image 0.7s;\r\n");
      out.write("\t-webkit-transition: background-image 0.7s;\r\n");
      out.write("\t-moz-transition: background-image 0.7s;\r\n");
      out.write("\t-o-transition: background-image 0.7s;\r\n");
      out.write("\twidth: 566px;\r\n");
      out.write("\tpadding-top: 2px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".formgroup{\r\n");
      out.write("\tbackground-image: url('http://www.geertjanhendriks.nl/codepen/form/pixel.gif');\r\n");
      out.write("}\r\n");
      out.write(".formgroup-active{\r\n");
      out.write("\tbackground-image: url('http://www.geertjanhendriks.nl/codepen/form/octo.png');\r\n");
      out.write("}\r\n");
      out.write(".formgroup-error{\r\n");
      out.write("\tbackground-image: url('http://www.geertjanhendriks.nl/codepen/form/octo-error.png');\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("\t<h1>管理者返信</h1>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<div id=\"form\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"fish\" id=\"fish\"></div>\r\n");
      out.write("<div class=\"fish\" id=\"fish2\"></div>\r\n");
      out.write("\r\n");
      out.write("<form action=\"/doda/doda?cmd=kaitou\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"formgroup\" id=\"name-form\">\r\n");
      out.write("    <label for=\"name\">管理者お名前*</label>\r\n");
      out.write("    <input type=\"text\" id=\"name\" name=\"name\" />\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"formgroup\" id=\"email-form\">\r\n");
      out.write("    <label for=\"email\">タイトル*</label>\r\n");
      out.write("    <input type=\"text\" id=\"email\" name=\"email\" />\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"formgroup\" id=\"message-form\">\r\n");
      out.write("    <label for=\"message\">返信*</label>\r\n");
      out.write("    <textarea id=\"message\" name=\"message\"></textarea>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t<input type=\"submit\" value=\"返事転送!\" />\r\n");
      out.write("\t<input type=\"hidden\" id=\"id\" name =\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hensin.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" id=\"kanriid\" name=\"kanriid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hensin2.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("$('document').ready(function(){\r\n");
      out.write("\t$('input[type=\"text\"], input[type=\"email\"], textarea').focus(function(){\r\n");
      out.write("\t\tvar background = $(this).attr('id');\r\n");
      out.write("\t\t$('#' + background + '-form').addClass('formgroup-active');\r\n");
      out.write("\t\t$('#' + background + '-form').removeClass('formgroup-error');\r\n");
      out.write("\t});\r\n");
      out.write("\t$('input[type=\"text\"], input[type=\"email\"], textarea').blur(function(){\r\n");
      out.write("\t\tvar background = $(this).attr('id');\r\n");
      out.write("\t\t$('#' + background + '-form').removeClass('formgroup-active');\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("function errorfield(field){\r\n");
      out.write("\t$(field).addClass('formgroup-error');\r\n");
      out.write("\tconsole.log(field);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(\"#waterform\").submit(function() {\r\n");
      out.write("\tvar stopsubmit = false;\r\n");
      out.write("\r\n");
      out.write("if($('#name').val() == \"\") {\r\n");
      out.write("\terrorfield('#name-form');\r\n");
      out.write("\tstopsubmit=true;\r\n");
      out.write("}\r\n");
      out.write("if($('#email').val() == \"\") {\r\n");
      out.write("\terrorfield('#email-form');\r\n");
      out.write("\tstopsubmit=true;\r\n");
      out.write("}\r\n");
      out.write("  if(stopsubmit) return false;\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
