<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script> -->
<script type="text/javascript">
 	$(function(){
		$('img').click(function(){
			//var index = $(this).text();
			//var rnum = $(this).prev().text();
			var ref_no = $(this).siblings("input").val();
			$(location).attr('href','${pageContext.request.contextPath}/adReference/adReferenceView.do?ref_no='+ref_no);
		});
		
		

		
		$('#RegisBtn').click(function(){
			if(eval('${empty LOGIN_MEMBERINFO}')){
				alert("로그인후 이용해주세요");
				return false;
			}	
			$(location).attr('href','${pageContext.request.contextPath}/adReference/adReferenceUpdate.do');
		});
		
		$('form[name=searchForm]').submit(function(){
			$(location).attr('href','${pageContext.request.contextPath}/adReference/adReferenceList.do?nt_no='+nt_no);
		});
		
		
	});
</script>
<title>자료실 리스트</title>
</head>
<body>
<div class="wrap">
	<table width="1000" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td width="790"> 
				<div id="container">
					<div class="title">자료실 리스트</div>
					<table border="0" cellspacing="1" cellpadding="1">
						<thead>
						</thead>
						<tbody>
						<c:forEach items="${referenceList}" var="referenceInfo">
					<article class="col-xs-12 col-sm-6 col-md-3">
						            <div class="panel panel-default">
						                <div class="panel-body">
						                <c:forEach items="${referenceInfo.attachFileRoomList}" var="fileItem">
						                        <img style='width:160px; height:120px' src="http://localhost/file/${fileItem.file_save_name}">
						                </c:forEach>
						                        <input type="hidden" name="ref_no" value="${referenceInfo.ref_no }"/>
						                </div>
						                <div class="panel-footer">
						                    ${referenceInfo.ref_title }
						                    <span class="pull-right">
						                    </span>
						                </div>
						            </div>
		        				</article>
				</c:forEach>
						</tbody>
					</table>
					<div style="text-align:right;">
               <form action="${pageContext.request.contextPath }/adReference/adReferenceList.do" method="post" class="form-inline pull-right" name="searchForm">
				<input name="search_keyword" type="text" placeholder="검색어 입력..." class="form-control" />
				<select class="form-control" name="search_keycode" >
					<option>검색조건</option>
					<option value="TITLE">제목</option>
					<option value="CONTENT">내용</option>
					<option value="WRITER">작성자</option>
				</select>
			    <div style="text-align:right">
						<input class="btn2" type="submit" value="검색"/> 
						<input class="btn2" type="button" value="등록" id="RegisBtn"/>
					</div>

		</form>
            </div>
            ${pageHtml }
				</div>
			</td>
		</tr>
	</table>
</div>
</body>
</html>