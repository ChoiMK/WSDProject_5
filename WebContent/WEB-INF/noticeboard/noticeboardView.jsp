<%@ page language="JAVA" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 보기</title>
<!-- 이미지 슬라이드 사이즈 조정 -->
<style type="text/css">
.carousel{
	width:200px;
    height:150px;
    margin-left: 200px;
}
.carousel-inner > .item > img{
    width:200px;
    height:150px;
}       
</style>
<script>
$(function(){
	// 섬머노트를 div를 활용한 textarea에 추가.
	// http://summernote.org 활용
    $('#nt_content').summernote({
			height: 150,
			codemirror: {
			theme: 'monokai'
		}
    });
    
    $('#nt_content').summernote('code','${noticeInfo.nt_content}');

    
    $('form[name=updateForm]').submit(function(){
    	var val = $('#nt_content').summernote('code');
        $(this).append('<input type="hidden" name="nt_no" value="${noticeInfo.nt_no}"/>');
        $(this).append("<input type='hidden' name='nt_content' value='"+val+"'/>");
		$(this).append('<input type="hidden" name="nt_writer" value="${LOGIN_MEMBERINFO.mem_id}"/>');
		$(this).append('<input type="hidden" name="nt_nickname" value="${LOGIN_MEMBERINFO.mem_name}"/>');



        $(this).attr('action','${pageContext.request.contextPath}/noticeboard/updateNoticeinfo.do');
    });  
    
    $('#listBtn').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/noticeboard/noticeboardList.do');
	});
	
    $('#deleteBtn').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/noticeboard/deleteNoticeinfo.do?nt_no=${noticeInfo.nt_no}');
	});
});
</script>
</head>
<body>
<form class="form-horizontal" role="form" action="" method="post" name="updateForm">
	<div class="form-group">
		<label class="control-label col-sm-2" for="nt_title">제목:</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="nt_title" name="nt_title" value="${noticeInfo.nt_title }">
		</div>
	</div>
	<div class="form-group">
		<label class="control-label col-sm-2" for="nt_nickname">작성자 대화명:</label>
		<div class="col-sm-10">
<%-- 			<input type="hidden" name="nt_no" value="${noticeInfo.nt_no }">  --%>
			<input type="text" class="form-control" id="nt_nickname" name="nt_nickname" value="${noticeInfo.nt_nickname }" disabled="disabled">
		</div>
	</div>
	<div class="form-group">
		<label class="control-label col-sm-2" for="nt_content">내용:</label>
		<div class="col-sm-10"> 
			<div id="nt_content"><p></p></div>
		</div>
	</div>

	<div class="form-group"> 
		<div class="col-sm-offset-2 col-sm-10">
			<c:if test="${LOGIN_MEMBERINFO.mem_name == noticeInfo.nt_nickname }">
			<button type="button" class="btn btn-danger" id="deleteBtn">삭제</button>
			</c:if>
			<button type="button" class="btn btn-info" id="listBtn">목록</button>
			<c:if test="${LOGIN_MEMBERINFO.mem_name == noticeInfo.nt_nickname }">
			<button type="submit" class="btn btn-default" style="float: right">수정</button>
			</c:if>
		</div>
	</div>
</form>
</body>
</html>