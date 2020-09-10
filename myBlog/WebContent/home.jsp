<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>


<body>
	<form>
	  <button type="button"  onclick="start()">처음으로</button>   <button type="button" onclick="orderbypirce()">가격순</button> <button type="button" onclick="usernameCheck()">orderbysales</button>
	</form>
	<table id="abc" border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>종류</td>
			<td>가격</td>
			<td>판매수</td>

		</tr>


		<c:forEach var="fruitshops" items="${fruitshops}">
			<tr>

				<td>${fruitshops.fruitnumber}</td>
				<td>${fruitshops.fruit}</td>
				<td>${fruitshops.kind}</td>
				<td>${fruitshops.price}</td>
				<td>${fruitshops.sales}</td>
			</tr>


		</c:forEach>

			<c:forEach var="findOrderBy" items="${findOrderBy}">
			<tr>
				<td>${findOrderBy.fruitnumber}</td>
				<td>${findOrderBy.fruit}</td>
				<td>${findOrderBy.kind}</td>
				<td>${findOrderBy.price}</td>
				<td>${findOrderBy.sales}</td>
			</tr>


		</c:forEach>




	</table>

</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
function orderbypirce() {

	$.ajax({
		type:'post',
		url: "/myBlog/board?cmd=orderbypirce"
	}).done(function(result) {
		if(result ==1){


		}else if(result==0){
			var num=0;


		}

	}).fail(function(error){
		alert('ㅅㅂ 안댐 개같네');
	});

}

</script>
</html>

