<%@ page language="JAVA" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자료실 등록</title>
<script>
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
    // $('#bo_content').summernote('code');
    // 값 추가
    // $('#bo_content').summernote('code', '<font color="red">추가글</font>');
    // 에디터 제거
    // $('#bo_content').summernote('destroy');
    
//    BootstrapDialog.show({
//        title: '알럿창',
//        message: '알럿창으로 활용하세요!'
//    });
   
//    BootstrapDialog.show({
//         message: '컨펌 다이얼로그로 활용하세요!',
//         buttons: [{
//             label: 'Button 1'
//         }, {
//             label: 'Button 2',
//             cssClass: 'btn-primary',
//             action: function(){
//                 alert('Hi Orange!');
//             }
//         }, {
//             icon: 'glyphicon glyphicon-ban-circle',
//             label: 'Button 3',
//             cssClass: 'btn-warning'
//         }, {
//             label: 'Close',
//             action: function(dialogItself){
//                 dialogItself.close();
//             }
//         }]
//     });

$('form[name=referenceForm]').submit(function(){
//       var flag = true;
      
//       if(!fileNameConfirm($('#file01').val()));
   if($('#ref_title').val() == ""){
      alert("제목을 입력해주세요");
      return false;
   }
      
      var val = $('#ref_content').summernote('code');
      $(this).append('<input type="hidden" name="ref_writer" value="${LOGIN_MEMBERINFO.mem_id}">');
      $(this).append('<input type="hidden" name="ref_content" value="'+val+'"/>');
      $(this).append('<input type="hidden" name="ref_ip" value="${pageContext.request.remoteAddr}">');
      $(this).attr('action', '${pageContext.request.contextPath}/referenceboard/insertReferenceinfo.do');
      
      var fileName1 = $("#file01").val()
      
      if(fileName1 != ""){
          var ext = fileName1.slice(fileName1.lastIndexOf(".") + 1).toLowerCase();
          if (!(ext == "gif" || ext == "jpg" || ext == "png" || ext == "jpeg")) {
              alert("이미지파일 (.jpg, .png, .gif, .jpeg) 만 업로드 가능합니다.");
              return false;
          }
       }
      
      var fileName2 = $("#file02").val()
      
      if(fileName2 != ""){
          var ext = fileName2.slice(fileName2.lastIndexOf(".") + 1).toLowerCase();
          if (!(ext == "gif" || ext == "jpg" || ext == "png" || ext == "jpeg")) {
              alert("이미지파일 (.jpg, .png, .gif, .jpeg) 만 업로드 가능합니다.");
              return false;
          }
       }
   });
   

$('#list').click(function(){
   $(location).attr('href','${pageContext.request.contextPath}/referenceboard/referenceList.do');
});

$('#resetBtn').click(function(){
   $(location).attr('href','${pageContext.request.contextPath}/referenceboard/referenceForm.do');
});

});
</script>
</head>
<body>
<form name="referenceForm" class="form-horizontal" role="form" action="" method="post"
   enctype="multipart/form-data">
   <div class="form-group">
      <label class="control-label col-sm-2" for="ref_title">제목:</label>
      <div class="col-sm-10">
         <input type="text" class="form-control" id="ref_title" name="ref_title" placeholder="제목 입력...">
      </div>
   </div>
   <div class="form-group">
      <label class="control-label col-sm-2" for="ref_nickname">작성자 대화명:</label>
      <div class="col-sm-10"> 
         <input type="text" class="form-control" id="ref_nickname" name="ref_nickname" value="${LOGIN_MEMBERINFO.mem_name}">
      </div>
   </div>
   <div class="form-group">
      <label class="control-label col-sm-2" for="ref_content">내용:</label>
      <div class="col-sm-10"> 
         <div id="ref_content">
         </div>
      </div>
   </div>
   <div class="form-group">
      <label class="control-label col-sm-2" for="file01">첨부파일1:</label>
      <div class="col-sm-10">
          <input type="file" class="filestyle" id="file01" name="files" data-buttonName="btn-primary">
      </div>
   </div>
   <div class="form-group"> 
      <div class="col-sm-offset-2 col-sm-10">
         <button type="submit" class="btn btn-info" style="float: right">등록</button>
         <button id="resetBtn" type="button" class="btn btn-danger" style="float: right">취소</button>
         <button id="list" type="button" class="btn btn-primary" style="float: right">목록</button>
      </div>
   </div>
</form>
</body>
</html>