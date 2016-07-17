<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta charset="utf-8"/>
	<title>NAVER</title>
	<meta http-equiv="X-UA-Compatible" content="IE=Edge"/>
	<meta name="viewport" content="width=device-width, user-scalable=no" />
	<meta name="google" value="notranslate" />
	<link rel="icon" href="/favicon.ico" />
	
	<link rel="stylesheet" href="./naver.css" />
	<script src="../js/jquery-1.12.4.min.js"></script>
	<script src="./naverLogin_implicit-1.0.2-min.js"></script>
</head>
<body>
	<div class="title">NAVER</div>
	<div id="st-signIn" class="display">
		<div class="err-out"></div>
		<div class="bt-login retry" onclick="ex.callNAVERLogin();" style="display:none">Retry
			login</div>
	</div>

<!-- 	<div id="st-create" class="display" raon-form-id="ac-create" style="display:none"> -->
<!-- 		<div class="form-unit-mail"></div> -->
<!-- 		<div class="form-desc-fb"></div> -->
<!-- 		<div class="form-desc-date"></div> -->
<!-- 		<div class="form-unit-date"> -->
<!-- 			<div class="year-hold"> -->
<!-- 				<select name="bdYear" err-out="#err-bd"></select> -->
<!-- 			</div> -->
<!-- 			<div class="month-hold"> -->
<!-- 				<select name="bdMonth" err-out="#err-bd"></select> -->
<!-- 			</div> -->
<!-- 			<div class="date-hold"> -->
<!-- 				<select name="bdDate" err-out="#err-bd"></select> -->
<!-- 			</div> -->
<!-- 		</div> -->
<!-- 		<div class="form-pad"></div> -->
<!-- 		<div class="err-out" style="display:none"></div> -->
<!-- 		<input name="bt_ac_create_send" type="button" class="bt" /> -->
<!-- 	</div> -->

<!-- 	<div id="st-seAuth" class="display"> -->
<!-- 		<div class="err-out"></div> -->
<!-- 	</div> -->

<!-- 	<div id="st-add" class="display"> -->
<!-- 		<div class="err-out"></div> -->
<!-- 	</div> -->
	<script>
		$.ajax({
			method : "GET",
			url : "https://nid.naver.com/oauth2.0/authorize",
			data : {
				response_type : "code",
				client_id : "smzVAvgWRXkO2Nph2yW6",
				redirect_uri: "modjk.com",
				
			},
			dataType : "script"
		});
	</script>
</body>
</html>