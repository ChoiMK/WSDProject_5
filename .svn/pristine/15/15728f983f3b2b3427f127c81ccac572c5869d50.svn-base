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
	$('#RegisBtn').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/ADNotice/ADNoticeForm.do');
	});
	
	$('#tbodyClick').on('click', 'td[name=tdnotice]', function(){
			var parent = $(this).parent();
			var rnum = parent.children("td:eq(0)").text();
			var nt_no = parent.children().find('input').val();
		$(location).attr('href','${pageContext.request.contextPath}/ADNotice/ADNoticeView.do?rnum=' + rnum + '&nt_no='+nt_no);
	});
	
	$('form[name=searchForm]').submit(function(){
		$(location).attr('href','${pageContext.request.contextPath}/ADNotice/ADNoticeList.do?nt_no='+nt_no);
	});
});

</script>
<title>공지사항 리스트</title>
</head>
<body>
<div class="wrap">
	<table width="1000" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td width="790"> 
				<div id="container">
               <div class="title">공지사항게시판</div>
               <table id="tbl" border="0" cellspacing="1" cellpadding="1">
                  <thead>
                     <tr>
                       <th width="5%">번호</th>
                       <th width="60%">제목</th>
                       <th>작성자</th>
                       <th>작성일</th>
                       <th>조회수</th>
                     </tr>                     
                  </thead>
					<tbody id="tbodyClick">
						<c:forEach items="${noticeList }" var="noticeInfo">
							<tr>
								<td><input type="hidden" name="nt_no" value="${noticeInfo.nt_no }"/>${noticeInfo.rnum }</td>
								<td name="tdnotice">${noticeInfo.nt_title }</td>
								<td>${noticeInfo.nt_nickname }</td>
								<td>${noticeInfo.nt_reg_date.substring(0,10) }</td>
								<td>${noticeInfo.nt_hit }</td>
							</tr>
						</c:forEach>
					</tbody>
               </table>
               </div>
               <div style="text-align:right;">
               <form action="" method="post" class="form-inline pull-right" name="searchForm">
				<input name="search_keyword" type="text" placeholder="검색어 입력..." class="form-control" />
				<select class="form-control" name="search_keycode" >
					<option>검색조건</option>
					<option value="TITLE">제목</option>
					<option value="CONTENT">내용</option>
					<option value="WRITER">작성자</option>
				</select>
			    <div style="text-align:right">
						<input class="btn2" type="submit" value="검색"/> 
						<input class="btn2" type="button" value="새글쓰기" id="RegisBtn"/>
					</div>

		</form>
            ${pageHtml }
            </div>
			</td>
		</tr>
	</table>
</div>
</body>
</html>