<%@ page language="JAVA" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 등록</title>
<script>
$(function(){
	// 섬머노트를 div를 활용한 textarea에 추가.
	// http://summernote.org 활용
    $('#nt_content').summernote({
    		lang: 'ko-KR',
			height: 150,
			codemirror: {
			theme: 'monokai'
		}
    });
    // 포커스 처리
    // $('#bo_content').summernote( {focus: true} );
    // 값 취득
    // $('#bo_content').summernote('code');
    // 값 추가
    // $('#bo_content').summernote('code', '<font color="red">추가글</font>');
    // 에디터 제거
    // $('#bo_content').summernote('destroy');
    
	$('form[name=noticeForm]').submit(function(){
		if($('#nt_title').val() == ""){
    		alert("제목을 입력해주세요");
    		return false;
    	}
		 var content = $("#nt_content").summernote('code'); 
		  $(this).append("<input type='textarea' name='nt_content' value='"+content+"'/>"); 
		  $(this).append('<input type="hidden" name="nt_writer" value="${LOGIN_MEMBERINFO.mem_id}"/>');
		  $(this).attr('action','${pageContext.request.contextPath}/noticeboard/insertNoticeinfo.do');
	});
	
	$('#listBtn').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/noticeboard/noticeboardList.do');
	});
	
    $('#resetBtn').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/noticeboard/noticeboardForm.do');
	});
});
</script>
</head>
<body>
<form class="form-horizontal" role="form" action="" method="post" name="noticeForm">
	<div class="form-group">
		<label class="control-label col-sm-2" for="nt_title">제목:</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="nt_title" name="nt_title" placeholder="제목 입력...">
		</div>
	</div>
	<div class="form-group">
		<label class="control-label col-sm-2" for="nt_nickname">작성자 대화명:</label>
		<div class="col-sm-10"> 
			<input type="text" class="form-control" id="nt_nickname" name="nt_nickname" value="${LOGIN_MEMBERINFO.mem_name}">
		</div>
	</div>
	<div class="form-group">
		<label class="control-label col-sm-2" for="nt_content">내용:</label>
		<div class="col-sm-10"> 
			<div id="nt_content"><p>내용을 입력해주세요...</p></div>
		</div>
	</div>

	<div class="form-group"> 
		<div class="col-sm-offset-2 col-sm-10">
			<button type="submit" class="btn btn-info" style="float: right">등록</button>
			<button type="button" class="btn btn-danger" style="float: right" id="resetBtn">취소</button>
			<button type="button" class="btn btn-primary" style="float: right" id="listBtn">목록</button>
		</div>
	</div>
</form>
</body>
</html>