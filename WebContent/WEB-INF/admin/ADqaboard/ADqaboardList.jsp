<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
$(function(){
	$('#listClick').on('click', 'td[name=td]', function(){
		var parent = $(this).parent();
		var rnum = parent.children("td:eq(0)").text();
		var qa_no =  parent.children().find('input').val();
		
		$(location).attr('href','${pageContext.request.contextPath}/adminQA/ADqaboardView.do?qa_no='+qa_no+'&rnum=' + rnum);
		
	});
	
	$('#RegisBtn').click(function(){
		$(location).attr('href','${pageContext.request.contextPath}/adminQA/ADqaboardForm.do');
	});
	
	$('form[name=searchForm]').submit(function(){
		$(location).attr('href','${pageContext.request.contextPath}/adminQA/ADqaboardList.do?qa_no='+qa_no);
	});
});
</script>
<style>
#pointerTd:hover{cursor:pointer; }
</style>
<title>Q&A 목록</title>
</head>
<body>
<div class="wrap">
	<table width="1000" border="0" cellpadding="0" cellspacing="0">
		<tr valign="top">
			<td width="30">&nbsp;</td>
			<td width="790"> 
			<div id="container">
               <div class="title">Q&A게시판</div>
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
                  <tbody id="listClick">
				<c:forEach items="${qaboardList }" var="qaboardList">
					<tr>
						<td><input type="hidden" name="qa_no" value="${qaboardList.qa_no }"/>${qaboardList.rnum }</td>
						<td align="left" name="td" id="pointerTd">
							<c:forEach begin="1" end="${qaboardList.qa_depth }" varStatus="stat">
								&nbsp;&nbsp;&nbsp;
								<c:if test="${stat.last }">
									<i class="fa fa-angle-right">re: </i>
								</c:if>
							</c:forEach>
							${qaboardList.qa_title }
						</td>
						<td>${qaboardList.qa_nickname }</td>
						<td>${qaboardList.qa_reg_date.substring(0,10) }</td>
						<td>${qaboardList.qa_hit }</td>
					</tr>
				</c:forEach>
				</tbody>
               </table>
               </div>
          </td>
          </tr>
          </table>
              
		<div >
		<div style="text-align:right;">
               <form action="${pageContext.request.contextPath }/adminQA/ADqaboardList.do" method="post" class="form-inline pull-right" name="searchForm">
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
</div>	
</div>
</body>
</html>