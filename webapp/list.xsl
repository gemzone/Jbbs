<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xml:space="preserve">
<xsl:output method="html" encoding="utf-8" indent="yes" omit-xml-declaration="yes" doctype-public="html" />
<xsl:include href="./template.xsl" />
<xsl:template match="/">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	
</head>
<body ng-app="LoadingBarExample" ng-controller="ExampleCtrl">
	
	<link rel="stylesheet" href="./css/bootstrap.min.css" />
	<link rel="stylesheet" href="./css/bootstrap-theme.css" />
	<script src="./js/jquery-1.12.4.min.js"></script>
	<script src="./js/bootstrap.min.js"></script>
 
 
	<!-- angular -->
    <script src="./angularjs/angular.min.js"></script>
    <script src="./angularjs/angular-animate.min.js"></script>
 	<!-- loading -->
	<script src="./angularjs/loading-bar.js"></script>
    <link href="./angularjs/loading-bar.css" rel="stylesheet" />
 	<script src="./angularjs/app.js"></script>
    <link href="./angularjs/app.css" rel="stylesheet" />
 
	<div xmlns="http://www.w3.org/1999/xhtml" style="padding:20px;">
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
				
			<div class="row-fluid" style="padding:8px;word-wrap:break-word;table-layout:fixed;overflow:hidden;">
	
				<div class="col-sm-4" style="padding-left:0px;">
					<select>
						<option>TEST1</option>
						<option>TEST2</option>
						<option>TEST3</option>
					</select>
				</div>
				<div class="col-sm-4" style="text-align:center;">
				
				</div>
				
				<div class="col-sm-4" style="padding-right:0px;text-align:right;">
						<div class="text-primary" style="padding:0px 0px 0px 10px;display:inline-block;"><a href="">회원가입</a></div>
						<div class="text-primary" style="padding:0px 0px 0px 10px;display:inline-block;"><a href="./login">로그인</a></div>
				</div>
			</div>
			
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
							<a href="./view">테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다</a>
						</td>
						<td>어드민</td>
						<td>2016-07-13</td>
						<td>132</td>
					</tr>
					<tr>
						<th scope="row">2</th>
						<td>
							<a href="./view">테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다</a>
						</td>
						<td>어드민</td>
						<td>2016-07-13</td>
						<td>132</td>
					</tr>
					<tr>
						<th scope="row">3</th>
						<td>
							<a href="./view">테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다</a>
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
								<div class="col-sm-2" style="padding-left:0px;">
									<button type="button" class="btn btn-default btn-sm">목록보기</button>
								</div>
								<div class="col-sm-8" style="text-align:center;">
								
									<ul class="pagination" style="margin-top:5px;">
										<li>
											<a class="page-link" href="#" aria-label="Previous">
												<span aria-hidden="true">&#171;</span>
												<span class="sr-only">Previous</span>
											</a>
										</li>
									
										<li>
											<a href="#">1</a>
										</li>
										<li class="active">
											<a href="#">2</a>
										</li>
										<li>
											<a href="#">3</a>
										</li>
										<li>
											<a href="#">4</a>
										</li>
										<li>
											<a href="#">5</a>
										</li>
										<li>
											<a href="#">6</a>
										</li>
										<li>
											<a href="#">7</a>
										</li>
										<li>
											<a href="#">8</a>
										</li>
										<li>
											<a href="#">9</a>
										</li>
										
										<li>
											<a class="page-link" href="#" aria-label="Next">
												<span aria-hidden="true">&#187;</span>
												<span class="sr-only">Next</span>
											</a>
										</li>
										
									</ul>
								
								
								</div>
								<div class="col-sm-2" style="text-align:right;padding-right:0px;">
									<button type="button" class="btn btn-default btn-sm" onclick="location.href='./write';">글쓰기</button>
									
								</div>
							</div>
		
					
							<!-- 
							<div class="pull-right search"> 
								<input class="form-control input-sm" type="text" placeholder="search" /> 
								
								
								
							</div>
							 -->
				
				
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




</body>
</html>
</xsl:template>
</xsl:stylesheet>
