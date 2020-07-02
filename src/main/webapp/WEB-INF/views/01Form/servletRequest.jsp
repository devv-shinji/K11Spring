<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<script src="../common/jquery/jquery-3.5.1.js"></script>
<script>
$(function(){
	
});
</script>
</head>
<body>
	<h2>HttpServletRequest로 폼값 받기(Get방식)</h2>
	
	<ul>
		<li>아이디: ${id }</li>
		<li>패스워드: ${pw }</li>
		<li>메세지: ${message }</li>
		
		<br />
		
		<h3>FormController에서 저장한 내용을 꺼내자(리퀘스트영역에서 직접 꺼낸다)</h3>
		<h4>request.getParameter로도 받아올 수 있다. get방식으로 전달된 파라미터이니까!</h4>
		<h4><%=request.getParameter("id") %></h4>
		<h4><%=request.getParameter("pw") %></h4>
	</ul>
	
</body>
</html>