/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.55
 * Generated at: 2020-07-03 05:49:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rirekishou_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".img_wrap {\r\n");
      out.write("\twidth: 300px;\r\n");
      out.write("\tmargin-top: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".img_wrap img {\r\n");
      out.write("\tmax-width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ok {\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tborder-right: 0px;\r\n");
      out.write("\tborder-top: 0px;\r\n");
      out.write("\tboder-left: 0px;\r\n");
      out.write("\tboder-bottom: 0px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>이력서</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"/doda/doda?cmd=rirekishouProc\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t<input type=\"file\" id=\"input_img\" name=\"img\"><br />\r\n");
      out.write("\t\t<table border=\"1\" width=\"1106\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td rowspan=\"5\" width=\"130\" height=\"113\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"img_wrap\">\r\n");
      out.write("\t\t\t\t\t\t<img id=\"img\" />\r\n");
      out.write("\t\t\t\t\t</div> <br />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<th colspan=\"9\" height=\"50\"><font size=\"5\">이 력 서</font></th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th rowspan=\"3\" width=\"65\" height=\"70\" bgcolor=\"D5D5D5\">성 명</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th colspan=\"2\" bgcolor=\"D5D5D5\">한글</th>\r\n");
      out.write("\t\t\t\t<td width=\"90\"><input class=\"ok\" type=\"text\" id=\"koreaname\" name=\"koreaname\" value=\"홍길동\"></td>\r\n");
      out.write("\t\t\t\t<th bgcolor=\"D5D5D5\">생년월일</th>\r\n");
      out.write("\t\t\t\t<th colspan=\"2\" width=\"80\" bgcolor=\"D5D5D5\">이메일</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th colspan=\"2\" bgcolor=\"D5D5D5\">한 문</th>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"kanjiname\" name=\"kanjiname\" class=\"ok\" value=\"気持ちいい\"></td>\r\n");
      out.write("\t\t\t\t<td><input class=\"ok\" type=\"text\" id=\"birthday\" name=\"birthday\" value=\"생년월일\"></td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\"><input class=\"ok\" type=\"email\" id=\"email\" name=\"email\" value=\"이메일\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th colspan=\"2\" width=\"40\" id=bgcolor=\"D5D5D5\">연 락 처</th>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\"><input type=\"text\" id=\"tell\" name=\"tell\" class=\"ok\" value=\"000-000-0000\"></td>\r\n");
      out.write("\t\t\t\t<th colspan=\"2\" width=\"40\" bgcolor=\"D5D5D5\">긴급 연락처(핸드폰)</th>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\"><input type=\"text\" id=\"tell2\" name=\"tell2\" class=\"ok\" value=\"000-000-0000\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th bgcolor=\"D5D5D5\">현 주 소</th>\r\n");
      out.write("\t\t\t\t<td colspan=\"8\"><input type=\"text\" id=\"address\" name=\"address\" class=\"ok\" value=\"부산대역\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<table border=\"1\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th colspan=\"6\" width=\"790\" bgcolor=\"D5D5D5\">학 력 사 항</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th bgcolor=\"D5D5D5\">학위과정</th>\r\n");
      out.write("\t\t\t\t<th bgcolor=\"D5D5D5\">기 간</th>\r\n");
      out.write("\t\t\t\t<th bgcolor=\"D5D5D5\">학 교 명</th>\r\n");
      out.write("\t\t\t\t<th bgcolor=\"D5D5D5\">전 공</th>\r\n");
      out.write("\t\t\t\t<th bgcolor=\"D5D5D5\">졸업날짜</th>\r\n");
      out.write("\t\t\t\t<th bgcolor=\"D5D5D5\">비고사항</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"kauki1\" name=\"kauki1\" class=\"ok\" value=\"학위과정입력\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><input type=\"text\" id=\"kigen1\" name=\"kigen1\" class=\"ok\" value=\"기간을 입력해주세요\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"right\"><input type=\"text\" id=\"gatko1\" name=\"gatko1\" class=\"ok\" value=\"고등학교\"></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"senko1\" name=\"senko1\" class=\"ok\" value=\"전공입력\"></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"sotugyou1\" name=\"sotugyou1\" class=\"ok\" value=\"졸업날입력\"></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"bigo1\" name=\"bigo1\" class=\"ok\" value=\"비고\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"kauki2\" name=\"kauki2\" class=\"ok\" value=\"학위과정입력\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><input type=\"text\" id=\"kigen2\" name=\"kigen2\" class=\"ok\" value=\"기간을 입력해주세요\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"right\"><input type=\"text\" id=\"gatko2\" name=\"gatko2\" class=\"ok\" value=\"대학교\"></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"senko2\" name=\"senko2\" class=\"ok\" value=\"전공입력\"></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"sotugyou2\" name=\"sotugyou2\" class=\"ok\" value=\"졸업날입력\"></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"bigo2\" name=\"bigo2\" class=\"ok\" value=\"비고\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"kauki3\" name=\"kauki3\" class=\"ok\" value=\"학위과정입력\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><input type=\"text\" id=\"kigen3\" name=\"kigen3\" class=\"ok\" value=\"기간을 입력해주세요\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"right\"><input type=\"text\" id=\"gatko3\" name=\"gatko3\" class=\"ok\" value=\"대학원\"></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"senko3\" name=\"senko3\" class=\"ok\" value=\"전공입력\"></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"sotugyou3\" name=\"sotugyou3\" class=\"ok\" value=\"졸업날입력\"></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"bigo3\" name=\"bigo3\" class=\"ok\" value=\"비고\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th colspan=\"6\" bgcolor=\"D5D5D5\">전 공 경 력 사 항</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th width=\"180\" bgcolor=\"D5D5D5\">근무년월</th>\r\n");
      out.write("\t\t\t\t<th width=\"200\" bgcolor=\"D5D5D5\">기 간</th>\r\n");
      out.write("\t\t\t\t<th width=\"100\" bgcolor=\"D5D5D5\">근 무 처</th>\r\n");
      out.write("\t\t\t\t<th width=\"100\" bgcolor=\"D5D5D5\">직 위</th>\r\n");
      out.write("\t\t\t\t<th colspan=\"2\" width=\"70\" bgcolor=\"D5D5D5\">자 격 증</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><input type=\"text\" class=\"ok\" id=\"keireki1\" name=\"keireki1\" value=\"년 &nbsp;&nbsp;&nbsp;개월\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><input type=\"text\" class=\"ok\" id=\"keirekikigen1\" name=\"keirekikigen1\" value=\"기간입력\"></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" class=\"ok\" id=\"kinmu1\" name=\"kinmu1\" value=\"근무한곳\"></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" class=\"ok\" id=\"level1\" name=\"level1\" value=\"직급\"></td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\"><input type=\"text\" class=\"ok\" id=\"sikaku1\" name=\"sikaku1\" value=\"자격증\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><input type=\"text\" class=\"ok\" id=\"keireki2\" name=\"keireki2\" value=\"년 &nbsp;&nbsp;&nbsp;개월\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><input type=\"text\" class=\"ok\" id=\"keirekikigen2\" name=\"keirekikigen2\" value=\"기간입력\"></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" class=\"ok\" id=\"kinmu2\" name=\"kinmu2\" value=\"근무한곳\"></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" class=\"ok\" id=\"level2\" name=\"level2\" value=\"직급\"></td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\"><input type=\"text\" class=\"ok\" id=\"sikaku2\" name=\"sikaku2\" value=\"자격증\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><input type=\"text\" class=\"ok\" id=\"keireki3\" name=\"keireki3\" value=\"년 &nbsp;&nbsp;&nbsp;개월\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><input type=\"text\" class=\"ok\" id=\"keirekikigen3\" name=\"keirekikigen3\" value=\"기간입력\"></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" class=\"ok\" id=\"kinmu3\" name=\"kinmu3\" value=\"근무한곳\"></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" class=\"ok\" id=\"level3\" name=\"level3\" value=\"직급\"></td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\"><input type=\"text\" class=\"ok\" id=\"sikaku3\" name=\"sikaku3\" value=\"자격증\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th bgcolor=\"D5D5D5\">참 고 사 항</th>\r\n");
      out.write("\t\t\t\t<td colspan=\"5\"><input type=\"text\" class=\"ok\" id=\"sanko\" name=\"sanko\" value=\"참고사항\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"6\">\r\n");
      out.write("\t\t\t\t\t<p style=\"text-align: center\">위 기재 사항은 사실과 틀림이 없습니다.</p> <br /> <br />\r\n");
      out.write("\t\t\t\t\t<p style=\"text-align: center\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"day\" name=\"day\" class=\"ok\" value=\"20  년  월  일\">\r\n");
      out.write("\t\t\t\t\t</p> <br /> <br />\r\n");
      out.write("\t\t\t\t\t<p style=\"text-align: right\">(인)&nbsp;&nbsp;&nbsp;</p>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<br /> <br /> <input type=\"hidden\" id=\"userid\" name=\"userid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prinsipal.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> <input type=\"submit\"\r\n");
      out.write("\t\t\tvalue=\"이력서제출\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar sel_file;\r\n");
      out.write("\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\"#input_img\").on(\"change\", handleImgFileSelect);\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction handleImgFileSelect(e) {\r\n");
      out.write("\t\tvar files = e.target.files;\r\n");
      out.write("\t\tvar filesArr = Array.prototype.slice.call(files);\r\n");
      out.write("\r\n");
      out.write("\t\tfilesArr.forEach(function(f) {\r\n");
      out.write("\t\t\tif (!f.type.match(\"image.*\")) {\r\n");
      out.write("\t\t\t\talert(\"확장자는 이미지 확장자만 가능합니다.\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tsel_file = f;\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar reader = new FileReader();\r\n");
      out.write("\t\t\treader.onload = function(e) {\r\n");
      out.write("\t\t\t\t$(\"#img\").attr(\"src\", e.target.result);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treader.readAsDataURL(f);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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