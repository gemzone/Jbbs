<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xml:space="preserve">
<xsl:output method="html" encoding="utf-8" indent="yes" omit-xml-declaration="yes" doctype-public="html" />
<xsl:include href="./template.xsl" />
<xsl:template match="jbbs"><html xmlns="http://www.w3.org/1999/xhtml">
<head>
<xsl:call-template name="meta" />
<xsl:call-template name="script" />
<xsl:call-template name="stylesheet" />
</head>
<body>

	<div style="padding:10px;">
	
		버전 1
	
		<div style="overflow:hidden;">

		
			<nav role="navigation" class="navbar navbar-default">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" data-target="#navbarCollapse"
						data-toggle="collapse" class="navbar-toggle">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a href="#" class="navbar-brand">게시판이름</a>
				</div>
				<!-- Collection of nav links and other content for toggling -->
				<div id="navbarCollapse" class="collapse navbar-collapse">
					<ul class="nav navbar-nav">
						<li class="active">
							<a href="#">카테고리1</a>
						</li>
						<li>
							<a href="#">카테고리2</a>
						</li>
						<li>
							<a href="#">카테고리3</a>
						</li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li>
							<a href="#">Login</a>
						</li>
						<li>
							<a href="#">Register</a>
						</li>
					</ul>
				</div>
			</nav>
				
			<table class="table table-striped table-bordered table-hover">
				<thead>
				    <tr>
				      <th>번호</th>
				      <th>제목</th>
				      <th>작성자</th>
				      <th>작성일</th>
				      <th>조회수</th>
				    </tr>
				  </thead>
				  <tbody>
				    <tr>
				      <th scope="row">1</th>
				      <td><a href="#">테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다</a></td>
				      <td>어드민</td>
				      <td>2016-07-13</td>
				      <td>132</td>
				    </tr>
				    <tr>
				      <th scope="row">2</th>
				      <td><a href="#">테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다</a></td>
				      <td>어드민</td>
				      <td>2016-07-13</td>
				      <td>132</td>
				    </tr>
				    <tr>
				      <th scope="row">3</th>
				      <td><a href="#">테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다</a></td>
				      <td>어드민</td>
				      <td>2016-07-13</td>
				      <td>132</td>
				    </tr>
				    </tbody>
			</table>
			<div class="pull-right search">
				<input class="form-control" type="text" placeholder="search" />
			</div>
			
		</div>
		
	
		<hr />
	
		버전 2
	
		<div class="overflow:hidden;">

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
			
			<table class="table table-striped table-bordered table-hover table-condensed small">
				<thead>
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>작성자</th>
						<th>작성일</th>
						<th>조회수</th>
					</tr>
				</thead>
				<tbody>
			
					<tr style="background-color:#eee;">
						<th scope="row">1</th>
						<td style="font-weight:bold;">
							<a href="#">테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다</a>
						</td>
						<td>어드민</td>
						<td>2016-07-13</td>
						<td>132</td>
					</tr>
			
			
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
			</table>
			<div class="row">
				<div class="col-xs-3">
					글쓰기
				</div>
				<div class="col-xs-6">
					
				</div>
				<div class="col-xs-3">
					<div class="pull-right search">
						<input class="form-control input-sm" type="text" placeholder="search" />
					</div>
				</div>
			
			</div>
		</div>
	
	
	
	
	
		<hr />
	
		에디터
		tinymce
		<xsl:call-template name="tinymce_script" />
		<xsl:call-template name="tinymce_editor" />
		
	
		
	

	</div>





	
</body>
</html>
</xsl:template>
</xsl:stylesheet>
