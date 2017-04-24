<%@ page language="JAVA" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript">
$(function(){
	$('#qaBoard').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/userQA/qaboardList.do');
	});
	
	$('#reference').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/referenceboard/referenceList.do');
	});
	

	$('#noticeBoard').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/noticeboard/noticeboardList.do');
	});
	
	$('#freeBoard').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/freeboard/freeboardList.do');
	});
});
</script>
<title>Insert title here</title>
</head>
<body>
<!--BEGIN SIDEBAR MENU-->
<nav id="sidebar" role="navigation" data-step="2"
	data-intro="Template has &lt;b&gt;many navigation styles&lt;/b&gt;"
	data-position="right" class="navbar-default navbar-static-side">
	<div class="sidebar-collapse menu-scroll">
		<ul id="side-menu" class="nav">
			<div class="clearfix"></div>
			<li class="">
				<a href="#">
					<i class="fa fa-tachometer fa-fw"><div class="icon-bg bg-orange"></div></i>
					<span class="menu-title" id="noticeBoard">공지사항</span>
				</a>
			</li>
			<li>
				<a href="#">
					<i class="fa fa-desktop fa-fw"><div class="icon-bg bg-pink"></div></i>
					<span class="menu-title" id="freeBoard">자유게시판</span>
				</a>
			</li>
			<li>
				<a href="#">
					<i class="fa fa-send-o fa-fw"><div class="icon-bg bg-green"></div></i>
					<span class="menu-title" id="reference">자료실</span>
				</a>
			</li>
			<li>
				<a href="#">
					<i class="fa fa-edit fa-fw"><div class="icon-bg bg-violet"></div></i>
					<span class="menu-title" id="qaBoard">Q&A게시판</span>
				</a>
			</li>
<!-- 			<li> -->
<!-- 				<a href="#"> -->
<!-- 					<i class="fa fa-th-list fa-fw"><div class="icon-bg bg-blue"></div></i> -->
<!-- 					<span class="menu-title">자주하는질문</span> -->
<!-- 				</a> -->
<!-- 			</li> -->
<!-- 			<li> -->
<!-- 				<a href="#"> -->
<!-- 					<i class="fa fa-database fa-fw"><div class="icon-bg bg-red"></div></i> -->
<!-- 					<span class="menu-title">정보마당</span> -->
<!-- 				</a> -->
<!-- 			</li>  -->
		</ul>
	</div>
</nav>
</body>
</html>