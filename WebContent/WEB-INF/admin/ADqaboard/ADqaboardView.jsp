<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <script type="text/javascript">
$(function(){
		$('#qa_content').summernote({
			height: 150,
			codemirror: {
			theme: 'monokai'
		}
	});

		$('#qa_content').summernote('code','${qaboardInfo.qa_content}');
	    
	    $('form').submit(function(){
	    	var contentVal = $('#qa_content').summernote('code');
	    	$(this).append("<input type='textarea' name='qa_content' value='"+contentVal+"'/>");
	    	$(this).append('<input type="hidden" name="qa_no" value="${qaboardInfo.qa_no}"/>');
	    	$(location).attr('href','${pageContext.request.contextPath}/admin/ADqaboard/ADupdateQABoardInfo.do');
	    });
	    
	    $('#reply').click(function(){
	    	var $frm = $('<form action="${pageContext.request.contextPath }/adminQA/ADqaboardReplyForm.do" method="post"/>');
	    	$frm.append('<input type="hidden" name="qa_no" value="${qaboardInfo.qa_no}"/>');
	    	$frm.append('<input type="hidden" name="rnum" value="${param.rnum}"/>');
	    	$frm.append('<input type="hidden" name="qa_writer" value="${LOGIN_MEMBERINFO.mem_id}"/>');
	    	$frm.append('<input type="hidden" name="qa_nickname" value="${LOGIN_MEMBERINFO.mem_name}"/>');
	    	$(document.body).append($frm);
	    	$frm.submit();
	    });
	    
	    $('#mainBtn').click(function(){
	    	$(location).attr('href','${pageContext.request.contextPath}/adminQA/ADqaboardList.do');
	    });
	    
// 	    $('#insert').click(function(){
// 	    });
	    
	    $('#delete').click(function(){
	    	$(location).attr('href','${pageContext.request.contextPath}/adminQA/deleteQABoard.do?qa_no=${qaboardInfo.qa_no}');
	    });
});

</script>
<title>게시물 보기</title>
</head>
<body>
<form id="test" class="form-horizontal" role="form" action="${pageContext.request.contextPath }/adminQA/updateQABoard.do" method="post">
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
						  <td><label class="qa_title"></label>
							<input type="text" id="qa_title" name="qa_title" value="${qaboardInfo.qa_title }">
						  
						  </td>
						</tr>
						<tr>
						  <th>작성자</th>
						  <td><label class="qa_nickname"></label>
							<input type="hidden" id="qa_nickname" name="qa_nickname" value="${qaboardInfo.qa_nickname }">
						  	${qaboardInfo.qa_nickname }
						  </td>
						</tr>
						<tr>
						  <th>내용</th>
						  <td><div id="qa_content"><p>내용을 입력해주세요...</p></div></td>
						</tr>
<!-- 						<tr> -->
<!-- 						  <th>IP Addr.</th> -->
<!-- 						  <td><label class="bo_ip"></label></td> -->
<!-- 						</tr> -->
					</table>
					<div style="text-align:right">
						<input class="btn2" type="submit" value="수정" />
						<input class="btn2" type="button" value="답글" id="reply" />
						<input class="btn2" type="button" value="삭제" id="delete"/> 
						<input class="btn2" type="button" value="목록" id="mainBtn"/>
					</div>
				</div>
			</td>
		</tr>
	</table>
</div>
</form>
</body>
</html>