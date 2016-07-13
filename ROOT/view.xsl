<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xml:space="preserve">
<xsl:output method="html" encoding="utf-8" indent="yes" omit-xml-declaration="yes" doctype-public="html" />
<xsl:include href="./template.xsl" />
<xsl:template match="jbbs">
<!-- <html xmlns="http://www.w3.org/1999/xhtml"> -->
<!-- <head> -->

<!-- </head> -->
<!-- <body> -->
 	<div xmlns="http://www.w3.org/1999/xhtml">
 	
 	
 	<link rel="stylesheet" href="./css/bootstrap.min.css" />
	<link rel="stylesheet" href="./css/bootstrap-theme.css" />
	<script src="./js/jquery-1.12.4.min.js"></script>
	<script src="./js/bootstrap.min.js"></script>
	<script src="./js/tinymce/tinymce.min.js"></script>
	<script>tinymce.init({ selector:'textarea' });</script>
 
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
		<table class="table small" style="word-wrap:break-word;table-layout: fixed;">
			<thead>
				<tr style="background-color:#F9F9F9;">
					<th colspan="3">제목</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td class="col-md-4">
						name
					</td>
					<td class="col-md-4">
					</td>
					<td class="col-md-4" style="text-align:right;">
						<strong>조회수</strong> 132 <strong>작성일</strong> 2016-07-13 21:42:12
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<div style="overflow:auto;word-wrap: break-word;width:99%;">
						text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
						<br />
					
						text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
						<br />
					
						text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
						<br />
					
						text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
						<br />
					
						text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
						<br />
					
						text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
						<br />
					
						text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
						<br />
					
						text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
						<br />
					
						text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
						<br />
					
						text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
						<br />
					
						text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
						<br />
					
						text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
						<br />
					
						text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
						<br />
						</div>
					</td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="3">내용 테스트내용 테스트내용 테스트내용 테스트</td>
				</tr>
				<tr>
					<td class="col-md-4">
						<div class="btn-group">
							<button type="button" class="btn btn-default">목록보기</button>
						</div>
					</td>
					<td class="col-md-4">
					</td>
					<td class="col-md-4" style="text-align:right;">
						<div class="btn-group">
							<button type="button" class="btn btn-default">수정하기</button>
							<button type="button" class="btn btn-default">삭제하기</button>
						</div>
					</td>
				</tr>
			</tfoot>
		</table>
		
		코멘트 스타일2
		<div class="panel panel-default">
			<div class="panel-heading">Panel Header</div>
			<div class="panel-body">Panel Content</div>
		</div>
		
		코멘트 스타일1 
		<!-- comment 
		<table class="table table-condensed small" style="word-wrap:break-word;table-layout: fixed;">
			<tbody>
				<tr>
					<td class="col-sm-2">
						<strong>name</strong>
						
						<span>2016-07-13 21:42:12</span>
					</td>
					<td class="col-md-8">
						테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다
					</td>
				</tr>
				<tr>
					<td class="col-sm-2">
						<strong>namenamename</strong>
						
						<span>2016-07-13 21:42:12</span>
					</td>
					<td class="col-md-8">
						테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다
					</td>
				</tr>
												<tr>
					<td class="col-sm-2">
						<strong>namenamename</strong>
						
						<span>2016-07-13 21:42:12</span>
					</td>
					<td class="col-md-8">
						테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다
					</td>
				</tr>
				<tr>
					<td class="col-sm-2">
						<strong>namenamename</strong>
						
						<span>2016-07-13 21:42:12</span>
					</td>
					<td class="col-md-8">
						테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다
					</td>
				</tr>
												<tr>
					<td class="col-sm-2">
						<strong>namenamename</strong>
						
						<span>2016-07-13 21:42:12</span>
					</td>
					<td class="col-md-8">
					테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다 테스트글 입니다	
					</td>
				</tr>
				<tr>
					<td class="col-sm-2">
						<strong>namenamename</strong>
						
						<span>2016-07-13 21:42:12</span>
					</td>
					<td class="col-md-8">
						text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
					</td>
				</tr>				
			</tbody>
		</table>
		-->
	
		
		<div class="panel panel-default">
			<div class="panel-heading">comment</div>
			<div class="panel-body">
				<div class="form-group">
					<label for="usr">이름:</label>
					<input type="text" class="form-control small" id="usr" />
				</div>
				<div class="form-group">
					<label for="pwd">비밀번호:</label>
					<input type="password" class="form-control small" id="pwd" />
				</div>
		
				<div class="form-group">
					<label for="pwd">내용:</label>
					<textarea id="comment"></textarea>
				</div>
			
				<button type="button" class="btn btn-default btn-block">write</button>
			</div>
		</div>
	
	
		<div class="row-fluid">
			<div class="col-sm-5" style="padding-left:0px;">
				<button type="button" class="btn btn-default">목록보기</button>
			</div>
			<div class="col-sm-2"></div>
			<div class="col-sm-5" style="text-align:right;padding-right:0px;">
				
			</div>
		</div>
	
	
	</div>
	
	
<!-- </body> -->
<!-- </html> -->
</xsl:template>
</xsl:stylesheet>
