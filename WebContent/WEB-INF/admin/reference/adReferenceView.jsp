<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<style type="text/css">
.carousel{
	width:200px;
    height:150px;
    margin-left: 200px;
}  
</style>
<script type="text/javascript">
$(function(){
	$('#ref_content').summernote({
		height: 150,
		codemirror: {
		theme: 'monokai'
	}
});

	$('#ref_content').summernote('code','${referenceInfo.ref_content}');


	$('form[name=ADUpdateForm]').submit(function(){
		var val = $('#ref_content').summernote('code');
	    $(this).append('<input type="hidden" name="ref_no" value="${referenceInfo.ref_no}"/>');
	    $(this).append("<input type='textarea' name='ref_content' value='"+val+"'/>");
	    $(this).append('<input type="hidden" name="ref_nickname" value="${LOGIN_MEMBERINFO.mem_name}"/>');
	    $(this).append('<input type="hidden" name="ref_writer" value="${LOGIN_MEMBERINFO.mem_id}"/>');
		$(this).attr('action','${pageContext.request.contextPath}/admin/reference/updateADReferenceInfo.do');
		
	});  

	
	$('#listBtn').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/admin/reference/adReferenceList.do');
	});
	
	$('#deleteBtn').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/admin/reference/deleteADReferenceInfo.do?ref_no=${referenceInfo.ref_no}');
	});
});

</script>
<title>게시물 보기</title>
</head>
<body>
<form action="" method="post" name="ADUpdateForm">
<jsp:include page="../inc/header.jsp"></jsp:include>
<div class="wrap">
	<table width="1000" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td width="180"><jsp:include page="adReferenceMenu.jsp"></jsp:include></td>
			<td width="30">&nbsp;</td>
			<td width="790"> 
				<div id="container">
					<div class="title">자료실</div>
					<table border="0" cellspacing="1" cellpadding="1">
						<tr>
						  <th>제목</th>
						  <td><label class="ref_title"></label>
						  <input type="text" id="ref_title" name="ref_title" value="${referenceInfo.ref_title }">
						  </td>
						</tr>
						<tr>
						  <th>작성자</th>
						  <td><label class="ref_writer"></label>
						  <input type="hidden" name="ref_no" value="${referenceInfo.ref_no }"> 
							<input type="text" id="ref_writer" name="ref_writer" value="${referenceInfo.ref_writer }" disabled="disabled">
						  </td>
						</tr>
						<tr>
						  <th>내용</th>
						  <td><div id="ref_content"><p>내용을 입력해주세요</p></div></td>
						</tr>
						<tr>
						  <th>첨부파일</th>
						  <td><div class="col-sm-10"> 
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
	
			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox" style="height: 200px;">
			<c:forEach items="${referenceInfo.attachFileRoomList}" var="fileItem" varStatus="stat">
				<c:if test="${stat.first }">
					<div class="item active">
				</c:if>
				<img src="http://localhost/file/${fileItem.file_save_name}" alt="pic${stat.count}"
					onclick="javascript:location.href='${pageContext.request.contextPath}/user/referenceboard/fileDownload.do?fileSeq=${fileItem.file_seq}'">
				</div>
			</c:forEach>
			</div>
			
		</div></td>
						</tr>
					</table>
					<div style="text-align:right">
						<input class="btn2" type="submit" value="수정"/> 
						<input class="btn2" type="button" value="삭제" id="deleteBtn"/> 
						<input class="btn2" type="button" value="목록" id="listBtn"/>
					</div>
				</div>
			</td>
		</tr>
	</table>
</div>
</form>
</body>
</html>