/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.55
 * Generated at: 2020-07-06 00:07:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
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
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t<form action=\"/doda/doda?cmd=joinProc\" method=\"POST\" class=\"was-validated\" onsubmit=\"return validate()\">\r\n");
      out.write("\t   <div class=\"form-group\">\r\n");
      out.write("\t    <label for=\"text\">お名前:</label>\r\n");
      out.write("\t    <input type=\"text\" class=\"form-control\" id=\"name\" placeholder=\"Enter Email\" name=\"name\" required>\r\n");
      out.write("\t    <div class=\"valid-feedback\">ちゃんと作成しました.</div>\r\n");
      out.write("\t    <div class=\"invalid-feedback\">こちらは作成しなくてはいけません.</div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\r\n");
      out.write("\t  <div class=\"form-group\">\r\n");
      out.write("\t    <label for=\"userid\">ユーザーID:</label>\r\n");
      out.write("\t    <button type=\"button\" class=\"btn btn-warning float-right\" onclick=\"usernameCheck()\">重複確認</button>\r\n");
      out.write("\t    <input type=\"text\" class=\"form-control\" id=\"userid\" placeholder=\"Enter username\" name=\"userid\" required>\r\n");
      out.write("\t    <div class=\"valid-feedback\">こちらは作成しなくてはいけません.</div>\r\n");
      out.write("\t    <div class=\"invalid-feedback\">Please fill out this field.</div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t  <div class=\"form-group\">\r\n");
      out.write("\t    <label for=\"pwd\">パスワード:</label>\r\n");
      out.write("\t    <input type=\"password\" class=\"form-control\" id=\"password\" placeholder=\"Enter password\" name=\"password\" required>\r\n");
      out.write("\t    <div class=\"valid-feedback\">ちゃんと作成しました.</div>\r\n");
      out.write("\t    <div class=\"invalid-feedback\">こちらは作成しなくてはいけません.</div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\r\n");
      out.write("\t  <div class=\"form-group\">\r\n");
      out.write("\t    <label for=\"email\">イーメール:</label>\r\n");
      out.write("\t    <input type=\"email\" class=\"form-control\" id=\"emailsk\" placeholder=\"Enter Email\" name=\"emailsk\" required>\r\n");
      out.write("\t     <button type=\"button\" class=\"btn btn-warning float-right\" onclick=\"ok()\">인증번호발송</button>\r\n");
      out.write("\t     인증번호: <input type=\"text\" name=\"emailok2\" id=\"emailok2\"><button type=\"button\" class=\"btn btn-warning float-right\" onclick=\"ok2()\">인증번호확인</button>\r\n");
      out.write("\t     <div id=\"bodyContents\">\r\n");
      out.write("\t      <input type=\"hidden\" id=\"okok\" name=\"okok\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emailok}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\r\n");
      out.write("\t  <div class=\"form-group\">\r\n");
      out.write("   \t\t<label for=\"address\">ご住所:</label>\r\n");
      out.write("   \t\t<button type=\"button\" class=\"btn btn-warning float-right\" onclick=\"goPopup()\">주소검색</button>\r\n");
      out.write("\t    <input type=\"text\" class=\"form-control\" id=\"address\" placeholder=\"Enter Address\" name=\"address\" required readonly>\r\n");
      out.write("\t    <div class=\"valid-feedback\">ちゃんと作成しました.</div>\r\n");
      out.write("\t    <div class=\"invalid-feedback\">こちらは作成しなくてはいけません.</div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t     <div class=\"form-group\">\r\n");
      out.write("\t    <label for=\"text\">電話番号:</label>\r\n");
      out.write("\t    <input type=\"text\" class=\"form-control\" id=\"tell\" placeholder=\"tell\" name=\"tell\" required>\r\n");
      out.write("\t    <div class=\"valid-feedback\">ちゃんと作成しました.</div>\r\n");
      out.write("\t    <div class=\"invalid-feedback\">こちらは作成しなくてはいけません.</div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t\t<select id=\"style\" name=\"style\">\r\n");
      out.write("\t\t\t<option value=\"1\">個人会員登録</option>\r\n");
      out.write("\t\t\t<option value=\"2\">法人会員登録</option>\r\n");
      out.write("\t\t\t<option value=\"3\">管理者登録</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t\t管理者暗号番号<input type=\"text\" id=\"pass\" name=\"pass\">\r\n");
      out.write("\r\n");
      out.write("<div align=\"right\">\r\n");
      out.write("\t  <button type=\"submit\" class=\"btn btn-primary\">\r\n");
      out.write("\t  社員登録完了</button>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/juso.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/join.js\"></script>\r\n");
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
