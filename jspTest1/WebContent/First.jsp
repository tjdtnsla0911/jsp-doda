<%@page import="model.Drugstore"%>
<%@page import="dao.DrugstoreDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    DrugstoreDao dd= DrugstoreDao.getInstance();
    Drugstore ds1 = dd.getFirstLine();
    %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>약국정보</title>

</head>
<body>

<%= ds1.getName()

%>
<br>
<br>
<b>약국의 주소는 </b><%= ds1.getLoc() %>
<br>
<br>
<%
	if(ds1.getLoc().contains("서울")){

%>
<div id = "div1">ㅇㅇㅇㅇㅇㅇㅇ</div>
<%
	}
%>
<br>
<br>
<% out.println("이렇게도 출력가능합니다");%>
<script type="text/javascript">
var inputStirng =prompt('문자열을 입력하세요','안녕!');
alert(inputString);

</script>
</body>
</html>