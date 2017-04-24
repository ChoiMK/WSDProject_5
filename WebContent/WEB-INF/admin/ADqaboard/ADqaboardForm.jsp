<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시물 수정</title>
<script type="text/javascript">
$(function(){
	// 섬머노트를 div를 활용한 textarea에 추가.
	// http://summernote.org 활용
	$('#qa_content').summernote({
          lang: 'ko-KR',
         height: 150,
         codemirror: {
         theme: 'monokai'
      }
    });
	
	
	// 포커스 처리
    // $('#bo_content').summernote( {focus: true} );
    // 값 취득
//     $('#nt_content').summernote('code');
    // 값 추가
    // $('#bo_content').summernote('code', '<font color="red">추가글</font>');
    // 에디터 제거
    // $('#bo_content').summernote('destroy');
    
	  $('form').submit(function(){
		  if($('#qa_title').val() == ""){
				alert("제목을 입력해주세요");
				return false;
			}
  	 	var contentval = $('#qa_content').summernote('code');
  	 	$('form').append("<input type='textarea' name='qa_content' value='"+contentval+"'/>");
  	 	$('form').append("<input type='hidden' name='qa_writer' value='${LOGIN_MEMBERINFO.mem_id}'/>");
  	 	$('form').append("<input type='hidden' name='qa_nickname' value='${LOGIN_MEMBERINFO.mem_name}'/>");
  	 	
		var fileName1 = $("#file01").val()
		
		if(fileName1 != ""){
		    var ext = fileName1.slice(fileName1.lastIndexOf(".") + 1).toLowerCase();
		    if (!(ext == "gif" || ext == "jpg" || ext == "png" || ext == "jpeg")) {
		        alert("이미지파일 (.jpg, .png, .gif, .jpeg) 만 업로드 가능합니다.");
		        return false;
		    }
		 }
		
		var fileName2 = $("#file02").val()
		
		if(fileName2 != ""){
		    var ext = fileName2.slice(fileName2.lastIndexOf(".") + 1).toLowerCase();
		    if (!(ext == "gif" || ext == "jpg" || ext == "png" || ext == "jpeg")) {
		        alert("이미지파일 (.jpg, .png, .gif, .jpeg) 만 업로드 가능합니다.");
		        return false;
		    }
		 }
  	 	
    	});
    
	
	  $('#listBtn').click(function(){
			$(location).attr('href','${pageContext.request.contextPath}/adminQA/ADqaboardList.do');
			
		});
		
	  $('#resetBtn').click(function(){
			$(location).attr('href','${pageContext.request.contextPath}/adminQA/updateQABoard.do');
		});
});
</script>
</head>
<body>
<form class="form-horizontal" role="form" action="${pageContext.request.contextPath }/adminQA/insertQABoard.do" method="post">

<div class="wrap">
	<table width="1000" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td width="30">&nbsp;</td>
			<td width="790"> 
				<div id="container">
					<div class="title">Q&A</div>
					<table border="0" cellspacing="1" cellpadding="1">
						<tr>
						  <th>제목</th>
						  <td><input type="text" id="qa_title" name="qa_title" ></td>
						</tr>
						<tr>
						  <th>작성자</th>
						  <td><input type="text" class="form-control" id="qa_nickname" name="qa_nickname" placeholder="대화명 입력..." value="${LOGIN_MEMBERINFO.mem_name }" disabled="disabled">
						  </td>
						</tr>
						<tr>
						  <th>내용</th>
						  <td><div id="qa_content"><p>내용을 입력해주세요...</p></div> </td>
						</tr>
					</table>
					<table border="0" cellspacing="0" cellpadding="0">
					  <tr></tr>
					</table>
					<div style="text-align:right">
						<input class="btn2" type="submit" value="등록"/> 
						<input class="btn2" type="button" value="취소" id="resetBtn"/> 
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