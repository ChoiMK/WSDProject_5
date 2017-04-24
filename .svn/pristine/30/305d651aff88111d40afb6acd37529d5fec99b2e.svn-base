<%@ page language="JAVA" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 리스트</title>
<!-- <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script> -->
<script type="text/javascript">
$(function(){
	$('#tbodyClick').on('click', 'td[name=tdnotice]', function(){
		if(eval('${empty LOGIN_MEMBERINFO}')){
			alert("로그인후 게시글을 확인해주세요");
			return false;
		}
			var parent = $(this).parent();
			var rnum = parent.children("td:eq(0)").text();
			var nt_no =  parent.children().find('input').val();
		$(location).attr('href','${pageContext.request.contextPath}/noticeboard/noticeboardView.do?rnum=' + rnum + '&nt_no='+nt_no);
	});
	
	$('#regisBtn').click(function(){
		if(eval('${empty LOGIN_MEMBERINFO}')){
			alert("로그인후 게시글을 등록해주세요");
			return false;
		}	
		$(location).attr('href','${pageContext.request.contextPath}/noticeboard/noticeboardForm.do');
	});
	
	$('form[name=searchForm]').submit(function(){
		if(eval('${empty LOGIN_MEMBERINFO}')){
			alert("로그인후 검색을해주세요");
			return false;
		}
		$(location).attr('href','${pageContext.request.contextPath}/noticeboard/noticeboardList.do?nt_no='+nt_no);
	});
   
});

</script>
</head>
<body>
<div id="noticeList_content">
	<div class="panel panel-blue">
    	<div class="panel-heading">공지사항 리스트</div>
		<table class="table table-bordered table-hover">
			<thead>
				<tr>
					<th scope="col" width="5%">No</th>
					<th scope="col" width="65%">제목</th>
					<th scope="col" width="10%">작성자</th>
					<th scope="col" width="10%">작성일</th>
					<th scope="col" width="10%">조회수</th>
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
	${pageHtml }

</div>
<div >
<form action="" method="post" class="form-inline pull-right" name="searchForm">
		<input name="search_keyword" type="text" placeholder="검색어 입력..." class="form-control" />
		<select class="form-control" name="search_keycode" >
			<option>검색조건</option>
			<option value="TITLE">제목</option>
			<option value="CONTENT">내용</option>
			<option value="WRITER">작성자</option>
		</select>
	    <button type="submit" class="btn btn-primary form-control">검색</button>
<!-- 	    <button type="button" class="btn btn-primary form-control" id="regisBtn">새글쓰기</button> -->
	    
</form>
</div>	
</body>
</html>