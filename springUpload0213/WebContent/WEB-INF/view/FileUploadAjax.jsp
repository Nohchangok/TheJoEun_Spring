<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>


<script type="text/javascript">
	//파일 업로드 해보자!!
	$(function() {
		$("#uploadBtn").on("click", function(){
			//파일을 변수에 담아야 한다.
			var files = $("input[name='uploadFile']")[0].files;
			console.log(files);
			
			//파일를 전송하기 위해 formData라는 객체에 넣는다.
			var formData = new FormData();
			
			//폼에 보낼 내용을 추가한다.
			for(let i= 0; i< files.length; i++){
				formData.append("uploadFile",files[i]); //name=uploadFile, value=files[i]
			}
			
			//비동기 연결을 해주자.
			
			$.ajax({
				url:"/file/uploadAjax",
				processData:false, //전송하는 데이터 형태 기본이 문자열인데 이걸 안한다.(인코딩하지않는다.byte)
				contentType:false, //enctype 형식이 기본인 application방식으로 쓰지 않는다.
				data : formData, //전송할데이터
				type : "post", //전송할 방식
				success: function(result){
					console.log(result);
				}
				
			});
		})
	})
</script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FileUploadAjax.jsp</title>
</head>
<body>
	<div>
		<input type="file" name="uploadFile" multiple>
	</div>

	<button id="uploadBtn">upload</button>
</body>
</html>