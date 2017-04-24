<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시물 수정</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
$(function(){
	// 섬머노트를 div를 활용한 textarea에 추가.
	// http://summernote.org 활용
	$('#ref_content').summernote({
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
    
	$('form[name=ADnoticeForm]').submit(function(){
		var flag = true;
		
		if(!fileNameConfirm($('#file01').val()));
		
		
		var val = $('#ref_content').summernote('code');
		 $(this).append('<input type="hidden" name="ref_content" value="'+val+'">');
		 $(this).append('<input type="hidden" name="ref_writer" value="${LOGIN_MEMBERINFO.mem_id}"/>');
		 $(this).append('<input type="hidden" name="ref_ip" value="${pageContext.request.remoteAddr}">');
		  $(this).attr('action','${pageContext.request.contextPath}/admin/reference/insertADReferenceInfo.do');
		  return true;
		  
	});
	
	function fileNameConfirm(fileName){
		if(!/\.(jpg|jpeg|gif|png)/.test(fileName.toLowerCase())){
			alert('이미지 파일만 업로드 가능합니다');
			return false;
		}
		return true;
	}
	
	$('#listBtn').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/admin/reference/adReferenceList.do');
		
	});
	
    $('#resetBtn').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/admin/reference/adReferenceUpdate.do');
	});
});
</script>
</head>
<body>
<form action="" method="post" name="ADnoticeForm" enctype="multipart/form-data">
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
						  <td><input type="text" class="ref_title" name="ref_title"></td>
						</tr>
						<tr>
						  <th>작성자</th>
						  <td><input type="text" name="ref_nickname" value="관리자" readonly="readonly"></td>
						</tr>
						<tr>
						  <th>내용</th>
						  <td><textarea rows="10" cols="110" id="ref_content" style="overflow: auto;"></textarea> </td>
						</tr>
						<tr>
						  <th>첨부파일</th>
						  <td><div class="col-sm-10">
						 <input type="file" class="filestyle" id="file01" name="files" data-buttonName="btn-primary">
						</div></td>
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