<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script> -->
<script type="text/javascript">
$(function(){
		$('#nt_content').summernote({
			height: 150,
			codemirror: {
			theme: 'monokai'
		}
	});

	$('#nt_content').summernote('code','${noticeInfo.nt_content}');


	$('form[name=ADUpdateForm]').submit(function(){
		var val = $('#nt_content').summernote('code');
	    $(this).append('<input type="hidden" name="nt_no" value="${noticeInfo.nt_no}"/>');
	    $(this).append("<input type='hidden' name='nt_content' value='"+val+"'/>");
		$(this).append('<input type="hidden" name="nt_writer" value="${LOGIN_MEMBERINFO.mem_id}"/>');
		$(this).append('<input type="hidden" name="nt_nickname" value="${LOGIN_MEMBERINFO.mem_name}"/>');
	
	
	
	    $(this).attr('action','${pageContext.request.contextPath}/ADNotice/ADupdateNoticeinfo.do');
	});  

	
	$('#listBtn').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/ADNotice/ADNoticeList.do');
	});
	
	$('#deleteBtn').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/ADNotice/ADdeleteNoticeinfo.do?nt_no=${noticeInfo.nt_no}');
	});
});

</script>
<title>게시물 보기</title>
</head>
<body>
<form action="" method="post" name="ADUpdateForm">
<div class="wrap">
	<table width="1000" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td width="790"> 
				<div id="container">
					<div class="title">공지사항</div>
					<table border="0" cellspacing="1" cellpadding="1">
						<tr>
						  <th>제목</th>
						  <td><label class="nt_title"></label>
							<input type="text" id="nt_title" name="nt_title" value="${noticeInfo.nt_title }">
						  
						  </td>
						</tr>
						<tr>
						  <th>작성자</th>
						  <td><label class="nt_nickname"></label>
<%-- 						  	<input type="hidden" name="nt_no" value="${noticeInfo.nt_no }">  --%>
							<input type="text" id="nt_nickname" name="nt_nickname" value="${noticeInfo.nt_nickname }" disabled="disabled">
						  
						  </td>
						</tr>
						<tr>
						  <th>내용</th>
						  <td><div id="nt_content"><p>내용을 입력해주세요...</p></div></td>
						</tr>
<!-- 						<tr> -->
<!-- 						  <th>IP Addr.</th> -->
<!-- 						  <td><label class="bo_ip"></label></td> -->
<!-- 						</tr> -->
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