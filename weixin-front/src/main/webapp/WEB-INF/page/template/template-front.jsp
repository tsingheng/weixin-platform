<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf8"/>
		<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1"/>
		<meta name="description" content=""/>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css" />
		<link rel="stylesheet" href="${ctx}/css/weixin-front.css" />
		<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
		<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
		<script type="text/javascript">
		var ctx = '${ctx}';
		</script>
	</head>
	<body>
		<div class="navbar navbar-static-top front-navbar-top" role="banner">
	    	<div class="container">
	    		<div class="navbar-header">
	    			
	    		</div>
	    		<div class="collapse navbar-collapse" role="navigation">
	    			<ul class="nav navbar-nav">
	    				<li><a href="#">菜单链接</a></li>
	    				<li><a href="#">菜单链接</a></li>
	    				<li><a href="#">菜单链接</a></li>
	    				<li><a href="#">菜单链接</a></li>
	    			</ul>
	    			<ul class="nav navbar-nav navbar-right">
	    				<li class="active"><a href="#">登录</a></li>
	    				<li><a href="#">注册</a></li>
	    			</ul>
	    		</div>
	    	</div>
	    </div>
	    <t:insertAttribute name="content"/>
	</body>
</html>