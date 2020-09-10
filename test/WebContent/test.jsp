<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="https://openapi.naver.com/v1/papago/n2mt" method="post">
<input name="source" value="ko">
<input name="target" value="zh-CN">
<input name="text" value="안녕하세요.">
<input name="Accept" value="*/*">
<input name="X-Naver-Client-Id" value="41dwxZl81kpVk15BTU5j">
<input name="X-Naver-Client-Secret" value="TxQC_FmLuA">
<button>번역</button>
</form>
<div id="test1"></div>
</body>


</html>