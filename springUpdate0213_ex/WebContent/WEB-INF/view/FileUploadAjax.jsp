<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<script type="text/javascript">

$(function(){
	$("#uploadBtn").on("click", function(){
		var files = $("#uploadFile")[0].files;
		
		//form태그와 같은 것.
		var formData = new FormData();
		
		//controller의 파라미터이름과 append("name")과 동일.
		for (var i = 0; i < files.length; i++) {
			formData.append("File",files[i]);
		}
		
		$.ajax({
			url:"/File/uploadAjax",
			processData:false, //전송하는 데이터 형태 기본이 문자열인데 이걸 안한다.(인코딩하지않는다.byte)
			contentType:false, //enctype 형식이 기본인 application방식으로 쓰지 않는다.
			data : formData, //전송할데이터
			type : "post", //전송할 방식
			success: function(result){
				console.log(result);
			}
		})
		
	})
})

</script>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<input type="file" id="uploadFile" multiple>
	</div>

	<button id="uploadBtn">upload</button>
</body>
</html>