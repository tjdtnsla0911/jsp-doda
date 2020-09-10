<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    session.setAttribute("username", "1234");
    session.setAttribute("username", "5678");
	request.setAttribute("username", "ssar");
	request.setAttribute("username", "ssar2");

	RequestDispatcher dis =
			request.getRequestDispatcher("elTest2.jsp");
	dis.forward(request, response);
%>