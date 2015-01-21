<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf8"/>
		<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1"/>
		<meta name="description" content=""/>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<link rel="stylesheet" href="${cssPath}/css/bootstrap.css?${cssVersion}"/>
		<link rel="stylesheet" href="${cssPath}/css/bootstrap-responsive.css?${cssVersion}"/>
		<link rel="stylesheet" href="${cssPath}/css/styles.css?${cssVersion}"/>
		<link rel="stylesheet" href="${cssPath}/css/toastr.css?${cssVersion}"/>
		<link rel="stylesheet" href="${cssPath}/css/fullcalendar.css" />
		<script type="text/javascript" src="${jsPath}/js/jquery.min.js"></script>
		<script type="text/javascript" src="${jsPath}/js/bootstrap.js"></script>
		<%-- <script type="text/javascript" src="${jsPath}/js/jquery.form.js"></script> --%>
		<script type="text/javascript" src="${jsPath}/js/jquery.validate.js"></script>
		<script type="text/javascript" src="${jsPath}/js/jquery.form.js"></script>
		<script type="text/javascript" src="${jsPath}/js/shangtech-framework.js"></script>
		<script type="text/javascript">
		var ctx = '${ctx}';
		var imagePath = '${imagePath}';
		</script>
	</head>
	<body>
		<div class="id-nav">
			<div class="container">
				<div class="row">
					<div class="span12">
						<ul class="pull-right">
							<li>xxx，下午好。<a href="login.html">退出</a></li>
						</ul>
						<a id="logo" href="${ctx}/index">
							<h4>xxxx<strong>微信运营平台</strong></h4>
						</a>
					</div>
				</div>
			</div>
		</div>
		<div id="in-sub-nav">
			<div class="container">
				<div class="row">
					<div class="span12">
						<ul>
							<li>
								<a class="${menu eq 'home' ? 'active' : ''}" href="${ctx}/index"><i class="batch home"></i><br/>仪表盘</a>
							</li>
							<li>
								<a href="${ctx}/index"><i class="batch stream"></i><br/>微服务</a>
							</li>
							<li>
								<a href="${ctx}/index"><i class="batch plane"></i><br/>微应用</a>
							</li>
							<li>
								<a href="${ctx}/index"><i class="batch calendar"></i><br/>微营销</a>
							</li>
							<li>
								<a href="${ctx}/index"><i class="batch forms"></i><br/>数据统计</a>
							</li>
							<li>
								<a href="${ctx}/index"><i class="batch users"></i><br/>充值中心</a>
							</li>
							<li>
								<a class="${menu eq 'profile' ? 'active' : ''}" href="${ctx}/profile"><i class="batch settings"></i><br/>账户管理</a>
							</li>
							<li>
								<a href="${ctx}/index"><i class="batch quill"></i><br/>帮助中心</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		
		<div class="page">
			<div class="page-container">
				<div class="container">
					<div class="row">
						<t:insertAttribute name="menu"/>
						<t:insertAttribute name="content"/>
					</div>
				</div>
			</div>
		</div>
		
		<footer>
			<div class="container">
				<div class="row">
					<div class="span12">
						<p class="pull-right">Developed by shangtech</p>
						<p>© Copyright 2015 shangtech.net</p>
					</div>
				</div>
			</div>
		</footer>
		<script type="text/javascript">
		$(document).ready(function(){
			$('.carousel').carousel();
		});
		</script>
	</body>
</html>