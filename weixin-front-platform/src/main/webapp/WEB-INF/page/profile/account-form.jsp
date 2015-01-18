<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="span12">
	<form action="${ctx}/profile/${empty account.id ? 'new' : 'edit'}-account/save" class="form-horizontal">
		<input name="id" type="hidden" value="${account.id}">
		<div class="control-group">
			<label class="control-label" for="title">公众号名称</label>
			<div class="controls">
				<input type="text" id="title" name="title"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="weixinId">微信号</label>
			<div class="controls">
				<input type="text" id="weixinId" name="weixinId"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="appid">应用id</label>
			<div class="controls">
				<input type="text" id="appid" name="appid"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="appkey">应用密钥</label>
			<div class="controls">
				<input type="text" id="appkey" name="appkey"/>
			</div>
		</div>
		<div class="control-group">
			<div class="controls">
				<input type="submit" value="确定" class="btn"/>
			</div>
		</div>
	</form>
</div>