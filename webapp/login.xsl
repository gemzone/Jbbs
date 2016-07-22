<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xml:space="preserve">
<xsl:output method="html" encoding="utf-8" indent="yes" omit-xml-declaration="yes" doctype-public="html" />
<xsl:include href="./template.xsl" />
<xsl:template match="/">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	
</head>
<body>
	
	<link rel="stylesheet" href="./css/bootstrap.min.css" />
	<link rel="stylesheet" href="./css/bootstrap-theme.css" />
	<script src="./js/jquery-1.12.4.min.js"></script>
	<script src="./js/bootstrap.min.js"></script>
 
	<div xmlns="http://www.w3.org/1999/xhtml" style="padding:20px;text-align:center;">
<!-- 
			<div class="row">
				<div class="col-xs-3">
					글자글자
				</div>
				<div class="col-xs-9">
		
					<div class="pull-right" style="vertical-align: bottom;display: inline-block;">
						정보수정&#160;로그아웃&#160;게시판설정
					</div>
		
				</div>
			</div>
-->
			 
			 <div style="width:300px;display:inline-block;">
			
				<div style="background-color:#F9F9F9;border-bottom:2px solid #DDDDDD;padding:8px;text-align:center;font-size:12px;height:33px;font-weight:bold;">
					회원 로그인
				</div>
				<div style="border-bottom:1px solid #DDDDDD;padding:8px;width:300px;text-align:center;font-size:12px;overflow:hidden;">
					
					<div class="row-fluid">
						<div class="col-sm-4" style="padding-left:0px;padding-top:5px;">
							<span>아이디</span>
						</div>
						<div class="col-sm-8">
							<input class="form-control input-sm" type="text" style="width:100%;" />
						</div>
					</div>
				</div>
				<div style="border-bottom:1px solid #DDDDDD;padding:8px;width:300px;text-align:center;font-size:12px;overflow:hidden;">
					<div class="row-fluid">
						<div class="col-sm-4" style="padding-left:0px;padding-top:5px;">
							<span>비밀번호</span>
						</div>
						<div class="col-sm-8">
							<input class="form-control input-sm" type="password" style="width:100%;" />
						</div>
					</div>
				</div>
				
				<div class="row-fluid" style="margin-top:8px;">
					<div class="col-sm-6" style="text-align:right;">
						<button type="button" class="btn btn-default btn-sm">로그인</button>
					</div>
					<div class="col-sm-6" style="text-align:left;">
						<button type="button" class="btn btn-default btn-sm">목록보기</button>
					</div>
				</div>
			</div>
			
	</div>




	
</body>
</html>
</xsl:template>
</xsl:stylesheet>
