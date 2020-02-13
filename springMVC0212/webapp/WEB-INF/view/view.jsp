<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>	
<meta charset="UTF-8">
<title>view.jsp</title>
<script type="text/javascript">
	$(function() {
		$("#getBtn").on("click", function() {
			$.ajax({
				url : "userdata",
				dataType : "json",
				type : "post",
				success : function(result) {
					$("input[name='userId']").val(result.userId);
					$("input[name='name']").val(result.name);
					$("input[name='nickname']").val(result.nickname);
					var birth=result.birth.year+"-"+result.birth.monthValue+"-"+result.birth.dayOfMonth;
					$("input[name='birth']").val(birth);
					$("#display").removeClass("display_none");
					$("#not_thing").addClass("display_none");
				},
				error : function(e) {
					console.log(e);
				}
			});
		});
	});
</script>
<style>
#display {
	border: 1px solid gray
}

.display_none {
	display: none;
}
</style>
</head>
<body>
	<button id="getBtn">유저가져오기</button>
	<div id="not_thing">유저의 정보가 없음</div>
	<div id="display" class="display_none">
		<input name="userId" disabled> <input name="name" disabled>
		<input name="nickname" disabled> <input name="birth" disabled>
	</div>

</body>
</html>