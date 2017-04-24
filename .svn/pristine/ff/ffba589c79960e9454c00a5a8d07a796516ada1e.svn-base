<%@ page language="JAVA" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Q&A 정보</title>
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
    $('#qa_content').summernote({
			height: 150,
			codemirror: {
			theme: 'monokai'
		}
    });
    $('#qa_content').summernote('code','${qaboardInfo.qa_content}');
    
    $('form').submit(function(){
    	var contentVal = $('#qa_content').summernote('code');
    	$(this).append('<input type="textarea" name="qa_content" value="'+contentVal+'"/>');
    	$(this).append('<input type="hidden" name="qa_no" value="${qaboardInfo.qa_no}"/>');
    });
    
    $('#reply').click(function(){
    	var $frm = $('<form action="${pageContext.request.contextPath }/userQA/qaboardReplyForm.do" method="post"/>');
    	$frm.append('<input type="hidden" name="qa_no" value="${qaboardInfo.qa_no}"/>');
    	$frm.append('<input type="hidden" name="rnum" value="${param.rnum}"/>');
    	$frm.append('<input type="hidden" name="qa_writer" value="${LOGIN_MEMBERINFO.mem_id}"/>');
    	$frm.append('<input type="hidden" name="qa_nickname" value="${LOGIN_MEMBERINFO.mem_name}"/>');
    	$(document.body).append($frm);
    	$frm.submit();
    });
    
    $('#mainBtn').click(function(){
    	$(location).attr('href','${pageContext.request.contextPath}/userQA/qaboardList.do');
    });
    
    $('#insert').click(function(){
    	$(location).attr('href','${pageContext.request.contextPath}/userQA/qaboardForm.do');
    });
    
    $('#delete').click(function(){
    	$(location).attr('href','${pageContext.request.contextPath}/userQA/deleteQABoard.do?qa_group=${qaboardInfo.qa_group}');
    });
});
</script>
</head>
<body>
<form id="test" class="form-horizontal" role="form" action="${pageContext.request.contextPath }/userQA/updateQABoard.do" method="post">
	<div class="form-group">
		<input type="hidden" name="rnum" value="${qaboardInfo.rnum }">
		<label class="control-label col-sm-2" for="qa_title">제목:</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="qa_title" name="qa_title" value="${qaboardInfo.qa_title }">
		</div>
	</div>
	<div class="form-group">
		<label class="control-label col-sm-2" for="qa_nickname">작성자 대화명:</label>
		<div class="col-sm-10"> 
			<input type="text" class="form-control" id="qa_nickname" name="qa_nickname" value="${qaboardInfo.qa_nickname }">
		</div>
	</div>
	<div class="form-group">
		<label class="control-label col-sm-2" for="qa_content">내용:</label>
		<div class="col-sm-10"> 
			<div id="qa_content"><p></p></div>
		</div>
	</div>
	<div class="form-group"> 
		<div class="col-sm-offset-2 col-sm-10">
			<button type="button" class="btn btn-success" id="insert">글쓰기</button>
			<c:if test="${LOGIN_MEMBERINFO.mem_name == qaboardInfo.qa_nickname }">
			<button type="button" class="btn btn-danger" id="delete">삭제</button>
			</c:if>
			<button type="button" class="btn btn-primary" id="reply" onclick="reply">답글</button>
			<button type="button" class="btn btn-info" id="mainBtn">목록</button>
			<c:if test="${LOGIN_MEMBERINFO.mem_name == qaboardInfo.qa_nickname }">
			<button type="submit" class="btn btn-default" style="float: right">수정</button>
			</c:if>
			
		</div>
	</div>
</form>
</body>
</html>