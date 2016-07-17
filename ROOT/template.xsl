<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xml:space="preserve">

<!--  user customize -->
<xsl:variable name="title">Jbbs</xsl:variable>
<xsl:variable name="keyword">Jbbs</xsl:variable>
<xsl:variable name="author">jnk</xsl:variable>
<xsl:variable name="description">jnk bulletin board system</xsl:variable>

<xsl:template name="meta"><meta charset="utf-8" />
	<title><xsl:value-of select="$title" /></title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
	<meta name="apple-mobile-web-app-capable" content="yes" />
	<meta name="apple-mobile-web-app-status-bar-style" content="black" />
	<meta name="author" content="{$author}" />
	<meta name="keywords" content="{$keyword}" />
	<meta name="description" content="{$description}" /></xsl:template>

<xsl:template name="script">
	<script src="./js/jquery-1.12.4.min.js"></script>
	<script src="./js/bootstrap.min.js"></script>
	<script src="./js/jquery.i18n.properties.js"></script>
	
	<script src="./js/jnk-system.js"></script></xsl:template>


<xsl:template name="stylesheet">
	<link rel="stylesheet" href="./css/bootstrap.min.css" />
	<link rel="stylesheet" href="./css/bootstrap-theme.css" />
	<link rel="stylesheet" href="./css/system.css" /></xsl:template>


<!-- 
<xsl:variable name="portrait">
	<link type="text/css" rel="stylesheet" media="all and (orientation:portrait)" href="./css/system-portrait.css" />
</xsl:variable>
 -->


<xsl:template name="tinymce_script">
<script src="./tinymce/tinymce.min.js"></script></xsl:template>

<xsl:template name="tinymce_editor">

<script>tinymce.init({ selector:'textarea' });</script>
<textarea>ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ</textarea>
</xsl:template>

</xsl:stylesheet>