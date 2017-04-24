<%@ page language="JAVA" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시글 등록</title>
<script>
$(function(){
	// 섬머노트를 div를 활용한 textarea에 추가.
	// http://summernote.org 활용
    $('#bo_content').summernote({
    		lang: 'ko-KR',
			height: 150,
			codemirror: {
			theme: 'monokai'
		}
    });
    // 포커스 처리
    // $('#bo_content').summernote( {focus: true} );
    // 값 취득
    // 값 추가
    // $('#bo_content').summernote('code', '<font color="red">추가글</font>');
    // 에디터 제거
    // $('#bo_content').summernote('destroy');
    
    $('form').submit(function(){
  	 	var contentval = $('#bo_content').summernote('code');
  	 	$('form').append("<input type='textarea' name='qa_content' value='"+contentval+"'/>");
  	 	$('form').append("<input type='hidden' name='qa_writer' value='${LOGIN_MEMBERINFO.mem_id}'/>");
  	 	$('form').append("<input type='hidden' name='qa_nickname' value='${LOGIN_MEMBERINFO.mem_name}'/>");
  	 	
    });
    
    $('#listBtn').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/user/qaboard/qaboardList.do');
	});
	
    $('#resetBtn').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/user/qaboard/qaboardForm.do');
	});

});
</script>
</head>
<body>
<form class="form-horizontal" role="form" action="${pageContext.request.contextPath }/user/qaboard/insertQABoardInfo.do" method="post">
	<div class="form-group">
		<label class="control-label col-sm-2" for="qa_title">제목:</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="qa_title" name="qa_title" placeholder="제목 입력...">
		</div>
	</div>
	<div class="form-group">
		<label class="control-label col-sm-2" for="bo_nickname">작성자 대화명:</label>
		<div class="col-sm-10"> 
			<input type="text" class="form-control" id="qa_nickname" name="qa_nickname" placeholder="대화명 입력..." value="${LOGIN_MEMBERINFO.mem_name }" disabled="disabled">
		</div>
	</div>
	<div class="form-group">
		<label class="control-label col-sm-2" for="bo_content">내용:</label>
		<div class="col-sm-10"> 
			<div id="bo_content"><p>내용을 입력해주세요...</p></div>
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