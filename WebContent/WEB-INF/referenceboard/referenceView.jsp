<%@ page language="JAVA" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시글 정보</title>
<!-- 이미지 슬라이드 사이즈 조정 -->
<style type="text/css">
.carousel{
   width:200px;
    height:150px;
    margin-left: 200px;
}
.carousel-inner > .item > img{
    width:200px;
    height:150px;
}     
</style>
<script>
$(function(){
   // 섬머노트를 div를 활용한 textarea에 추가.
   // http://summernote.org 활용
    $('#ref_content').summernote({
         height: 150,
         codemirror: {
         theme: 'monokai'
      }
    });
    $("#ref_content").summernote('code', '${referenceInfo.ref_content}');
    
    $("form[name=referenceForm]").submit(function(){
       var val = $('#ref_content').summernote('code');
       $(this).append('<input type="hidden" name="ref_no" value="${referenceInfo.ref_no}"/>');
       $(this).append('<input type="hidden" name="ref_content" value="'+val+'"/>');
       $(this).attr('action','${pageContext.request.contextPath}/referenceboard/updateReferenceinfo.do');
       alert("수정이 완료되었습니다.");
    });
    
    $('#list').click(function(){
       $(location).attr('href','${pageContext.request.contextPath}/referenceboard/referenceList.do');
    });
    
    $('#delete_btn').click(function(){
       $(location).attr('href','${pageContext.request.contextPath}/referenceboard/deleteReferenceinfo.do?ref_no=${referenceInfo.ref_no}');
    });
    
    
    
});
</script>
</head>
<body>
<form name="referenceForm" class="form-horizontal" role="form" action="" method="post">
   <div class="form-group">
      <label class="control-label col-sm-2" for="ref_title">제목:</label>
      <div class="col-sm-10">
         <input type="text" class="form-control" id="ref_title" name="ref_title" value="${referenceInfo.ref_title}">
      </div>
   </div>
   <div class="form-group">
      <label class="control-label col-sm-2" for="ref_nickname">작성자 대화명:</label>
      <div class="col-sm-10"> 
<%--          <input type="hidden" name="ref_no" value="${referenceInfo.ref_no}"> --%>
         <input type="text" class="form-control" id="ref_nickname" name="ref_nickname" value="${referenceInfo.ref_nickname }"  >
      </div>
   </div>
   <div class="form-group">
      <label class="control-label col-sm-2" for="ref_content">내용:</label>
      <div class="col-sm-10"> 
         <div id="ref_content"></div>
      </div>
   </div>
   <div class="form-group">
      <label class="control-label col-sm-2" label for="ref_content">첨부파일:</label>
      <div class="col-sm-10"> 
      <div id="myCarousel" class="carousel slide" data-ride="carousel">
   
         <!-- Wrapper for slides -->
         <div class="carousel-inner" role="listbox" style="height: 200px;">
         <c:forEach items="${referenceInfo.attachFileRoomList}" var="fileItem" varStatus="stat">
            <c:if test="${stat.first }">
               <div class="item active">
            </c:if>
            <img src="http://localhost/file/${fileItem.file_save_name}" alt="pic${stat.count}"
               onclick="javascript:location.href='${pageContext.request.contextPath}/referenceboard/fileDownload.do?file_seq=${fileItem.file_seq}'">
            </div>
         </c:forEach>
         </div>
         
      </div>
   </div>
   <div class="form-group"> 
      <div class="col-sm-offset-2 col-sm-10">
         <c:if test="${LOGIN_MEMBERINFO.mem_name == referenceInfo.ref_nickname }">
         <button type="button" id="delete_btn" class="btn btn-danger">삭제</button>
         </c:if>
         <button id="list" type="button" class="btn btn-info">목록</button>
         <c:if test="${LOGIN_MEMBERINFO.mem_name == referenceInfo.ref_nickname }">
         <button type="submit" class="btn btn-default" style="float: right">수정</button>
         </c:if>
         
      </div>
   </div>
</form>
</body>
</html>