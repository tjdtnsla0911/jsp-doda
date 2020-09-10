<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../include/nav.jsp"%>
<div class="container">
	<form action="/blog/user?cmd=joinProc" method="POST" class="was-validated" onsubmit="return validate()">
		<div class="form-group">
			<label for="username">Username:</label>
			<button type="button" class="btn btn-warning float-right" onclick="usernameCheck()">중복확인</button>
			<input type="text" class="form-control" id="username" placeholder="Enter username" name="username" required>

			<div class="valid-feedback">Valid.</div>
			<div class="invalid-feedback">Please fill out this field.</div>
		</div>

		<div class="form-group">
			<label for="password">Password:</label> <input type="password" class="form-control" id="password"
				placeholder="Enter password" name="password" required>
			<div class="valid-feedback">Valid.</div>
			<div class="invalid-feedback">Please fill out this field.</div>
		</div>

		<div class="form-group">
			<label for="email">Email:</label> <input type="email" class="form-control" id="email" placeholder="Enter email"
				name="email" required>
			<div class="valid-feedback">Valid.</div>
			<div class="invalid-feedback">Please fill out this field.</div>
		</div>

		<div class="form-group">
			<label for="address">Address:</label>
			<!-- 버튼타입으로 만들거면 button 이라고 명시해야 안헷갈림 , inline block 이므로 float로 위치 조정 -->
			<button type="button" class="btn btn-warning float-right" onclick="goPopup()">주소검색</button>
			<input type="text" class="form-control" id="address" placeholder="Enter address" name="address" required readonly>
			<div class="valid-feedback">Valid.</div>
			<div class="invalid-feedback">Please fill out this field.</div>
		</div>

		<button type="submit" class="btn btn-primary">회원가입 완료</button>
	</form>
</div>
<script>
function goPopup(){
	var pop = window.open("/blog/juso/jusoPopup.jsp","pop","width=570,height=420, scrollbars=yes, resizable=yes");
}
function jusoCallBack(roadFullAddr){
	var tfAddress = document.querySelector("#address");
	//클래스 는 .으로찾고  태그로찾기 input 여러개는 querySelectorAll('input')
	tfAddress.value = roadFullAddr;
	// document.form.roadFullAddr.value = roadFullAddr;
}
</script>
<script>

</script>

<%@ include file="../include/footer.jsp"%>


