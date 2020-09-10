<%@page import="ch04.User"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String username=request.getParameter("username");
String password=request.getParameter("password");
String email = request.getParameter("email");
final String SQL="Insert into users(id,username,password,email) values(sival.nextval,?,?,?)";
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cos","bitc5600");
PreparedStatement pstmt = conn.prepareStatement(SQL);
pstmt.setString(1,username);
pstmt.setString(2, password);
pstmt.setString(3, email);
int result=pstmt.executeUpdate();
if(result==1){
	String sql1="select id from users where username like ?";
	ResultSet rs = null;
	pstmt =  conn.prepareStatement(sql1);
	pstmt.setString(1, username);
	rs =pstmt.executeQuery();
	if(rs.next()){
		int number =rs.getInt(1);
		User user =new User(number,username,password,email);
		request.setAttribute("user", user);
		RequestDispatcher dis = request.getRequestDispatcher("joinComplete.jsp");
		dis.forward(request, response);
	}else{
		response.sendRedirect("joinError.jsp");
	}
}
%>

</body>
</html>