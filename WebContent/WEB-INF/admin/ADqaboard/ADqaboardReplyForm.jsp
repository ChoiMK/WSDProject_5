<%@ page language="JAVA" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Q&A 댓글등록</title>
<script type="text/javascript">
$(function(){
	// 섬머노트를 div를 활용한 textarea에 추가.
	// http://summernote.org 활용
    $('#qa_content').summernote({
			height: 150,
			codemirror: {
			theme: 'monokai'
		}
    });
    
    $('form').submit(function(){
    	if($('#qa_title').val() == ""){
			alert("제목을 입력해주세요");
			return false;
		}
    	var contentVal = $('#qa_content').summernote('code');
   		$(this).append("<input type='hidden' name='qa_content' value='"+contentVal+"'/>");
    	$(this).append('<input type="hidden" name="qa_writer" value="${LOGIN_MEMBERINFO.mem_id}"/>');
    	$(this).append('<input type="hidden" name="qa_nickname" value="${LOGIN_MEMBERINFO.mem_name}"/>');
		$(this).append('<input type="hidden" name="qa_group" value="${qaboardInfo.qa_group }"/>');
		$(this).append('<input type="hidden" name="qa_seq" value="${qaboardInfo.qa_seq }"/>');
		$(this).append('<input type="hidden" name="qa_depth" value="${qaboardInfo.qa_depth }"/>');
    });
    
    $('#cancleBtn').click(function(){
    	$(location).attr('href','${pageContext.request.contextPath}/adminQA/ADqaboardReplyForm.do');
    });
    
    $('#listBtn').click(function(){
    	$(location).attr('href','${pageContext.request.contextPath}/adminQA/ADqaboardList.do');
    });
});
</script>
</head>
<body>
<div class="wrap">
	<table width="1000" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td width="30">&nbsp;</td>
			<td width="790"> 
				<div id="container">
					<div class="title">Q&A</div>
					<div class="row">
	 <div class="col-sm-3">
		 <label class="col-sm-2 control-label">No:</label>
  		 <p class="form-control-static">${param.rnum }</p>
	 </div>
	 <div class="col-sm-8">
	 	<label class="col-sm-2 control-label">제목 :</label>
    	<p class="form-control-static">${qaboardInfo.qa_title }</p>
	 </div>
	 <div class="col-sm-1">
	 	<p class="text-right text-danger bg-danger">${LOGIN_MEMBERINFO.mem_name }의 댓글</p>
	 </div>
</div>
<hr />
	<form class="form-horizontal" role="form" action="${pageContext.request.contextPath }/adminQA/insertQAReply.do" method="post">
		<div class="form-group">
			<label class="control-label col-sm-2" for="qa_title">제목:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="qa_title" name="qa_title" value="">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="qa_nickname">작성자 대화명:</label>
			<div class="col-sm-10"> 
				<input type="text" class="form-control" id="qa_nickname" name="qa_nickname" value="${LOGIN_MEMBERINFO.mem_name }" disabled="disabled">
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
				<button type="submit" class="btn2" style="float: right;">답글등록</button>
				<button type="button" class="btn2" id="cancleBtn">취소</button>
				<button type="button" class="btn2" id="listBtn">목록</button>
			</div>
		</div>
	</form>
			</div>
				
			</td>
		</tr>
	</table>
</div>
</body>
</html>