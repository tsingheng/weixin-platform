$(document).ready(function(){
	$('.submit').click(function(){
		if($(this).hasClass('disabled')){
			return;
		}
		$(this).addClass('disabled').val('正在提交');
		$(this).closest('form').ajaxSubmit({
			success: function(result){
				
			}
		});
	});
});