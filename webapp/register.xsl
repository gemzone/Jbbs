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
 
	<div xmlns="http://www.w3.org/1999/xhtml" style="padding:20px;">
		
		<div  class="form-horizontal" role="form">
			<div class="panel panel-default">
				<div class="panel-heading">Register</div>
				<div class="panel-body">
		
					<div class="form-group">
						<label class="control-label col-sm-2" for="user_id">ID</label>
						<div class="col-sm-5">
							<input type="text" class="form-control" id="user_id" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="pwd">Password</label>
						<div class="col-sm-4">
							<input type="password" class="form-control" id="pwd" />
						</div>
						
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-2" for="pwd_confirm">Pwd confirm</label>
						<div class="col-sm-4">
							<input type="password" class="form-control" id="pwd_confirm" />
						</div>
						
					</div>
					
					
					<div class="form-group">
						<label class="control-label col-sm-2" for="name">Name</label>
						<div class="col-sm-5">
							<input type="text" class="form-control" id="name" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="email">Email</label>
						<div class="col-sm-7">
							<input type="email" class="form-control" id="email" placeholder="email@address.com" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">Submit</button>
						</div>
					</div>
				</div>
			</div>
				
		
		</div>






	</div>


<!-- 
	
</body>
</html> -->
</xsl:template>
</xsl:stylesheet>
