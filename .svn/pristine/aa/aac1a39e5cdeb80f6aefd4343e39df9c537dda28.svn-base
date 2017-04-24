<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시물 수정</title>
<!-- <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script> -->
<script type="text/javascript">
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
//     $('#nt_content').summernote('code');
    // 값 추가
    // $('#bo_content').summernote('code', '<font color="red">추가글</font>');
    // 에디터 제거
    // $('#bo_content').summernote('destroy');
    
	$('form').submit(function(){
		if($('#nt_title').val() == ""){
			alert("제목을 입력해주세요");
			return false;
		}
		var content = $('#nt_content').summernote('code');
		 $(this).append('<input type="hidden" name="nt_content" value="'+content+'">');
		 $(this).append('<input type="hidden" name="nt_writer" value="${LOGIN_MEMBERINFO.mem_id}"/>');
// 	  	 $(this).append("<input type='hidden' name='nt_nickname' value='${LOGIN_MEMBERINFO.mem_name}'/>");

	});
	
	$('#listBtn').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/ADNotice/ADNoticeList.do');
		
	});
	
    $('#resetBtn').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/ADNotice/ADNoticeForm.do');
	});
});
</script>
</head>
<body>
<form role="form" action="${pageContext.request.contextPath }/ADNotice/ADinsertNoticeinfo.do" method="post" >
<div class="wrap">
	<table width="1000" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td width="790"> 
				<div id="container">
					<div class="title">공지사항</div>
					<table border="0" cellspacing="1" cellpadding="1">
						<tr>
						  <th>제목</th>
						  <td><input type="text" id="nt_title" name="nt_title" ></td>
						</tr>
						<tr>
						  <th>작성자</th>
						  <td><input type="text" name="nt_nickname" id="nt_nickname" value="${LOGIN_MEMBERINFO.mem_name}" ></td>
						</tr>
						<tr>
						  <th>내용</th>
						  <td><div id="nt_content"><p>내용을 입력해주세요...</p></div> </td>
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