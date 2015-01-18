<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf8"/>
		<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1"/>
		<meta name="description" content=""/>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css" />
		<link rel="stylesheet" href="${cssPath}/css/login.css" />
		<script type="text/javascript" src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
		<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
		<script type="text/javascript">
		var ctx = '${ctx}';
		var imagePath = '${imagePath}';
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
	    <div id="login-bg-slide" class="carousel slide" data-ride="carousel">
	    	<ol class="carousel-indicators">
	    		<li data-target="#login-bg-slide" data-slide-to="0" class="active"></li>
	    		<li data-target="#login-bg-slide" data-slide-to="1"></li>
	    		<li data-target="#login-bg-slide" data-slide-to="2"></li>
	    	</ol>
	    	<div class="carousel-inner" role="listbox">
	    		<div class="item active">
	    			<div class="slide-bg"><img src="https://res.wx.qq.com/mpres/htmledition/images/bg/bg_login_banner_v51e5b3a.jpg"/></div>
	    			<div class="carousel-caption">
	    				<h3>第一张</h3>
	    				<p>第一张啊第一张啊第一张</p>
	    			</div>
	    		</div>
	    		<div class="item">
	    			<div class="slide-bg"><img src="https://res.wx.qq.com/mpres/htmledition/images/bg/bg_login_banner_v51e5b3a.jpg"/></div>
	    			<div class="carousel-caption">
	    				<h3>第二张</h3>
	    				<p>第二张啊第二张啊第二张</p>
	    			</div>
	    		</div>
	    		<div class="item">
	    			<div class="slide-bg"><img src="https://res.wx.qq.com/mpres/htmledition/images/bg/bg_login_banner_v51e5b3a.jpg"/></div>
	    			<div class="carousel-caption">
	    				<h3>第三张</h3>
	    				<p>第三张啊第三张啊第三张</p>
	    			</div>
	    		</div>
	    	</div>
	    	<div class="login-container">
	    	<div class="container">
	    		<div class="row">
	    			<div class="col-md-5 col-md-offset-7">
	    				<div class="login-panel">
	    					<h3>登录</h3>
	    					<form role="form" method="post" action="${ctx}/j_spring_security_check">
	    						<div class="form-group">
	    							<input type="text" class="form-control input-lg username" name="j_username" placeholder="邮箱/微信号/QQ号"/>
	    							<input type="password" class="form-control input-lg password" name="j_password" placeholder="密码"/>
	    						</div>
	    						<div class="login-help">
	    							<div class="pull-left">
	    								<div class="checkbox"><label><input type="checkbox"/>记住密码</label></div>
	    							</div>
	    							<div class="pull-right">
	    								<a class="login-forget-pwd" href="/cgi-bin/readtemplate?t=home/find_pwd_tmpl&amp;lang=zh_CN">无法登录？</a>
	    							</div>
	    						</div>
	    						<div class="form-group">
	    							<button type="submit" class="login-btn btn btn-success">登    录</button>
	    						</div>
	    					</form>
	    				</div>
	    			</div>
	    		</div>
	    	</div>
	    	</div>
	    </div>
	</body>
</html>