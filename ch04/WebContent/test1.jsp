<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>랜덤 값 알아보기</title>
</head>
<body>
안녕
<%
Random  r = new Random();
int num= r.nextInt(5);//0~4
String name = "黒っぽい";
%>
<h1>랜덤 값은 : <%=num %></h1>
<h1>랜덤 값은 : <%=name %></h1>


</body>
</html>