<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <button type="button"  onclick="start()">처음으로</button>
      <button type="button" onclick="price()">가격순</button>
         <button type="button" onclick="orders()">판매순</button>

	<table id="table" border="1">

		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>종류</td>
			<td>가격</td>
			<td>판매수</td>
		</tr>
		<c:forEach var="fruits" items="${fruits}">
			<tr>

					<td>${fruits.fruitnumber}</td>
					<td>${fruits.name}</td>
					<td>${fruits.kind}</td>
					<td>${fruits.price}</td>
					<td>${fruits.sales}</td>

			</tr>
		</c:forEach>
	</table>

</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
function price(){

	$.ajax({
		type: 'get',
		url: `/blog3/board?cmd=Orderprice`
	}).done(function(result){
		console.log(result);
		alert(result);
		if(result == 1){
			$("#table").empty
			alert('꺼져라.');

		}else if(result == 0){
			alert('사용하실 수 있는 아이디입니다.');
			isCheckedUsername = true;
		}else{
			console.log('develop : 서버 오류');
		}
	}).fail(function(error){
		alert('에러 ㅅㅂ');
	});
}


	</script>
</html>