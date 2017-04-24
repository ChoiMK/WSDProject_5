<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
$(function(){
	$('#ADReference').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/admin/reference/adReferenceList.do');
	});
});
</script>
</head>
<body>
	<div id="left_menu">
		<div class="tt">자료실 관리</div>
		<ul>
			<li><a href="#" id="ADReference">자료실</a></li>
		</ul>
	</div>
</body>
</html>