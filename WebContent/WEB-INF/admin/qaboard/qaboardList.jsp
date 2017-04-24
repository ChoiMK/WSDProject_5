<%@ page language="JAVA" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript">
$(function(){
	$('#listClick').on('click', 'td[name=td]', function(){
		if(eval('${empty LOGIN_MEMBERINFO}')){
			alert("로그인후 검색을해주세요");
			return false;
		}
		var parent = $(this).parent();
		var rnum = parent.children("td:eq(0)").text();
		var qa_no =  parent.children().find('input').val();
		
		$(location).attr('href','${pageContext.request.contextPath}/user/qaboard/qaboardView.do?qa_no='+qa_no);
		
	});
	$('#qaBtn').click(function(){
		if(eval('${empty LOGIN_MEMBERINFO}')){
			alert("로그인후 검색을해주세요");
			return false;
		}
		$(location).attr('href','${pageContext.request.contextPath}/user/qaboard/qaboardForm.do');
	});
	
	$('form[name=searchForm]').submit(function(){
		if(eval('${empty LOGIN_MEMBERINFO}')){
			alert("로그인후 검색을해주세요");
			return false;
		}
		$(location).attr('href','${pageContext.request.contextPath}/user/qaboard/qaboardList.do?qa_no='+qa_no);
	});
	
});
</script>
<title>Q&A 목록</title>
</head>
<body>

<div id="qaboardList_content">
	<div class="panel panel-blue">
    	<div class="panel-heading">Q&A 목록</div>
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
			<tbody id="listClick">
				<c:forEach items="${qaList }" var="qaboardInfo">
					<tr>
						<td><input type="hidden" name="qa_no" value="${qaboardInfo.qa_no }"/>${qaboardInfo.rnum }</td>
						<td align="left" name="td">
							<c:forEach begin="1" end="${qaboardInfo.qa_depth }" varStatus="stat">
								&nbsp;&nbsp;&nbsp;
								<c:if test="${stat.last }">
									<i class="fa fa-angle-right">re: </i>
								</c:if>
							</c:forEach>
							${qaboardInfo.qa_title }
						</td>
						<td>${qaboardInfo.qa_nickname }</td>
						<td>${qaboardInfo.qa_reg_date.substring(0,10) }</td>
						<td>${qaboardInfo.qa_hit }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	${pageHtml }	
</div>
<div >
<form action="${pageContext.request.contextPath }/user/qaboard/qaboardList.do" method="post" class="form-inline pull-right" name="searchForm">
		<input name="search_keyword" type="text" placeholder="검색어 입력..." class="form-control" />
		<select class="form-control" name="search_keycode" >
			<option>검색조건</option>
			<option value="TOTAL">전체</option>
			<option value="TITLE">제목</option>
			<option value="CONTENT">내용</option>
			<option value="WRITER">작성자</option>
		</select>
	    <button type="submit" class="btn btn-primary form-control">검색</button>
	    <button type="button" class="btn btn-info form-control" id="qaBtn">Q&A 등록</button>
</form>
</div>	
</body>
</html>