<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xml:space="preserve">
<xsl:output method="html" encoding="utf-8" indent="yes" omit-xml-declaration="yes" doctype-public="html" />
<xsl:include href="./template.xsl" />
<xsl:template match="jbbs">
<!-- <html xmlns="http://www.w3.org/1999/xhtml"> -->
<!-- <head> -->

<!-- </head> -->
<!-- <body> -->
 	<div xmlns="http://www.w3.org/1999/xhtml" style="padding:20px;">
 	
 	
 	<link rel="stylesheet" href="./css/bootstrap.min.css" />
	<link rel="stylesheet" href="./css/bootstrap-theme.css" />
	<script src="./js/jquery-1.12.4.min.js"></script>
	<script src="./js/bootstrap.min.js"></script>
	<script src="./js/tinymce/tinymce.min.js"></script>

 
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
		<table class="table small" style="word-wrap:break-word;table-layout:fixed;">
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
						<div style="overflow:auto;word-wrap: break-word;">
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
					<td colspan="3">프로필 내용정도 나오는 부분</td>
				</tr>
				<tr>
					<td class="col-md-4">
						<div class="btn-group">
							<button type="button" class="btn btn-default btn-sm">목록보기</button>
						</div>
					</td>
					<td class="col-md-4">
					</td>
					<td class="col-md-4" style="text-align:right;">
						<div class="btn-group">
							<button type="button" class="btn btn-default btn-sm">수정하기</button>
							<button type="button" class="btn btn-default btn-sm">삭제하기</button>
						</div>
					</td>
				</tr>
			</tfoot>
		</table>
		
		<div style="border-top:1px solid #ddd;">
			<div class="row-fluid" style="border-bottom:1px solid #ddd;padding:8px;word-wrap:break-word;table-layout:fixed;overflow:hidden;">
				<div class="col-sm-2">
					<strong>name</strong>
				</div>
				<div class="col-sm-10">
					text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
					text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
					text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
					text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
					text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
				</div>
			</div>
	
			<div class="row-fluid" style="border-bottom:1px solid #ddd;padding:8px;word-wrap:break-word;table-layout:fixed;overflow:hidden;">
				<div class="col-sm-2">
					<strong>name</strong>
				</div>
				<div class="col-sm-10">
					text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
					text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
					text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
					text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
					text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
				</div>
			</div>
	
			<div class="row-fluid" style="border-bottom:1px solid #ddd;padding:8px;word-wrap:break-word;table-layout:fixed;overflow:hidden;">
				<div class="col-sm-2">
					<strong>name</strong>
				</div>
				<div class="col-sm-10">
					text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
					text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
					text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
					text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
					text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;text&#160;
				</div>
			</div>
	
			<div class="row-fluid" style="border-bottom:1px solid #ddd;padding:8px;word-wrap:break-word;table-layout:fixed;overflow:hidden;">
				<div class="col-sm-2">
					comment
				</div>
				<div class="col-sm-10">
				<!-- 
					<div class="form-group">
						<label for="usr">이름:</label>
						<input type="text" class="form-control small" id="usr" />
					</div>
					<div class="form-group">
						<label for="pwd">비밀번호:</label>
						<input type="password" class="form-control small" id="pwd" />
					</div>
			 -->
			 
			 		<div class="col-xs-10">
			 			<textarea class="form-control" rows="5" id="comment" style="resize:none;"></textarea>
					</div>
					<div class="col-xs-2">
					  <button type="button" class="btn btn-default btn-block btn-sm">write</button>
					</div>
			 
				</div>
			</div>

		</div>

		<div class="row-fluid" style="padding:8px;word-wrap:break-word;table-layout:fixed;overflow:hidden;">

			<div class="col-md-6" style="padding-left:0px;">
				<div class="btn-group">
					<button type="button" class="btn btn-default btn-sm">목록보기</button>
				</div>
			</div>
			<div class="col-md-6">
				<!-- 
				<div class="btn-group text-right">
					<button type="button" class="btn btn-default btn-sm">수정하기</button>
					<button type="button" class="btn btn-default btn-sm">삭제하기</button>
				</div>
				 -->
			</div>
		</div>

	</div>
	
	
<!-- </body> -->
<!-- </html> -->
</xsl:template>
</xsl:stylesheet>
