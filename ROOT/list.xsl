<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xml:space="preserve">
<xsl:output method="html" encoding="utf-8" indent="yes" omit-xml-declaration="yes" doctype-public="html" />
<xsl:include href="./template.xsl" />
<xsl:template match="jbbs">

<!-- 
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	
</head>
<body>
 -->
	
	<link rel="stylesheet" href="./css/bootstrap.min.css" />
	<link rel="stylesheet" href="./css/bootstrap-theme.css" />
	<script src="./js/jquery-1.12.4.min.js"></script>
	<script src="./js/bootstrap.min.js"></script>
 
	<div xmlns="http://www.w3.org/1999/xhtml">
		버전 2
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
			<table class="table table-hover small">
				<thead>
					<tr style="background-color:#F9F9F9;">
						<th>번호</th>
						<th>제목</th>
						<th>작성자</th>
						<th>작성일</th>
						<th>조회수</th>
					</tr>
				</thead>
				<tbody>
			<!-- 
					<tr style="background-color:#eee;">
						<th scope="row">1</th>
						<td style="font-weight:bold;">
							<a href="#">테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다</a>
						</td>
						<td>어드민</td>
						<td>2016-07-13</td>
						<td>132</td>
					</tr>
			 -->
			
					<tr>
						<th scope="row">1</th>
						<td>
							<a href="#">테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다</a>
						</td>
						<td>어드민</td>
						<td>2016-07-13</td>
						<td>132</td>
					</tr>
					<tr>
						<th scope="row">2</th>
						<td>
							<a href="#">테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다</a>
						</td>
						<td>어드민</td>
						<td>2016-07-13</td>
						<td>132</td>
					</tr>
					<tr>
						<th scope="row">3</th>
						<td>
							<a href="#">테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다</a>
						</td>
						<td>어드민</td>
						<td>2016-07-13</td>
						<td>132</td>
					</tr>
				</tbody>
				
				<tfoot>
					<tr>
						<td colspan="5">
							<div class="row-fluid">
								<div class="col-sm-5" style="padding-left:0px;">
									<button type="button" class="btn btn-default">글쓰기</button>
								</div>
								<div class="col-sm-2"></div>
								<div class="col-sm-5" style="text-align:right;padding-right:0px;">
									<div class="pull-right search"> 
										<input class="form-control input-sm" type="text" placeholder="search" /> 
									</div>
								</div>
							</div>
				
							<!-- <div class="col-md-4"> </div> <div class="col-md-4"> </div> <div 
								class="col-md-4" style="text-align:right;">  </div> -->
						</td>
					</tr>
				</tfoot>
			</table>

<!-- 		에디터 -->
<!-- 		tinymce -->
<!-- 		<xsl:call-template name="tinymce_script" /> -->
<!-- 		<xsl:call-template name="tinymce_editor" /> -->


<br /><br /><br /><br /><br />
				

	</div>




<!-- 
	
</body>
</html> -->
</xsl:template>
</xsl:stylesheet>
