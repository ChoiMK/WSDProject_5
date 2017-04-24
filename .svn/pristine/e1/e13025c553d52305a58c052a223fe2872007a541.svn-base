<%@ page language="JAVA" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자료실</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
    $(function(){
      $('img').click(function(){
         if(eval('${empty LOGIN_MEMBERINFO}')){
            alert("로그인후 이용해주세요");
            return false;
         }   
         //var index = $(this).text();
         //var rnum = $(this).prev().text();
         var ref_no = $(this).siblings("input").val();
         $(location).attr('href','${pageContext.request.contextPath}/referenceboard/referenceView.do?ref_no='+ref_no);
      });
      
      $('#write').click(function(){
         if(eval('${empty LOGIN_MEMBERINFO}')){
            alert("로그인후 이용해주세요");
            return false;
         }   
         $(location).attr('href','${pageContext.request.contextPath}/referenceboard/referenceForm.do');
      });
      
      
      
   });
</script>
</head>
<body>
<div id="referenceList_content">
   <div class="panel panel-blue">
       <div class="panel-heading">자료실 목록</div>
      <table class="table table-bordered table-hover">
      
         <tbody>
            <c:forEach items="${referenceList}" var="referenceInfo">
               <article class="col-xs-12 col-sm-6 col-md-3">
                              <div class="panel panel-default">
                                  <div class="panel-body">
                                  <c:forEach items="${referenceInfo.attachFileRoomList}" var="fileItem">
                                          <img style='width:280px; height:200px' src="http://localhost/file/${fileItem.file_save_name}">
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
   </div>
   ${pageHtml}
</div>
<div>
<form action="${pageContext.request.contextPath}/referenceboard/referenceList.do" method="post" class="form-inline pull-right">
      <input id="search_keyword" name="search_keyword" type="text" placeholder="검색어 입력" class="form-control" />
      <select class="form-control" name="search_keycode" >
         <option value="TOTAL">전체</option>
         <option value="TITLE">제목</option>
         <option value="CONTENT">내용</option>
         <option value="NICKNAME">작성자대화명</option>
      </select>
       <button type="submit" class="btn btn-primary form-control">검색</button>
       <button type="button" class="btn btn-primary form-control" id="write">등록</button>
<!--        <button type="button" id="write" class="btn btn-info form-control">게시글 등록</button> -->
</form>
</div>   
</body>
</html>